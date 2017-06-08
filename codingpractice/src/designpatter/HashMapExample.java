package designpatter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapExample {
public static void main(String[] args) {
	Map m1 = new HashMap();
	m1.put("map", "HashMap");
	m1.put("schildt", "java2");
	m1.put("mathew", "Hyden");
	m1.put("schildt", "java2s");

	SortedMap sm = new TreeMap();
	sm.put("map", "TreeMap");
	sm.put("schildt", "java2");
	sm.put("mathew", "Hyden");
	sm.put("schildt", "java2s");



	LinkedHashMap lm = new LinkedHashMap();
	lm.put("map", "LinkedHashMap");
	lm.put("schildt", "java2");
	lm.put("mathew", "Hyden");
	lm.put("schildt", "java2s");
	
	System.out.println(m1);
	System.out.println(sm);
	System.out.println(lm);
}
}
