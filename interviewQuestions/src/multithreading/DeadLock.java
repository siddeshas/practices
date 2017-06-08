package multithreading;


public class DeadLock {
static String s1="data";
static String s2="base";
Thread trd1 = new Thread("My Thread 1"){
    public void run(){
        while(true){
            synchronized(s1){
                synchronized(s2){
                    System.out.println(s1 + s2);
                }
            }
        }
    }
};
 
Thread trd2 = new Thread("My Thread 2"){
    public void run(){
        while(true){
            synchronized(s1){
                synchronized(s2){
                    System.out.println(s2 + s1);
                }
            }
        }
    }
};
public static void main(String[] args) {
        DeadLock mdl = new DeadLock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}


