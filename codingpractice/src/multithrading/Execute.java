package multithrading;

import java.util.HashMap;

public class Execute {
	public static void main(String[] args) throws InterruptedException {

HashMap<String,String>map=new HashMap<>();
map.put("1", "1");
map.put("1", "2");

System.out.println(map);
		
		
		
//		
//		MyClass my1=new MyClass();
//		my1.setName("first");
//		MyClass my2=new MyClass();
//		my2.setName("second");
//		MyClass my3=new MyClass();
//		my3.setName("third");
//		my1.start();
//		try {
//			my1.join(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		my2.start();
//		try {
//			my2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		my3.start();
		

	}
}
