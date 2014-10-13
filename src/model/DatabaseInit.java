package model;

import java.io.IOException;
import java.sql.SQLException;

public class DatabaseInit extends Model {

    //Test main method
    public static void main(String[] args) throws IOException, SQLException {
        new DatabaseInit().go();
    }

    public void go() throws IOException, SQLException {


        /**
         * Read and execute SQL from file
         */
        readfromSqlFile("res/createDBscript.sql");


    }


}
