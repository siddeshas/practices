package overriding;

public class ClassB1 extends ClassA1{
	protected Integer m(int x,int y){
		System.out.println("Integer Second");
		return 0;
	}
	public void set(){
		System.out.println("dfsjsdf");
	}
	
	protected String m(String x,String y){
		System.out.println("int");
		return null;
	}
}
