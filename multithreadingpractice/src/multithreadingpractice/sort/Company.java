package multithreadingpractice.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company<T>{
	String id;
	List<String>employees;
	public Company(String id,List<String>employees){
		this.id=id;
		this.employees=employees;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getEmployees() {
		return employees;
	}
	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	static Comparator<String> compValues=new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};
}
