package day10;

public class Driver {
	public static void main(String[] args) {
//		Parent p = new Child();
//		
//		System.out.println(p.p);
//		p.pm();
//		Child  c= (Child) p;
//		System.out.println(c.c);
//		c.cm();
//		Child p1 =(Child) new Parent();
//		System.out.println(p1.c);
//		Child c = new Child();
//		System.out.println(c);
//		Parent p = c;
//		System.out.println(p);
//		Child c1 = (Child) p;
//		System.out.println(c1);
//		
//		Child2 ch1 = new Child2();
////		System.out.println(c);
//		Parent pa = ch1;
//		System.out.println(pa);
//		Child c2 = (Child) pa;
//		System.out.println(c2.c);
//		c2.cm();
		
		Child obj = new Child();
		System.out.println(obj.X);
		Parent.parentStaticMethod();
//		obj.
//        // ✅ accessing abstract method via object
//        obj.parentAbstractMethod();
//
//        // ✅ accessing child's own method
//        obj.childMethod();
//
//        // ❌ NOT allowed (compile-time error)
//        // obj.parentStaticMethod();
//
//        // ✅ correct way to access static method of interface
//        Parent.parentStaticMethod();
//
//        // ✅ accessing static final variable
//        System.out.println(Parent.X);
//
//        // ❌ NOT allowed
//        // obj.X = 20;  // cannot assign a value to final variable
		

		
		
		
		
	}
}
