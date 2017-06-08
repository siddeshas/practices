package CountDownLatches;

import java.util.concurrent.CountDownLatch;

public class Notifier implements Runnable{
	@Override
	public void run() {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
         this.latch.countDown();
         System.out.println(latch.getCount());
         try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
         this.latch.countDown();
         System.out.println(latch.getCount());
         try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
         this.latch.countDown();
         System.out.println(latch.getCount());
	}
	CountDownLatch latch = null;
	public Notifier(CountDownLatch latch){
		this.latch=latch;
	}
}
