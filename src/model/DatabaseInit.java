package model;

import java.sql.SQLException;

/**
 * Created by jesperbruun on 13/10/14.
 */
public class DatabaseInit extends Model{


    public static void main(String[] args){
        DatabaseInit db = new DatabaseInit();
        db.go();
    }

    public void go(){

        String sql = "CREATE TABLE locationdata" +
                    "(" +
                    "locationdataid int NOT NULL AUTO_INCREMENT," +
                    "longitude int NOT NULL," +
                    "latitude int UNIQUE," +
                    "PRIMARY KEY (locationdataid)" +
                    ");";

        try {
            doUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
