package multithreading;

public class D1 {
	static String str1 = "Java";
	static String str2 = "UNIX";
	public static void main(String a[]){
		Thread trd1 = new Thread("My Thread 1"){
			public void run(){
				while(true){
					synchronized(str1){
						synchronized(str2){
							System.out.println(str1 + str2);
						}
					}
				}
			}
		};
		Thread trd2 = new Thread("My Thread 2"){
			public void run(){
				while(true){
					synchronized(str1){
						synchronized(str2){
							System.out.println(str2 + str1);
						}
					}
				}
			}
		};
		trd1.start();
	trd2.start();
	}


}
