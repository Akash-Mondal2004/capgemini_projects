package inheritance.pack2;

import inheritance.pack1.Parent;

public class Child extends  Parent {
	int y = 10;
	@Override
	public void show() {
		System.out.println("hei ");
	}
	public void show2() {
		System.out.println("hello from child");
	}
	
}
