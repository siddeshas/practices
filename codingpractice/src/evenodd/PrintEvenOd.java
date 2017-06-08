package evenodd;

public class PrintEvenOd implements Runnable{
	int x;
	@Override
	public void run(){
		while(x<=10){
			synchronized (this) {
				notifyAll();
				printE(x);
				x+=1;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		while(x<11){
			synchronized (this) {
				notifyAll();
				printO(x);
				x+=2;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void printE(int x){
		System.out.println(Thread.currentThread().getName()+ " "+ x);
	}
	private void printO(int x){
		System.out.println(Thread.currentThread().getName()+ " "+ x);
	}


	public static void main(String[] args) {
		PrintEvenOd obj=new PrintEvenOd();
		Thread t1 = new Thread(obj);
		t1.setName("first");
		Thread t2 = new Thread(obj);
		t2.setName("second");
		t1.start();
		t2.start();

	}

}
