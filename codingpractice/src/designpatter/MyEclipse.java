package designpatter;

public class MyEclipse implements IEclipse {
	@Override
	public void setName(String name) {
		System.out.println("eclipse "+name);
	}
}
