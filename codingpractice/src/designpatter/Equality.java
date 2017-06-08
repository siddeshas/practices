package designpatter;

import java.util.HashMap;

public class Equality {
public static void main(String[] args) {
	HashMap<Employee, String>hashmap=new HashMap<>();
	hashmap.put(new Employee(1,"hello"), "s");
	hashmap.put(new Employee(1,"hello1"), "s2");
	System.out.println(hashmap.size());
}
}
