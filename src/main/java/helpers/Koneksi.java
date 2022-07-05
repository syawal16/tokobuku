package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class Koneksi {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.Driver");
            System.out.println("Connecting..");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/penjualan_buku",
                    "root",
                    "");
           System.out.println("Conenected!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
