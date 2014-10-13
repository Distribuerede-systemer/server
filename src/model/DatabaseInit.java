package model;

import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DatabaseInit extends Model {

    //Test main method
    public static void main(String[] args) throws IOException, SQLException {
        new DatabaseInit().go();
    }


    public void go() throws SQLException, IOException {

        if (doesDatabaseExist()) {
            System.out.print("Database environment does exist");
        } else {
            System.out.print("Database environment does NOT exist");
            readfromSqlFile("res/createDBscript.sql");
        }

    }


}
