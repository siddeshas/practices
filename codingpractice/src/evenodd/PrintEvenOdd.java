package evenodd;

public class PrintEvenOdd  implements Runnable{
Printer printer;
boolean isOdd;
int v;
public PrintEvenOdd(int v,boolean isOdd,Printer printer){
	this.v=v;
	this.isOdd=isOdd;
	this.printer=printer;
}

public void run(){
	for(int i=0;i<v;i+=2){
		printer.printEven(i);
	}
	for(int i=1;i<11;i++){
		printer.printOdd(i);
	}
}

}
