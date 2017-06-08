package codingpractice;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int[] a={1,4,6,1,1,3,2,0,-1};
	
	for(int i=0;i<a.length;i++){
		int key=a[i];
		int j=i-1;
		while(j>=0 && a[j]>key ){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
	System.out.println(Arrays.toString(a));
}
}
