package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Removeduplicate {
	public static void main(String[] args) {
		List<Integer>val=new ArrayList<>();
		
		int aaa[]={2,3,6,6,8,9,10,10,10,12,12};
		int[]arr={1, 2, 2, 3, 1, 3, 3, 2, 3, 1, 2, 3, 3, 4,4, 1};
		for(int i=0;i<arr.length;i++){
			val.add(arr[i]);
		}
		//removeDuplicates(val);
		removeDuplicates(aaa);
		//System.out.println(val);

	}


	private static void removeDuplicates(List<Integer> list)
	{
		Collections.sort(list);
		int count = list.size();
		for (int i = 0; i < count; i++) 
		{
			if(i+1<count && list.get(i)==list.get(i+1)){
				list.remove(i);
				i--;
				count--;
			}
		}
		
		System.out.println(list);
	}
	
	private static void removeDuplicates(int[]a){
		Arrays.sort(a);
//		int count=a.length;
//		int[] newArray=new int[a.length];
//		int newcount=0;
//		for (int i = 0; i < count; i++) 
//		{
//			if((i+1<count&& a[i]!=a[i+1] )|| (i==a.length-1) ){
//				newArray[newcount++]=a[i];
//			}
//		}
//		
//		System.out.println("before"+Arrays.toString(Arrays.copyOf(newArray, newcount)));
//		
		int j = 0;
		int i = 1;
		while (i < a.length) {
			if (a[i] == a[j]) {
				i++;
			} else {
				a[++j] = a[i++];
			}
		}
		System.out.println("before"+Arrays.toString(a));
		int[] B = Arrays.copyOf(a, j + 1);
		System.out.println(Arrays.toString(B));
	}
}
