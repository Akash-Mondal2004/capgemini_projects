package day9;
class A{
	public A() {
		System.out.println("A constructor");
	}
	public A(int i ) {
		System.out.println("A i constructor");
	}
}

public class Child extends A{

	public Child() {
		System.out.println("C constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();

	}

}
