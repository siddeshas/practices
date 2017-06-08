package polymorphism;

public class Luna extends Eclipse {
	public String getVersion(){
		return "Luna";
	}
	
	public Luna getInstance(){
		return new Luna();
	}
	
	@Override
	public String getnameOfIde() {
		return getVersion();
	}
}
