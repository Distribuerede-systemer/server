package model;

import java.sql.SQLException;

public class DatabaseInit extends Model {


    public static void main(String[] args) {
        DatabaseInit db = new DatabaseInit();
        db.go();
    }

    public void go() {

        //String checkSQL = "SET SESSION FOREIGN_KEY_CHECKS=0;";

        String locationdata = "CREATE TABLE locationdata" +
                "(" +
                "locationdataid int NOT NULL AUTO_INCREMENT," +
                "longitude int NOT NULL," +
                "latitude int UNIQUE," +
                "PRIMARY KEY (locationdataid)" +
                ");";

        String roles = "CREATE TABLE roles ("
                + "roleid int NOT NULL AUTO_INCREMENT,"
                + "userid int NOT NULL,"
                + "type varchar(200) NOT NULL,"
                + "PRIMARY KEY (roleid)"
                + ");";

        String users = "CREATE TABLE users("
                + "userid int NOT NULL AUTO_INCREMENT,"
                + "email varchar(40) NOT NULL,"
                + "active boolean,"
                + "created datetime,"
                + "PRIMARY KEY (userid)"
                + ");";

        String userevents = "CREATE TABLE userevents("
                + "userid int NOT NULL,"
                + "eventid int NOT NULL"
                + ");";


        String notes = "CREATE TABLE notes"
                + "("
                + "noteid int NOT NULL AUTO_INCREMENT,"
                + "eventid int NOT NULL,"
                + "createdby int NOT NULL,"
                + "text text,"
                + "created datetime NOT NULL,"
                + "PRIMARY KEY (noteid)"
                + ");";

        String events = "CREATE TABLE events ("
                + "eventid int NOT NULL AUTO_INCREMENT,"
                + "type int NOT NULL,"
                + "location int,"
                + "createdby int NOT NULL,"
                + "start datetime NOT NULL,"
                + "end datetime NOT NULL,"
                + "name varchar(0) NOT NULL,"
                + "text text NOT NULL,"
                + "PRIMARY KEY (eventid)"
                + ");";

        String dailyupdate = "CREATE TABLE dailyupdate("
                + "date datetime NOT NULL UNIQUE,"
                + "apparentTemperature double,"
                + "summary text,"
                + "windspeed double,"
                + "qotd varchar(512),"
                + "PRIMARY KEY (date)"
                + ");";
        String setupDB = "CREATE DATABASE testserver";

        try {

            setSelectedDatabase("testserver");


            //doUpdate(checkSQL);
            doUpdate(locationdata);
            doUpdate(roles);
            doUpdate(users);
            doUpdate(userevents);
            doUpdate(notes);
            doUpdate(events);
            doUpdate(dailyupdate);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
