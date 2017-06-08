package questionsonmaps;

import java.util.HashMap;
import java.util.Map;

public class MapsQuestions {
public static void main(String[] args) {
	Map<String,User>myMap=new HashMap<>();
	User user=new User();
	user.setName("name");
	myMap.put("user1", user);
	User user2 = myMap.get("user1");
	user2.setName("mymap");
	System.out.println(myMap.get("user1").getName());
}
}
