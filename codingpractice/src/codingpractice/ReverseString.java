package codingpractice;

public class ReverseString {
public static void main(String[] args) {
	System.out.println(reverse1("Hello"));
	
	for(int i=1;i<=5;i++)
	{
		System.out.println(fibnacci(i));
	}
}

static String reverse1(String s){
	if(s==null || s.length()<=1){
		return s;
	}
	return reverse1(s.substring(1))+s.charAt(0);
}


static int fibnacci(int i){
	if(i==1 || i==2){
		return 1;
	}
	return fibnacci(i-1)+fibnacci(i-2);
}







static StringBuilder builder=new StringBuilder();
//private static String reverse(String string) {
//	for(int i=string.length()-1;i>=0;i--){
//		builder.append(string.charAt(i));
//	}
//	return builder.toString();
//}

public static void reverse(String str,int n){
	if(n<0){
		return ;
	}
	reverse(str,n-1);
	builder.append(str.charAt(n-1));
	
}

public static String reverse(String str) 
{     
    if ((str==null)||(str.length() <= 1) )
        return str;
    return reverse(str.substring(1)) + str.charAt(0);
}

}
