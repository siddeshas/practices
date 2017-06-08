package evenodd;

public class Tester {
public static void main(String[] args) {
	
	Printer printer=new Printer();
	PrintEvenOdd odd=new PrintEvenOdd(10, false, printer);
	PrintEvenOdd even=new PrintEvenOdd(10, false, printer);
	
	Thread t1=new Thread(even);
	Thread t2=new Thread(odd);
	t1.start();
	t2.start();
	
}
}
