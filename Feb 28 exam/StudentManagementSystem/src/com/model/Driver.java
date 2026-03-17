package com.model;

import java.sql.*;
import java.util.*;

import com.credentials.Credentials;

public class Driver {
	public static void insertStudent(Scanner sc) throws SQLException {
		System.out.println("Enter student id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student name: ");
		String name = sc.nextLine();
		System.out.println("Enter student marks: ");
		double marks = sc.nextDouble();
		
		 String sql = "INSERT INTO Student (id, name, marks) VALUES (?, ?, ?)";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, id);
         ps.setString(2, name);
         ps.setDouble(3, marks);
         int rows = ps.executeUpdate();
         if (rows > 0)
             System.out.println("Student Added Successfully!");

         ps.close();
	}
	public static void updateStudent(Scanner sc) throws SQLException {
	        System.out.println("Enter student id to update:");
	        int id = sc.nextInt();
	        sc.nextLine(); 
	        System.out.println("1. Update marks");
	        System.out.println("2. Update name");
	        System.out.println("3. Update marks and name");
	        int choice = sc.nextInt();
	        sc.nextLine();
	        PreparedStatement ps = null;
	        String sql = "";
	        switch (choice) {
	            case 1:
	                sql = "UPDATE Student SET marks = ? WHERE id = ?";
	                ps = con.prepareStatement(sql);
	                System.out.print("Enter new marks: ");
	                double marks = sc.nextDouble();
	                ps.setDouble(1, marks);
	                ps.setInt(2, id);
	                break;

	            case 2:
	                sql = "UPDATE Student SET name = ? WHERE id = ?";
	                ps = con.prepareStatement(sql);
	                System.out.print("Enter new name: ");
	                String name = sc.nextLine();
	                ps.setString(1, name);
	                ps.setInt(2, id);
	                break;

	            case 3:
	                sql = "UPDATE Student SET name = ?, marks = ? WHERE id = ?";
	                ps = con.prepareStatement(sql);
	                System.out.print("Enter new name: ");
	                String newName = sc.nextLine();
	                System.out.print("Enter new marks: ");
	                double newMarks = sc.nextDouble();

	                ps.setString(1, newName);
	                ps.setDouble(2, newMarks);
	                ps.setInt(3, id);
	                break;

	            default:
	                System.out.println("Invalid choice!");
	                return;
	        }

	        int rows = ps.executeUpdate();

	        if (rows > 0)
	            System.out.println("Student Updated Successfully!");
	        else
	            System.out.println("Student Not Found!");

	        ps.close();

	    
	}
	public static void deleteStudent(Scanner sc) throws SQLException {
		String sql = "DELETE FROM Student WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        System.out.print("Enter Student ID to Delete: ");
        ps.setInt(1, sc.nextInt());
        int rows = ps.executeUpdate();
        if (rows > 0)
            System.out.println("Student Deleted Successfully!");
        else
            System.out.println("Student Not Found!");

        ps.close();
	}
	
	public static void fetchStudents() throws SQLException {
		String sql = "SELECT * FROM Student";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        System.out.println("\nID\tName\tMarks");
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getDouble("marks")
            );
        }
        rs.close();
        ps.close();
	}
	
	static final String url = Credentials.getUrl();
	static final String password = Credentials.getPassword();
	static final String user = Credentials.getUser();
	static Connection con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Database connected successfully");
			System.out.println("---Welcome to Student management system ---");
			while(true) {
				System.out.println("1. Add Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. View All Students");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                
                int choice = sc.nextInt();
                switch(choice) {
                case 1:
                	insertStudent(sc);
                    break;
                case 2:
                    updateStudent(sc);
                    break;
                case 3:
                    deleteStudent(sc);
                    break;
                case 4:
                    fetchStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    con.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                }
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
