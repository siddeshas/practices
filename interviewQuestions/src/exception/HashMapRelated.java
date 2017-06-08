package exception;

import java.util.HashSet;
import java.util.Set;

public class HashMapRelated {
public static void main(String[] args) {
	StringBuilder b1=new StringBuilder("1");
	StringBuilder b2=new StringBuilder("1");
	StringBuilder b3=new StringBuilder("1");
	StringBuilder b4=new StringBuilder("1");
	StringBuilder b5=new StringBuilder("1");
	Set<StringBuilder>builder=new HashSet<>();
	builder.add(b1);
	builder.add(b2);
	builder.add(b3);
	builder.add(b4);
	builder.add(b5);
	System.out.println(builder);
	String s1=new String("1");
	String s2=new String("1");
	String s3=new String("1");
	String s4="1";
	String s5="1";
	Set<String>s=new HashSet<>();
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.add(s4);
	s.add(s5);
	System.out.println(s);
}
}
