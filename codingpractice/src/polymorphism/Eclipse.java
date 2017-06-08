package polymorphism;

public class Eclipse {
	String nameOfIde;
	public String getnameOfIde(){
		return "eclipse";
	}
	
	public Eclipse(){
		System.out.println("calling Eclipse");
	}
	
	public Eclipse(String name){
		System.out.println(name);
	}

	public void setPosition(int left,int right){
	}

	public void setPosition(int left,int right,int top,int bottom){
	}
	
}
