/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

//Melakukan Import library untuk koneksi database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    Connection connect_1301204018; //Membuat Variable Connection
    public DBConnection() throws SQLException{ //Melakukan Proses Try and Catch untuk mengantisipasi adanya error saat run
        try{
            String driver = "com.mysql.jbdc.Driver"; //Memasukan nilai Driver dengan nama Driver SQL database nya
            String url = "jdbc:mysql://localhost:3306/tubespbo"; //Memasukan nilai url dengan url dari database nya
            String username = "root"; //Nilai Username merupakan username dari sql database
            String password = ""; //Memasukkan nilai password apabila sql database kita menggunakan password
            System.setProperty(driver, " "); //Melakukan setProperty dengan didalam nya ada driver
            
            connect_1301204018 = DriverManager.getConnection(url,username,password);
        }
        catch(SQLException e){ //Catch untuk menangani apabila ada error saat mengakses SQL nya
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){ //Fungsi connection untuk mendapatkan koneksi
        return connect_1301204018;
    }
}
