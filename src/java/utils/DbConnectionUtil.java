package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {

    private String dbUrl = "jdbc:mysql://localhost:3306/shop_application";
    private String userName = "root";
    private String dbPassword = "159753248650";

    Connection conn;
    {
        try {
            conn = DriverManager.getConnection(dbUrl, userName, dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public DbConnectionUtil() {}

    public Connection getConnection() {
        return conn;
    }
}
