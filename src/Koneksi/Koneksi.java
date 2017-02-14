/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Smktelkom
 */
public class Koneksi {
    static class con {

        static Statement createStatement() {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        public con() {
        }
    }
    public Connection connection;

    public Koneksi(){
        try{
            Object newInstance = Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection=DriverManager.getConnection("jdbc:mysql://localhost/db_atm","root","");


        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Koneksi - " + e.getMessage());

        }
    }

     public static void main(String[] args) {
     Koneksi k = new Koneksi();
    }
}
