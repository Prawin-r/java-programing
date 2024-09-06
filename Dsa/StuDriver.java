package Dsa;

public class StuDriver {
	public static void main(String[] args) {
		Student s []=new Student[5];
	    s[0]= new Student("Prawin ","2021PECAI185");
		s[1]= new Student("Pramod ","2021PECAI180");
	    s[2]= new Student("Prawin ","2021PECAI185");
		s[3]= new Student("Pramod ","2021PECAI180");
	    s[4]= new Student("Prawin ","2021PECAI185");
		//s[5]= new Student("Pramod ","2021PECAI180");
        
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println(s);
//		System.out.println(s[1].toString());
	}

}
