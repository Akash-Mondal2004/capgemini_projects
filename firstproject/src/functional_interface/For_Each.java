package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class For_Each {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,2,3,4,6);
		Consumer<Integer> c = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t+"hio");
				
			}
		};
		l.forEach(c);
		
		l.forEach(t->System.out.println(t));
		l.forEach(System.out::print);
		System.out.println("hoi");

		Stream<Integer> s = l.stream().filter(n ->  n%2==0).sorted().map(n-> n*2);
//		s.collect(null)
		s.collect(Collectors.toSet()).forEach(System.out::println);
	}
}
