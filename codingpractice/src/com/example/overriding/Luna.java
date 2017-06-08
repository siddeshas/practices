package com.example.overriding;

public class Luna extends Eclipse {
	public String getVersion(){
		return "Luna";
	}
	
	public Luna getInstance(){
		return new Luna();
	}
}
