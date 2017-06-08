import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
public static void main(String[] args) {
	ConcurrentHashMap<String, User>hashMap=new ConcurrentHashMap<>();
	User user1=new User();
	user1.setuName("u1");
	User user2=new User();
	user2.setuName("u2");
	hashMap.put("1", user1);
	hashMap.put("2", user2);
	Set<Entry<String, User>> entrySet = hashMap.entrySet();
	for (Entry<String, User> entry : entrySet) {
		hashMap.remove(entry.getKey());
	}
	
	System.out.println(hashMap);
}
}
