package Basic_Programs;
import java.util.ArrayList;
import java.util.List;

public class getSet {
    private String rollno;
    private String name;
    public String person;
    static List<getSet> allObjects = new ArrayList<>();

    
    public getSet() {
        allObjects.add(this);
    }

    public String getroll() {
        return rollno;
    }

    public void setroll(String rollno) {
        this.rollno = rollno;
    }

    public  String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public static void printAllObjects() {
        for (getSet instance : allObjects) {
            System.out.println("Roll No: " + instance.getroll() + ", Name: " + instance.getname());
        }
    }

    public static void main(String[] args) {
        getSet person1 = new getSet();
        person1.setroll("2021PECAI185");
        person1.setname("Prawin");
       
        getSet person2 = new getSet();
        person2.setroll("2021PECAI184");
        person2.setname("Pratin");
        
        getSet person3 = new getSet();
        person3.setroll("2021PECAI181");
        person3.setname("Pramod");
        
        getSet person4 = new getSet();
        person4.setroll("2021PECAI193");
        person4.setname("Rishi");
        
        getSet.printAllObjects();
    }
}
