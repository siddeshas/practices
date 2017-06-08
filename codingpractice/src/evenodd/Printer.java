package evenodd;

public class Printer {
	boolean isOdd;
	void printEven(int n){
		while(!isOdd){
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(n);
		notifyAll();
		isOdd=false;
	}

	void printOdd(int n){
		while(isOdd){
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(n);
		notifyAll();
		isOdd=true;
}
}
