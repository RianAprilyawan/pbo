/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KONEKSI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Si Ohhooo
 */
public class KONEKSI {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
         String url="jdbc:mysql://localhost:3306/rental mobil" ; //url database
         String user = "root"; // user database
         String pass = " ";   //password database
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         mysqlconfig = DriverManager.getConnection(url,user,pass);
         
        }catch(SQLException e){
                System.out.println("KONEKSI Gagal "+ e.getMessage()); //perintah untuk menampilkan eror
                
    }
        return mysqlconfig;
    }

}
