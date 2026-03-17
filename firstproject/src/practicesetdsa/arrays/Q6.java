package practicesetdsa.arrays;
//Find length without using length()
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Akash";
		int len = 0;
		int i = 0;
		while(true) {
			try {
				str.charAt(i);
				i++;
			}catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
				break;
				
			}
		}
		System.out.println(i);

	}

}
