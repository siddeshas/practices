package designpatter;

public class MyBean implements INetBean{

	@Override
	public void setPosition(String name) {
		System.out.println("position  "+name);
	}

}
