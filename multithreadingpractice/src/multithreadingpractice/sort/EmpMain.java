package multithreadingpractice.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		 List<Employee> ts1 = new ArrayList();
	        ts1.add(new Employee ("B",40000.00));
	        ts1.add(new Employee ("A",20000.00));
	        ts1.add(new Employee ("C",50000.00));
	        ts1.add(new Employee ("D",70000.00));
	        Collections.sort(ts1,new Employee().EmployeeNameSorter);
	        System.out.println(ts1);
	        
	        List<String>compEmployees=new ArrayList<>();
	        
	        compEmployees.add("B");
	        compEmployees.add("B");
	        compEmployees.add("C");
	        compEmployees.add("A");
	        
	        Company mycomp=new Company("1",compEmployees);
	        Collections.sort(mycomp.getEmployees(),mycomp.compValues);
	        System.out.println(mycomp.getEmployees());
	        
	}
}
