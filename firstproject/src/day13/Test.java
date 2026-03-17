package day13;
class Employee implements Cloneable{
	int id;
	public Employee(int id ) {
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Test{
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee e1= new Employee(100);
		Employee e2 = (Employee)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		
	}
	
}
