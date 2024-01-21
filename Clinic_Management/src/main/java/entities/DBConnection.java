package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//THIS CLASS IS USED TO RETURN THE DRIVER CONNECTING THE MYSQL DATABASE

public class DBConnection {
    private static final String USERNAME = "fp510";
    private static final String PASSWORD = "510";
    private static final String CONN = "jdbc:mysql://www.papademas.net:3307/510fp?autoReconnect=true&useSSL=false";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
    }
}
