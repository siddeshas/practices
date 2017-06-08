package com.example.overriding;

public class MainClass {
	static StringBuilder s=new StringBuilder();
	static String v="siddu";
public static void main(String[] args) {
//	Eclipse instance=new Mars();
//	System.out.println(instance.getVersion());
//new MainClass().reverse("siddu", "siddu".length());
//System.out.println(s);

new Luna().setPositions(1, 2);
}

public void reverse(String s1,int i){
	if(i>0){
	System.out.print(s1.charAt(i-1));
	reverse(s1,i-1);
	}
}
}
