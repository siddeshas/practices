package codingpractice;

public class PallidromeString {
public static void main(String[] args) {
	String str="ktkat";
	
	int[] elementsCount = getElementsCount(str);
	int oddCount=0;
	for(int element:elementsCount){
		if(element%2!=0){
			oddCount++;
		}
	}
	if(oddCount>1){
		System.out.println("fdkdfkj");
	}else{
		System.out.println("vvvvvvvvvv");
	}

}

private static int[] getElementsCount(String str) {
	int[]c=new int[256];
	for(char cr:str.toCharArray()){
		c[cr]++;
	}
	return c;
}
}
