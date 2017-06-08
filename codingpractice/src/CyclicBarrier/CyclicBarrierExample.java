package CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class CyclicBarrierExample {
	private static class Task implements Runnable{
		CyclicBarrier cb;
		public Task(CyclicBarrier cb){
			this.cb=cb;
		}

		@Override
		public void run() {
			try {
				System.out.println(Thread.currentThread().getName()+"  waiting at Barrier");
				cb.await();
				System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		final CyclicBarrier cb = new CyclicBarrier(4, new Runnable(){
//			@Override
//			public void run(){
//				System.out.println("All parties are arrived at barrier, lets play");
//			}
//		});
//		Thread t1 = new Thread(new Task(cb), "Thread 1");
//		Thread t2 = new Thread(new Task(cb), "Thread 2");
//		Thread t3 = new Thread(new Task(cb), "Thread 3");
//		Thread t4 = new Thread(new Task(cb), "Thread 4");
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future future = executorService.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});
		System.out.println(future.get());
	}
}
