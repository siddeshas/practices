package com.example.ooops;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	Bank b=new SBI();
	System.out.println(b.getInterest()+((SBI) b).getName());
	
	List<Number>list=new ArrayList<>();
	
	List<? super Integer>val=new ArrayList<>();
	val=list;
}
}
