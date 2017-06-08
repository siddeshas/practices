
public class InsufficientFundsException extends Exception{
	private String str;
public InsufficientFundsException(String msg){
	str=msg;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}

}
