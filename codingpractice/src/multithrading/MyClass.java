package multithrading;

public class MyClass {
	public synchronized void run(){
		for(int i=0;i<5;i++){
		System.out.println(Thread.currentThread().getName()+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		final MyClass m=new MyClass();
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				m.run();
			}
		});
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				m.run();
			}
		});
		t1.setName("first");
		t2.setName("second");
		t1.start();
		t2.start();
		t2.join();
	}
}
