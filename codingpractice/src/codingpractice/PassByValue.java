package codingpractice;

public class PassByValue {
public static void main(String[] args) {
	Baloon red = new Baloon("Red");
	Baloon blue = new Baloon("Blue"); 
	swap(red, blue);
//	System.out.println("red color="+red.getColor());
//	System.out.println("blue color="+blue.getColor());
	
//	foo(blue);
	System.out.println("blue color="+blue.getColor());
}

public static void swap(Object o1, Object o2){
	Object temp = o1;
	o1=o2;
	o2=temp;
}

private static void foo(Baloon balloon) { //baloon=100
	balloon.setColor("Red"); //baloon=100
	balloon = new Baloon("Green"); //baloon=200
	balloon.setColor("Blue"); //baloon = 200
}
}
