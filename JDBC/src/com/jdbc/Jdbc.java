package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Akash@8972"; 
        try {
            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully!");

            // Create statement
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "\t" +
                        rs.getString(2) + "\t" +
                        rs.getInt(3) + "\t" +
                        rs.getInt(4) + "\t" +
                        rs.getString(5)
                );
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
