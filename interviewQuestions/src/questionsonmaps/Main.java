package questionsonmaps;

import java.util.Map;

public class Main {
public static void main(String[] args) {
	Utility utl=new Utility();
	Map<String, String> myMap = utl.getMyMap();
	myMap.put("k1", "v1");
	myMap.put("k2", "v2");
	Map<String, String> myMap2 = utl.getMyMap();
	myMap2.put("k3", "v3");
	System.out.println(myMap2);
}
}
