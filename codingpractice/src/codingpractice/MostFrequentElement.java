package codingpractice;

import java.util.Arrays;

public class MostFrequentElement {
public static void main(String[] args) {
	int[]arr={1, 2, 2, 3, 1, 3, 3, 2, 3, 1, 2, 3, 3, 4,4, 1};
	System.out.println(findMostFrequent(arr));
}

private static String findMostFrequent(int[] a) {
	int count=1;
	int maxcount=0;
	Arrays.sort(a);
  int value = 1;
	for (int i = 1; i < a.length-1; i++) {
		if(a[i]==a[i-1]){
			count++;
		}
		if(a[i]!=a[i-1] || i==a.length){
			if(count>=maxcount){
				maxcount=count;
				value=a[i-1];
			}
			count=1;
		}
		
	}
	return value+" appears "+maxcount+"  times";
}
}
