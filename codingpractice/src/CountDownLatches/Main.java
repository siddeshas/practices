package CountDownLatches;

import java.util.concurrent.CountDownLatch;

public class Main {
public static void main(String[] args) {
	CountDownLatch latch=new CountDownLatch(3);
	Waiter waiter=new Waiter(latch);
	Notifier notifier=new Notifier(latch);
	new Thread(waiter).start();
	new Thread(notifier).start();
	
	
}
}
