import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		//	String s="abcccbd";
		//
		//System.out.println(new Main().getVal(s));


		//	User user=new User();
		//	List<String> list = user.getNames();
		////	list=new ArrayList<>();
		//	list.add("1");
		//	list.add("2");
		//	System.out.println(user.getNames());
		//	
		//	

		//	User user=new User();
		//	Map<User, Address> info = user.getUserProfile();
		//	user.setuName("hello");
		//	Address ad=new Address();
		//	ad.setAddress("ad1");
		//	info.put(user, ad);
		//	System.out.println(info);
		//Address value = info.get(user);
		//value.setAddress("ad2");
		//System.out.println(info);
		
Stack<String>stk=new Stack<>();
stk.push("2");
stk.push("2");
stk.push("1");
stk.push(null);
System.out.println(stk);
		List<String>list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add(null);
		for(Object val:list){
			Integer inn=(Integer)val;
		}
	}
	String getVal(String str){
		if(str==null || str.isEmpty()){
			return str;
		}
		StringBuilder bulilder=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(i+1!=str.length() && str.charAt(i)==str.charAt(i+1)){
				continue;
			}
			if(str.isEmpty())
			{
				break;
			}
			bulilder.append(getVal(str.substring(i+1)));
			break;
		}
		return bulilder.toString();


	}
}
