import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User implements Comparable<User> {
private String uName;
private List<String>list;
private Map<User,Address>userProfile;
public String getuName() {
	return uName;
}
public User(){
	list=new ArrayList<>();
	userProfile=new HashMap<>();
}
public List<String> getNames(){
	return list;
}

public Map<User, Address> getUserProfile() {
	return userProfile;
}
public void setUserProfile(Map<User, Address> userProfile) {
	this.userProfile = userProfile;
}
public void setuName(String uName) {
	this.uName = uName;
}
@Override
	public String toString() {
		return uName;
	}
public int compareTo(User o) {
	if(o.toString().compareTo(this.uName)==0){
		return 0;
	}
	if(o.toString().compareTo(this.uName)<=-1){
		return -1;
	}
	return 1;
}


}
