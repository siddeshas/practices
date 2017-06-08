package multithreadingpractice.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee<T> {
	int EmpID;
    String Ename;
    double Sal;
    static int i;

    public Employee() {
        EmpID = i++;
        Ename = "dont know";
        Sal = 0.0;
    }
 
    public Employee(String ename, double sal) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
    }
 
    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal;
    }
//
//	@Override
//	public int compareTo(T e1) {
//		return this.Ename.compareTo(((Employee)e1).Ename);
//	}
//	
//	
//	
//	
	
	
	
	public static Comparator<Employee> EmployeeNameSorter
    = new Comparator<Employee>() {

public int compare(Employee name1, Employee name2) {

String fruitName1 = name1.Ename;
String fruitName2 = name2.Ename;
return fruitName1.compareTo(fruitName2);

}

};

}
