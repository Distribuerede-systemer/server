package model.QueryBuild;

import model.Model;
import org.apache.commons.lang.StringEscapeUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jesperbruun on 16/10/14.
 */
public class Execute extends Model {

    private final String SELECT = "SELECT ";
    private final String FROM = " FROM ";
    private final String WHERE = " WHERE ";
    private final String INSERTINTO = "INSERT INTO ";
    private final String UPDATE = "UPDATE ";
    private final String VALUES = " VALUES ";

    private QueryBuilder queryBuilder;
    private Where where;
    private Values values;
    private boolean getAll = false;

    protected QueryBuilder getQueryBuilder() {
        return queryBuilder;
    }

    protected Where getWhere() {
        return where;
    }

    protected Values getValues() {
        return values;
    }

    protected boolean isGetAll() {
        return getAll;
    }

    public Execute(QueryBuilder queryBuilder, boolean getAll) {
        this.queryBuilder = queryBuilder;
        this.getAll = getAll;
    }

    public Execute(QueryBuilder queryBuilder, Where where) {
        this.queryBuilder = queryBuilder;
        this.where = where;
    }

    public Execute(QueryBuilder queryBuilder, Values values) {
        this.queryBuilder = queryBuilder;
        this.values = values;
    }

    /**
     * Execute SQL and returns ResultSet.
     * @return ResultSet
     * @throws SQLException
     */
    public ResultSet ExecuteQuery() throws SQLException {
        String sql = "";
        if (isGetAll()) {
            sql = SELECT + getQueryBuilder().getSelectValue() + FROM + getQueryBuilder().getTableName() + ";";
            try {
                getConnection(false);
                getConn();
                String cleanSql = StringEscapeUtils.escapeSql(sql);
                sqlStatement = getConn().prepareStatement(cleanSql);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            sql = SELECT + getQueryBuilder().getSelectValue() +
                    FROM + getQueryBuilder().getTableName() +
                    WHERE + getWhere().getWhereKey() + " " + getWhere().getWhereOperator() + " ?;";
            try {
                getConnection(false);
                getConn();
                String cleanSql = StringEscapeUtils.escapeSql(sql);
                sqlStatement = getConn().prepareStatement(cleanSql);
                sqlStatement.setString(1, getWhere().getWhereValue());

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sqlStatement.executeQuery();
    }


    /**
     * Execute SQL Query. <strong>OBS nothing returns.</strong>
     * @return
     * @throws SQLException
     */
    public boolean Execute() throws SQLException {
        String sql = "";

        if (getQueryBuilder().isSoftDelete()) {
            sql = UPDATE + getQueryBuilder().getTableName() + " SET active = 0" +
                    WHERE + getWhere().getWhereKey() + " " + getWhere().getWhereOperator() + " " + getWhere().getWhereValue() + ";  ";
            try {
                getConnection(false);
                getConn();
                String cleanSql = StringEscapeUtils.escapeSql(sql);
                sqlStatement = getConn().prepareStatement(cleanSql);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if(getQueryBuilder().isUpdate()) {
            sql = UPDATE + getQueryBuilder().getTableName() + " SET " + getQueryBuilder().getFields() + "" + WHERE + getWhere().getWhereKey() + " " + getWhere().getWhereOperator() + " ?;";
            try {
                getConnection(false);
                getConn();
                String cleanSql = StringEscapeUtils.escapeSql(sql);
                sqlStatement = getConn().prepareStatement(cleanSql);
                sqlStatement.setString(1, getWhere().getWhereValue());

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(sql);
            
            sql = INSERTINTO + getQueryBuilder().getTableName() + " (" + getQueryBuilder().getFields() + ")" + VALUES + "(";
            StringBuilder sb = new StringBuilder();
            for (String n : getValues().getValues()) {
                if (sb.length() > 0) sb.append(',');
                sb.append(" ?");
            }
            sql += sb.toString();
            sql += " );";
            try {
                getConnection(false);
                getConn();
                String cleanSql = StringEscapeUtils.escapeSql(sql);
                sqlStatement = getConn().prepareStatement(cleanSql);
                int x = 0;
                for (int i = 0; i < getValues().getValues().length; i++) {
                    x = i;
                    sqlStatement.setString(x+1, getValues().getValues()[i]);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return sqlStatement.execute();
    }


}
