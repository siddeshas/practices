import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class HashSetMain {
public static void main(String[] args) {
	Set<String>sets=new TreeSet<>();	
	sets.add("B");
	sets.add("A");
	System.out.println(sets);
	sets.removeAll(sets);
	System.out.println(sets);
	Map<String,String>maps=new HashMap<>();
	maps.put("k1", "v1");
	maps.put("k1", "v2");
	System.out.println(maps);
	PriorityQueue<User> queue=new PriorityQueue<>();
	User user = new User();
	user.setuName("u1");
	User user2 = new User();
	user2.setuName("A1");
	queue.add(user);
	queue.add(user2);
	System.out.println(queue);
	
}
}
