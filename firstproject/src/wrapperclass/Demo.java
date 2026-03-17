package wrapperclass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "|";
////		Byte b = new Byte(str);
//		Byte b = Byte.parseByte(str);
//		System.out.println(b);
		
		String num = "a89-9";
		StringBuilder str = new StringBuilder();
		boolean flag =  false;
		for(int i = 0;i<num.length();i++) {
			
			if(!flag) {
				if(num.charAt(i)=='-' || num.charAt(i)=='+') {
					str.append(num.charAt(i));
					flag = true;
				}
			}
			if(num.charAt(i) >= '0' && num.charAt(i) <= '9') {
				str.append(num.charAt(i));
				flag = true;
			}
//			System.out.println(str);
			
		}
		num = str.toString();
		long l =0;
		if(num.length()==1 &&(num.charAt(0)=='+' ||num.charAt(0)=='-' )) {
			l =0;
		}
		else if(num.length()!=0 ) {
			l = Long.parseLong(num);
		}
//		long l = Long.parseLong(num);
		System.out.println(l);
		
	}

} 
//NumberFormatException