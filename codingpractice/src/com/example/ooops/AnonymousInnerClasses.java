package com.example.ooops;

public class AnonymousInnerClasses {
public static void main(String[] args) {
MyInterface value = new MyInterface() {
		@Override
		public void sendMessage(String sr) {
        System.out.println(sr);			
		}
	};
	value.sendMessage("hello");
}
}
