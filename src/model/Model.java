package model;


import java.sql.*;

/**
 * Model superclass, never instansiated. All child model classes inherits its properties, classes and methods
 * Created by jesperbruun on 13/10/14.
 */
public  class Model {

    private static String sqlUrl = "jdbc:mysql://localhost:3306/";
    private static String sqlUser = "root";
    private static String sqlPasswd = "looser";

    private Statement stmt;
    private Connection conn = null;
    protected PreparedStatement sqlStatement;

    /**
     * Overwrite default database url
     * @param
     */
    public static void setSelectedDatabase(String db){
        if(db != null && db.length() > 0){ //Overwrite default
            sqlUrl += db;
        }
    }

    /**
     * Use a preparedstatment to run SQL on the database
     * @param sql
     * @return PreparedStatement
     */
    public PreparedStatement doQuery(String sql){
        try {
            getConnection();
            getConn();
            sqlStatement = getConn().prepareStatement(sql);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sqlStatement;
    }
    public boolean testConnection(){
        try {

            getConnection();

            if(getConn().isValid(5)) //5 seconds
                return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
    
    public int doUpdate(String update) throws SQLException {
        getConnection();
        int temp = 0;

        try{
            setStmt(getConn().createStatement());
            temp = getStmt().executeUpdate(update);
        }

        catch(SQLException ex) {
            ex.printStackTrace();
        }

        //luk forbindelser
        finally{
            if(getStmt()!=null) {
                try {
                    getStmt().close();
                }

                catch (SQLException sqlEx) {  //ignore
                    setStmt(null);
                }
            }
        }

        return temp;
    }


    /**
     * Getter-method for Connection-class
     * @throws SQLException
     */
    private void getConnection() throws SQLException {
        setConn(DriverManager.getConnection(sqlUrl, sqlUser, sqlPasswd));
    }

    /**
     * Getter-method for Statement class
     * @return statement class
     */
    public Statement getStmt() {
        return stmt;
    }

    /**
     * Setter-method for Statement class
     * @param stmt object
     */
    private void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    /**
     * Getter-method for Connection class
     * @return Connection class
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * Setter-method for Connection class
     * @param conn
     */
    private void setConn(Connection conn) {
        this.conn = conn;
    }
    
    

}
