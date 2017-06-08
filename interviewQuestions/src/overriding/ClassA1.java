package overriding;

public class ClassA1 {
	protected String m(String x,String y){
		System.out.println("String");
		return null;
	}
	protected Number m(int x,int y){
		System.out.println("Number");
		return 0;
	}
}
