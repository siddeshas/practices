package com.interview.questions;

public class MainMethod
{
	int x;
	static{
		System.out.println("static");
	}
	public static void main(String[] args) {
     MainMethod meth=new MainMethod();
	}

	public void add(){
		x+=10;
	}



}

