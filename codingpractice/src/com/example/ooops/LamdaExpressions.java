package com.example.ooops;

public class LamdaExpressions {
public static void main(String[] args) {
}

public void operation(Operation  op,int a ,int b){
	op.operate(a, b);
}


public interface Operation{
	public int operate(int a, int b);
}
}
