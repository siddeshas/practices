package codingpractice;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int[] a={1,4,6,1,1,3,2,0,-1};
	int temp;
	
	boolean swapped = true;
//	for(int i=a.length;i>=0 && swapped;i--){
//		swapped=false;
//		for(int j=0;j<i-1;j++){
//			if(a[j]>a[j+1]){
//				 temp = a[j];
//				a[j]=a[j+1];
//				a[j+1]=temp;
//				swapped=true;
//			}
//		}
//	}
//	System.out.println(Arrays.toString(a));
	
	
	
	for(int i=a.length;i>0;i--){
		for(int j=0;j<i-1;j++){
			if(a[j]>a[j+1]){
				 temp=a[j+1];
				 a[j+1]=a[j];
				 a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	
}
}
