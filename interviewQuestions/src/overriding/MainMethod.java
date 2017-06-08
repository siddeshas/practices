package overriding;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

import questionsonmaps.Main;

public class MainMethod {
	static{  
		  System.out.println("static block is invoked");  
		  }  
	
	{
		System.out.println("object block");
	}
public static void main(String[] args) {
	MainMethod meth=new MainMethod();
	ClassA1 a=new ClassB1();
	a.m(10, 20);
	((ClassB1)a).set();
	
	SuperClass sup=new SubClass();
	((SubClass)sup).print();
}
}
