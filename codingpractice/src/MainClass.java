
public class MainClass {
public static void main(String[] args) {
	 DrivingUtilities du;
	   FourWheeler fw;
	   Truck myTruck = new Truck();
	   du = (DrivingUtilities)myTruck;
	  fw = new Bus();
	 fw = (FourWheeler) du;
}

}
