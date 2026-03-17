package com.jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Akash@8972"; 
		try {
			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the id no to extract");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
//			PreparedStatement ps = con.prepareStatement("Select * from Student where id =?");
//			ps.setInt(1, id);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()) {
//				System.out.println(
//						rs.getInt(1) + "\t" +
//		                        rs.getString(2) + "\t" +
//		                        rs.getInt(3) + "\t" +
//		                        rs.getInt(4) + "\t" +
//		                        rs.getString(5)
//						);
//			}
//			PreparedStatement ps2 = con.prepareStatement(
//				    "INSERT INTO student (name, age, standard, email) VALUES (?, ?, ?, ?)"
//				)
			PreparedStatement ps = con.prepareStatement(
				    "INSERT INTO student (name, age, standard, email) VALUES (?, ?, ?, ?)"
				);

				ps.setString(1, "Rohan");
				ps.setInt(2, 20);
				ps.setInt(3, 12);
				ps.setString(4, "rohan@gmail.com");

				int rows = ps.executeUpdate();
				System.out.println("Rows inserted: " + rows);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
