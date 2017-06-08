package com.example.overriding;

public class Eclipse {

	int width;
	int length;
	public Object getVersion(){
		return " ";
	}
	public Eclipse getInstance(){
		return this;
	}
	public void setPositions(int left,int right){
		this.width=left;
		this.length=right;
		System.out.println("smal");
	}
	public void setPositions(int left,int right,int top,int botton){
	}
	
	public void setPositions(Integer i,Integer j){
		System.out.println("big");
	}
}
