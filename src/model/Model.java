package model;

import com.ibatis.common.jdbc.ScriptRunner;
import config.Configurations;

import java.io.*;
import java.sql.*;


/**
 * model.Model superclass, never instansiated. All child model classes inherits its properties, classes and methods */
public abstract class Model {

    private static Configurations cf = new Configurations();

    private static String sqlUrl = "jdbc:mysql://" + cf.getHost() + ":" + cf.getPort() + "/";
    private static String sqlUser = cf.getUsername();
    private static String sqlPasswd = cf.getPassword();
    private static String dbName = cf.getDbname();
    
    private Statement stmt;
    protected Connection conn = null;
    protected PreparedStatement sqlStatement;
    protected ResultSet resultSet;

    /**
     * Overwrite default database url
     *
     * @param
     */
    public static void setSelectedDatabase(String db) {
        if (db != null && db.length() > 0) { //Overwrite default
            sqlUrl += db;
        }
    }


    public boolean doesDatabaseExist() throws SQLException {
        getConnection(true);
        ResultSet resultSet = getConn().getMetaData().getCatalogs();
        while (resultSet.next()) {
            String databaseName = resultSet.getString(1);
            System.out.println(databaseName);
            if(databaseName.equals(dbName)){
                return true;
            }
        }
        resultSet.close();
        return false;
    }

    /**
     * Reads and executes SQL from File.
     *
     * @param filepath
     * @throws java.io.IOException
     * @throws java.sql.SQLException
     */
    protected void readfromSqlFile(String filepath) throws IOException, SQLException {
        getConnection(true);
        ScriptRunner runner = new ScriptRunner(getConn(), false, false);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filepath));
        runner.runScript(reader);
        reader.close();
        conn.close();
    }

    /**
     * Use a preparedstatment to run SQL on the database
     *
     * @param sql
     * @return PreparedStatement
     */
    public PreparedStatement doQuery(String sql) {
        try {
            getConnection(false);
            getConn();
            sqlStatement = getConn().prepareStatement(sql);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sqlStatement;
    }

    public boolean testConnection() {
        try {

            getConnection(false);

            if (getConn().isValid(5)) //5 seconds
                return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public int doUpdate(String update) throws SQLException {
        getConnection(false);
        int temp = 0;

        try {
            setStmt(getConn().createStatement());
            temp = getStmt().executeUpdate(update);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //luk forbindelser
        finally {
            if (getStmt() != null) {
                try {
                    getStmt().close();
                } catch (SQLException sqlEx) {  //ignore
                    setStmt(null);
                }
            }
        }

        return temp;
    }


    public String readFromFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return "";
    }

    /**
     * Getter-method for Connection-class
     *
     * @throws java.sql.SQLException
     */
    public void getConnection(Boolean init) throws SQLException {
    	if(init) {
    		setConn(DriverManager.getConnection(sqlUrl, sqlUser, sqlPasswd));
    	}else{
    		setConn(DriverManager.getConnection(sqlUrl+"/"+dbName, sqlUser, sqlPasswd));
    	}
    }

    /**
     * Getter-method for Statement class
     *
     * @return statement class
     */
    public Statement getStmt() {
        return stmt;
    }

    /**
     * Setter-method for Statement class
     *
     * @param stmt object
     */
    private void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    /**
     * Getter-method for Connection class
     *
     * @return Connection class
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * Setter-method for Connection class
     *
     * @param conn
     */
    private void setConn(Connection conn) {
        this.conn = conn;
    }


}
