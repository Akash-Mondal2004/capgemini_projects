package day5;

public class User {
	String name;
	String password;
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	String address;
	public User(String name, String password, String address) {
		this(name,password);
		this.address = address;
	}
	
	
}
