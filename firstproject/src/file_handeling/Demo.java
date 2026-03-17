package file_handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
 
public class Demo {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String nf = sc.next();
		sc.nextLine();
		File f = new File("C:\\Akash_Doc\\Akash Question//"+nf+".txt");
//		System.out.println(f.createNewFile());
//		f.delete();
//		f.deleteOnExit();
//		System.out.println(f.exists());
		if (!f.exists()) f.createNewFile();
 
		FileOutputStream fos = new FileOutputStream(f);
		String s = sc.nextLine();
		for (int i=0; i<s.length(); i++) fos.write(s.charAt(i));
 
		FileInputStream fis = new FileInputStream(f);
		int count;
		while((count = fis.read()) != -1) System.out.print((char) count);
 
		fos.close();
		fis.close();
	}
}
