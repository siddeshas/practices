import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SemaphoreExample {
public static void main(String[] args) {
	ExecutorService service=Executors.newCachedThreadPool();
	for (int i = 0; i < 100; i++) {
		service.submit(new Runnable() {
			@Override
			public void run() {
				Connection.getInstance().connect();
			}
		});
	}
	service.shutdown();
	try {
		service.awaitTermination(1, TimeUnit.DAYS);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
