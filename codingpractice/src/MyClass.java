
public class MyClass {

	public static void main(String[] args) {
		 MyClass obj = new MyClass();
		       char ch = 'c';
		       obj.myMethod(ch);
	}

	void myMethod(int i) {
		System.out.println("int version");
	}

	void myMethod(String i) {
		System.out.println("singtr version");
	}
}
