package UpcastingDowncasting;

 class Person1 {
	String name;
	Person1(String name){
		this.name=name;
	}

}
class Student extends Person1{
	int sid;
	Student(String name,int sid){
		super(name);
		this.sid=sid;
	}
		
	}
class Person{
	public static void main(String[] args) {
		Person1 n=new Student("b",59);
	//Person1 a=new Student("A",9);
		Student b=(Student)n;
		System.out.println(b.sid);
		System.out.println(n.name);
		
	
		
	}
	
}
	


