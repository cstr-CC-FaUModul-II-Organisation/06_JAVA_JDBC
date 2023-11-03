package com.cc.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    public static void main(String[] args) {

       String conURL = "jdbc:mysql://3.79.148.212:55548/mydb";
       String usrStr = "peter";
       String usrPwd = "abcd1234#";

      try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            
            try (Connection con = DriverManager.getConnection(conURL, usrStr, usrPwd)) {
                System.out.println("Success!");
                con.close();
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }


    }
}


