package codingpractice;

import java.util.Arrays;

public class TwoSumsEqualToNumbers {
public static void main(String[] args) {
	int a[] = {5,3,4,8,1};
	pairSum(a,9);
}

private static void pairSum(int[] a,int sum) {
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int i=0;
	int j=0;
	int temp=a[0];
	for( i=0,j=(a.length-1);i<j;){
		temp= a[i]+a[j];
		if(temp==sum){
			System.out.println(a[i]+" , "+ a[j]);
			i++;
			j--;
		}else if(temp<sum){
			i++;
		}else {
			j--;
		}
	}
	
}
}
