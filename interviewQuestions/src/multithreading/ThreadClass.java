package multithreading;

public class ThreadClass {
	int count;
public static void main(String[] args) throws InterruptedException {
	final ThreadClass clazz=new ThreadClass();
	Thread a=new Thread(new Runnable() {
		@Override
		public void run() {
			clazz.setCount(clazz,10);
		}
	});
	a.setName("first");
Thread b=new Thread(new Runnable() {
		@Override
		public void run() {
		    clazz.setCount(clazz,20);
		}
	});
Thread  c=new Thread(new Runnable() {
	@Override
	public void run() {
	    clazz.setCount(clazz,20);
	}
});
b.setName("second");
c.setName("third");
a.start();
a.join();
b.start();
c.start();
}
public  int getCount() {
	return count;
}
public  void setCount(ThreadClass clazz,int count) {
	System.out.println(Thread.currentThread().getName());
	Thread.yield();
		this.count = count;
}


}
