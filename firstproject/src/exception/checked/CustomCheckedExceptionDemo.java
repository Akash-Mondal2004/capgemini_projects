package exception.checked;

public class CustomCheckedExceptionDemo {
	public static Permit validateAge(int age) throws InvalidAgeException, RandomException{
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 ");
		}else if(age<21) {
			return Permit.SOFT;
//			throw new RandomException("randomexception");
		}else {
			return Permit.HARD;
		}
	}
	public static void main(String[] args) {
		try {
			Permit p = validateAge(20);
			 System.out.println("Permit Type: " + p);
		}catch(InvalidAgeException | RandomException f){
//			System.out.println(e.printStackTrace());
			System.out.println(f.getMessage());
			
		}
		

	}

}
