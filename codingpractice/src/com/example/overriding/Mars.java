package com.example.overriding;

public class Mars extends Eclipse {
	public String getVersion(){
		return "Mars";
	}
	
	public Mars getInstance(){
		return this;
	}
	
	public void he(){
		System.out.println("dfjds");
	}
}
