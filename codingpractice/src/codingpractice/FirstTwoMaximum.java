package codingpractice;

import java.util.Arrays;

public class FirstTwoMaximum {
public static void main(String[] args) {
	
	


	int a[] = {1, 1, 2, 2, 4, 4, 5, 5, 3,6,9};
Arrays.sort(a);
System.out.println(Arrays.toString(a));
int f=Integer.MIN_VALUE;
int s=Integer.MIN_VALUE;
int x=2;
int count=0;
for(int i=a.length-1;i>0;i--){
	if(a[i]!=a[i-1] || i==1){
		count++;
	}
	if(count==x){
		System.out.println(x+"th"+"  largest element in array is  "+a[i]);
		break;
	}
	
}
}
}
