package otherproblem;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varArgs(1,2,3);

	}
	public static void varArgs(double...ds,char...cs ) {
		for(double i:ds) {
			System.out.println(i);
		}
	}

}

