package codingpractice;

public class MissingNumber {
public static void main(String[] args) {
	int[] numbersWithDuplicates = { 1,2,3,4,6,7,8}; 
	int n=numbersWithDuplicates.length;
	int total;
	total=(n+1)*(n+2)/2;
	for(int i=0;i<n;i++){
		total-=numbersWithDuplicates[i];
	}
	System.out.println(total);
}
}
