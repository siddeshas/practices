package codingpractice;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a={1,4,6,1,1,3,2,0,-1};
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
