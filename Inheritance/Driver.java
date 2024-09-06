package Inheritance;

import java.io.File;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {
//		MobilePhone m1=new MobilePhone(8,128);
//		MobilePhone m2=new MobilePhone(6,128);
//		System.out.println(m2.hashCode());
//		System.out.println(m1.hashCode());
		File f1 =new File("Batman.txt");
		f1.createNewFile();
		f1.mkdir();
		System.out.println(f1.exists());
		
		
	}
}
