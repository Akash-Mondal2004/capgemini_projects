package recursion;

public class Printstar {

//	static int count = 0;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		starprint(5);
//	}
////	public static void starprint(int n) {
////		System.out.println("*");
////		if(--n ==0) {
////			return;
////		}
////		starprint(n);
////	}
//	public static void starprint(int n) {
//		System.out.println(++count);
//		starprint(n);
//		
//	}

//	static {
//		System.out.println("hi");
	
//	}
	int  i = 7;
	
	{
		System.out.println("“from non static block()”");
//	System.out.println(“from non static block()”);
	}
	public void  nonstaticmethod(){
	System.out.println("“From non static method()”");
	}
//	Public Printstar(){
//	System.out.println("“from constructor()”");;
//	}

	public static void main(String[] args) {
		Printstar p = new Printstar();
	}
}
