package Dsa;

public class Student {
String name;
String rollno;
 Student(String name, String rollno) {
	this.name = name;
	this.rollno = rollno;
}
 @Override
public String toString() {
	return name + rollno ;
	
}

}
