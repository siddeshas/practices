package codingpractice;

public class CommonsInArrays {
public static void main(String[] args) {
	int[] f={1,2,3,4,6,6};
	int[] s={1,3,4,5,6};
	int i=0;
	int j=0;
	while(i<f.length && j<s.length){
		if(f[i]==s[j]){
			System.out.println(f[i]);
			i++;j++;
		}else if(f[i]>s[j]){
			j++;
		}else if(s[j]>f[i]) {
			i++;
		}
	}
	
}
}
