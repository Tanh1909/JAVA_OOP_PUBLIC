package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    public static Connection connection;
    private static String url="jdbc:mysql://localhost:3306/jdbc";
    private static String username="root";
    private static String password="12345678900";

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection connection(){
        return connection;
    }
}
