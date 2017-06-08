package sortingtechniques;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
	public static void main(String[] args) {
		int[]a=new int[]{2,1,3,5,4,8};
		int temp;
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
