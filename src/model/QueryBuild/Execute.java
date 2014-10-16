package model.QueryBuild;

import model.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jesperbruun on 16/10/14.
 */
public class Execute extends Model {

    private final String SELECT = "SELECT ";
    private final String FROM = " FROM ";
    private final String WHERE = " WHERE ";

    private QueryBuilder queryBuilder;
    private Where where;

    public QueryBuilder getQueryBuilder() {
        return queryBuilder;
    }

    public Where getWhere() {
        return where;
    }

    public Execute(QueryBuilder queryBuilder, Where where){
        this.queryBuilder = queryBuilder;
        this.where = where;
    }

    public ResultSet getResultSet() throws SQLException{
        setSelectedDatabase("cbscalendar");

        String sql = "";
        if(getWhere() == null){
             sql = SELECT + getQueryBuilder().getSelectValue() + FROM + getQueryBuilder().getTableName() + ";";
            try {
                getConnection();
                getConn();
                sqlStatement = getConn().prepareStatement(sql);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            sql = SELECT + getQueryBuilder().getSelectValue() +
                    FROM + getQueryBuilder().getTableName() +
                    WHERE + getWhere().getWhereKey() + " " + getWhere().getWhereOperator() + " ?;";
            try {
                getConnection();
                getConn();
                sqlStatement = getConn().prepareStatement(sql);
                sqlStatement.setString(1, getWhere().getWhereValue());

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sqlStatement.executeQuery();
    }

    public ResultSet ExecuteQuery(){

    }


    public String toString(){
        return SELECT + getQueryBuilder().getSelectValue() +
                FROM + getQueryBuilder().getTableName() +
                WHERE + getWhere().getWhereKey() + " " + getWhere().getWhereOperator() + " ?";
    }

}
