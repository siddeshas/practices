package codingpractice;

import java.util.Arrays;

public class MergeTwoArrays {
public static void main(String[] args) {
	int[] a={1,2,4,6};
	int[] b={3,5,7,8};
	
//	int i=0;
//	int j=0;
	//int[] answer = new int[f.length + f.length];
	//int k=0;
//	while(i<f.length && j<s.length){
//		if(f[i]<s[j] ){
//			answer[k++]=f[i++];
//		}else{
//			answer[k++]=s[j++];
//		}
//	}
//	while(j<s.length){
//		answer[k++]=s[j++];
//	}
//	
//	
	  int[] answer = new int[a.length + b.length];
			    int i = a.length - 1, j = b.length - 1, k = answer.length;
			    while (k > 0)
			        answer[--k] = 
			             j<0|| (i >= 0 && a[i] >= b[j]) ? a[i--] : b[j--];
	
	 System.out.println(Arrays.toString(answer));
}
}
