package Basic_Programs;

import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    String joinDate;
    String designationCode;
    String department;
    int basic;
    int hra;
    int it;

    // Constructor
    public Employee(int empNo, String empName, String joinDate, String designationCode, String department, int basic, int hra, int it) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    // Method to calculate salary
    public int calculateSalary(int da) {
        return this.basic + this.hra + da - this.it;
    }

    // Method to display employee details
    public void displayDetails(String designationName, int salary) {
        System.out.println("EmpNo: " + this.empNo);
        System.out.println("EmpName: " + this.empName);
        System.out.println("Department: " + this.department);
        System.out.println("Designation: " + designationName);
        System.out.println("Salary: " + salary);
    }
}

public class Project1 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "01/01/2000", "e", "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000)
        };

        String[] designations = {"e", "c", "k", "r", "m"};
        String[] designationNames = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] da = {20000, 32000, 12000, 15000, 40000};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.empNo == empId) {
                found = true;
                String designationName = "";
                int daValue = 0;
                for (int i = 0; i < designations.length; i++) {
                    if (emp.designationCode.equals(designations[i])) {
                        designationName = designationNames[i];
                        daValue = da[i];
                        break;
                    }
                }
                int salary = emp.calculateSalary(daValue);
                emp.displayDetails(designationName, salary);
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        scanner.close();
    }
}
