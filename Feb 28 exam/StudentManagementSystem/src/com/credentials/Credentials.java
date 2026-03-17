package com.credentials;

public class Credentials {
	 private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
	 private static final String USER = "root";
	 private static final String PASSWORD = "Akash@8972";
	public static String getUrl() {
		return URL;
	}
	public static String getUser() {
		return USER;
	}
	public static String getPassword() {
		return PASSWORD;
	}
	 
	 
}
