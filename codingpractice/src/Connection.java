import java.util.concurrent.Semaphore;

public class Connection {
private static Connection instance=new Connection();
private int connections=0;
Semaphore semaphore=new Semaphore(10,true);
private Connection(){
}
public static Connection  getInstance(){
	return instance;
}

public void doconnect(){
	synchronized (this) {
		connections++;
		System.out.println("Connection  "+connections);
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	synchronized (this) {
		connections--;
	}
}

public void connect(){
	try {
		semaphore.acquire();
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
	try{
		doconnect();
	}finally{
		semaphore.release();
	}
}

}
