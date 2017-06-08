package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
public class B extends A{
	public void foo()  throws FileNotFoundException  {

	}
	
	public static void main(String[] args) {
		A a = new B();
		    try {
				a.foo();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
