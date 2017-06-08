package polymorphism;

public class Mars extends Eclipse{
	public void setPosition(int left,int right){
	}
	
	public Mars(){
		System.out.println("calling Mars");
	}
	
	public Mars(String name){
		super(name);
		System.out.println(name);
	}
	
	@Override
	public String getnameOfIde() {
		return "Mars";
	}

	
	public static void MyMethod(Eclipse eclipse){
//		if( eclipse instanceof Mars)
//		System.out.println(eclipse.getnameOfIde());
	}
}
