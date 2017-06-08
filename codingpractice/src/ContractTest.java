import java.util.HashMap;
import java.util.Map;

public class ContractTest {
public static void main(String[] args) {
	Map<Employee,String>mapCache=employeeCacheMap();
	Employee emp1=new Employee("k1", "1");
	System.out.println(mapCache.size());
	System.out.println(mapCache.get(emp1));
}
static Map<Employee,String>employeeCacheMap(){
	Employee emp1=new Employee("k1", "1");
	Employee emp5=new Employee("k5", "5");
	Employee emp2=new Employee("k2", "2");
	Employee emp3=new Employee("k3", "3");
	Employee emp4=new Employee("k4", "4");
	Map<Employee,String>empl=new HashMap<>();
	empl.put(emp1, "u1");
	empl.put(emp2, "u2");
	empl.put(emp3, "u3");
	empl.put(emp4, "u4");
	empl.put(emp5, "u4");
	return empl;
}
}
class Employee{
	String empName;
	String empNo;
	public Employee(String empName,String empNo){
		this.empName=empName;
		this.empNo=empNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empNo == null) ? 0 : empNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empNo == null) {
			if (other.empNo != null)
				return false;
		} else if (!empNo.equals(other.empNo))
			return false;
		return true;
	}
	
}