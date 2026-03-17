package functional_interface;

import java.util.function.Function;

interface Draw{
	void circle();
}
public class Lunch {

	public static void main(String[] args) {
//		Draw d = () -> {System.out.println("C1 draw");};
//		d.circle();
		Function<String, Integer> f = (String s) -> s.length();
		System.out.println(f.apply("Hello word"));
	}
	
}
