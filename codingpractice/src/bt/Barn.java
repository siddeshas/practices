package bt;

import java.util.Arrays;

public class Barn {
public static void main(String[] args) {
	new Barn().go(1, "1","2");
}

public void go(int x,String...f){
	System.out.println(Arrays.toString(f));
}
}
