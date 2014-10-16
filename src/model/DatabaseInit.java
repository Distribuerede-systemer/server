package model;

import model.QueryBuild.QueryBuilder;

import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DatabaseInit extends Model {

    //Test main method
    public static void main(String[] args) throws IOException, SQLException {
        new DatabaseInit().go();
    }


    public void go() throws SQLException, IOException {

        QueryBuilder queryBuilder = new QueryBuilder();


        String[] keys = {"firstKey", "secondKey"};
        String[] wheremparamters = {"alder", "hat"};
        QueryBuilder qb = new QueryBuilder();


        while (resultSet.next()){
            System.out.println(resultSet.getString("email"));
        }
        resultSet.close();

        if (doesDatabaseExist()) {
            System.out.print("Database environment does exist");
        } else {
            System.out.print("Database environment does NOT exist");
            readfromSqlFile("res/createDBscript.sql");
        }

    }


}
