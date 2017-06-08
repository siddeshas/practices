package codingpractice;

public class SumOfEachNumber {
public static void main(String[] args) {
	int x=25555;
	
	System.out.println(getValue(x));
}
static int sum=0;
private static int  getValue(int x) {
	
	if(x==0){
		return sum;
	}else{
		sum+=x%10;
		getValue(x/10);
		
	}
	return sum;
}
}
