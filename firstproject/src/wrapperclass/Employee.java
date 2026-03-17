package wrapperclass;

public class Employee {
	int id;
	String name;
	
	
	public Employee(int id , String name) {
		this.id = id;
		this.name = name;		
	}
	@Override
	public String toString() {
		return "Employee { id =" + this.id +"name =" + this.name +"}";
	}
	
	 
	@Override
	public boolean equals(Object obj) {
		System.out.println("hi");
		if(this == obj) {
			System.out.println("Both ref are same");
			return true;
		}
//		System.out.println(obj.getClass());
		System.out.println(this.getClass());
		if(obj == null || getClass() != obj.getClass()) {
			System.out.println("different reference or 2nd obj is null");
			return false;
		}
		Employee e = (Employee) obj;
		return this.id==e.id;
	}
}
