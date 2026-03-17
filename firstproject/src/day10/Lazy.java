package day10;

public class Lazy {
	 private static final Lazy obj = new Lazy();

	    private Lazy() { }

	    public static Lazy lazyFactory() {
	        return obj;
	    }
}
