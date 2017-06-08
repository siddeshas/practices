package designpatter;

public class Employee {
public int id;
public String name;

public Employee(int id ,String name) {
	this.id=id;
	this.name=name;
}
@Override
	public int hashCode() {
		return 100;
	}
@Override
	public boolean equals(Object o) {
	return this.id==((Employee)o).id && this.name.equals(((Employee)o).name);
	}
}
