package multithreading;


public class CriticalSection {
	protected long count = 0;

	public synchronized void add(long value){
		this.count = this.count + value;
	}
	public static void main(String[] args) throws InterruptedException {
		final CriticalSection section=new CriticalSection();
		Thread t1 = new Thread(new  Runnable() {
			public void run() {
				section.add(10);
			}
		});
		Thread t2 = new Thread(new  Runnable() {
			public void run() {
				section.add(20);
			}
		});
		t1.start();
		t2.start();
//		t2.join();
		System.out.println(section.count);
	}

}
