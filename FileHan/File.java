package FileHan;
import java.io.FileWriter;
import java.io.IOException;
public class File {
//
 /*    Important Constructor of the Filewriter class below
      
      FileWriter f=new FileWriter("Writer.txt");
	  FileWriter f1=new FileWriter(f);
	  FileWriter f2=new FileWriter(f,true);
	  FileWriter f3=new FileWriter(f,false);
	  
  
     /* Important methods in FileWriter class
     * 
	 *
	 * write(int ch);  // use to store the unicode for the char ex 180->'d'
	 * write(char[] ch);  // store char array
	 * write(String s);  //store String
	 * flush();   // to push all stuck data in the pipe line
	 * close();   // close all the resources
	 */
public static void main(String[] args) throws IOException {
	FileWriter f= new FileWriter("Write1.txt");
	f.write(100);
	f.write("\n");
	f.write("Good morning");
	f.write("\n");
	char[] a= {'A','B','C','D'};
	f.write(a,0,4);
	//f.flush();
	f.close();
	
	FileWriter f2=new FileWriter("Ironman.txt");
	f2.write(65);
	f2.flush();
}
}
