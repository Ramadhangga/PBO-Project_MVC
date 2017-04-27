/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Angga
 */
public class file_koneksi {
    private static Connection koneksi;
    public static Connection GetConnection() throws SQLException
    {
        if (koneksi == null) {
            Driver driver = new Driver();
            koneksi    =         (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/toko?zeroDateTimeBehavior=convertToNull", "root", "");

        }return koneksi;
    }
}
