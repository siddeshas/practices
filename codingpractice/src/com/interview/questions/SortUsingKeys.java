package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortUsingKeys {
public static void main(String[] args) {
	Map<String,String>maps=new HashMap<>();
	maps.put("k1", "c");
	maps.put("k2", "a");
	maps.put("k3", "b");
	maps.put("k4", "d");
	List<Entry<String, String>> entrySet = new ArrayList<>(maps.entrySet());
	Collections.sort(entrySet,new Comparator<Map.Entry<String,String>>() {
		@Override
		public int compare(Entry<String, String> o1, Entry<String, String> o2) {
			return (o1.getValue()).compareTo( o2.getValue() );
		}
	});
	System.out.println(entrySet);
}
}
