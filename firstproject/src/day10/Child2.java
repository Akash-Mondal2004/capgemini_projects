package day10;

public class Child2 implements Parent {
	int c1 = 30;
	public void cm1() {
		System.out.println("child method");
	}
	@Override
	public void parentAbstractMethod() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'parentAbstractMethod'");
	}
}
