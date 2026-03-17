package day11;
class Parent1 {
    public  int getValue() {
        return 1;
    }
}

class Child1 extends Parent1 {
	@Override
    public int  getValue() {   
        return 18; 
    }
}

public class Practice {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		System.out.println(p.getValue());
	}
}
