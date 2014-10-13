package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class InitialDatabaseSetup.
 */
public class InitialDatabaseSetup {

    /** The connection. */
    private Connection connection;

    /** The statement. */
    private Statement statement;

    /** The prepared statement. */
    private PreparedStatement preparedStatement = null;

    /** The result set. */
    private ResultSet resultSet = null;

    /**  Set CONSTANTS. */
    private int STUDENT = 1;

    /** The admin. */
    private int ADMIN = 2;

    /** The merchant. */
    private int MERCHANT = 3;

    /** The standard amount. */
    private double STANDARD_AMOUNT = 1;

    /** The standard btc rate. */
    private double STANDARD_BTC_RATE = 3339;

    /**
     * Instantiates a new initial database setup.
     *
     * @param connection the connection
     */
    public InitialDatabaseSetup(Connection connection) {
        this.connection = connection;
    }

    //Reset ALL tables to initial setup
    /**
     * Reset all tables.
     */
    public void resetAllTables() {
        this.resetUserTypes();
        this.resetAccountTypes();
        this.resetAccount();
        this.resetUser();
        this.addAdminUser();
        this.setBtcRate();
    }

    /**
     *  Truncs the UserType table, and adds the initial rows.
     */
    private void resetUserTypes() {
        try {
            this.debugTruncateTable("UserType");

            /** And now we insert the user types */
            preparedStatement = connection
                    .prepareStatement("INSERT INTO UserType (userTypeName) VALUES (?), (?), (?)");
            preparedStatement.setString(1, "Student");
            preparedStatement.setString(2, "Admin");
            preparedStatement.setString(3, "Merchant");
            preparedStatement.executeUpdate();
            System.out.println("UserTypes reset");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Truncs the AccountType table, and adds the initial rows. */
    private void resetAccountTypes() {
        try {
            this.debugTruncateTable("AccountType");

            /** And now we insert the account types */
            preparedStatement = connection
                    .prepareStatement("INSERT INTO AccountType (accountName) VALUES (?), (?)");
            preparedStatement.setString(1, "Student");
            preparedStatement.setString(2, "Merchant");
            preparedStatement.executeUpdate();
            System.out.println("AccountTypes reset");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *  Truncs the User table, and adds the initial rows.
     */
    private void resetUser() {
        /** Truncate user table */
        this.debugTruncateTable("User");

        /** Add users and linked accounts */
        int userId = this.addUser(STUDENT, "dafr13ab@student.cbs.dk", "Daniel",
                "123456");
        System.out.println("Added user with ID: " + userId);
        this.addAccount(userId, STUDENT, STANDARD_AMOUNT);
        System.out.println("Added account to user with ID: " + userId);
        userId = this.addUser(STUDENT, "mape13an@student.cbs.dk", "Marie",
                "123456");
        System.out.println("Added user with ID: " + userId);
        this.addAccount(userId, STUDENT, STANDARD_AMOUNT);
        System.out.println("Added account to user with ID: " + userId);
        userId = this.addUser(STUDENT, "mani13an@student.cbs.dk", "Mads",
                "123456");
        System.out.println("Added user with ID: " + userId);
        this.addAccount(userId, STUDENT, STANDARD_AMOUNT);
        System.out.println("Added account to user with ID: " + userId);
    }

    /**
     *  Simple method to trunc a table. Only for debugging purpose.
     *
     * @param tableName the table name
     */
    private void debugTruncateTable(String tableName) {
        try {
            /**
             * Truncate table. We reset the FOREIGN_KEY_CHECKS to zero before query,
             * which is bad practice for production, but is good for debugging
             * purpose.
             */
            String truncateQuery = "TRUNCATE " + tableName;

            preparedStatement = connection
                    .prepareStatement("SET FOREIGN_KEY_CHECKS=0;");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(truncateQuery);
            preparedStatement.executeUpdate();
            preparedStatement = connection
                    .prepareStatement("SET FOREIGN_KEY_CHECKS=1;");
            preparedStatement.executeUpdate();
            System.out.println("Truncated " + tableName);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *  Adds a user to the user table. Returns the inserted users ID.
     *
     * @param userType the user type
     * @param email the email
     * @param name the name
     * @param password the password
     * @return the int
     */
    public int addUser(int userType, String email, String name, String password) {
        try {
            /** Insert user */
            preparedStatement = connection
                    .prepareStatement(
                            "INSERT INTO User (userType, email, name, password) VALUES (?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, userType);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, name);
            preparedStatement.setString(4, password);
            preparedStatement.executeUpdate();

            ResultSet keys = preparedStatement.getGeneratedKeys();
            keys.next();
            int userId = keys.getInt(1);

            return userId;

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     *  Add an account to the Account table.
     *
     * @param userId the user id
     * @param accountType the account type
     * @param amount the amount
     */
    public void addAccount(int userId, int accountType, double amount) {
        try {
            /** Insert account */
            preparedStatement = connection
                    .prepareStatement(
                            "INSERT INTO Account (user_id, accountType, amount) VALUES (?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, userId);
            preparedStatement.setInt(2, accountType);
            preparedStatement.setDouble(3, amount);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reset account.
     */
    public void resetAccount() {
        this.debugTruncateTable("Account");
    }

    /**
     * Adds the admin user.
     */
    public void addAdminUser() {
        try {
            /** Insert admin */
            preparedStatement = connection
                    .prepareStatement(
                            "INSERT INTO User (userType, email, name, password) VALUES (?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, ADMIN);
            preparedStatement.setString(2, "88888888");
            preparedStatement.setString(3, "Administrator");
            preparedStatement.setString(4, "1234abcd");
            preparedStatement.executeUpdate();
            System.out.println("Added administrator");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the btc rate.
     */
    public void setBtcRate() {
        try {
            /** Insert account */
            preparedStatement = connection
                    .prepareStatement(
                            "INSERT INTO Exchange (btc_rate) VALUES (?)",
                            Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDouble(1, STANDARD_BTC_RATE);
            preparedStatement.executeUpdate();
            System.out.println("Reset the BTC rate");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}