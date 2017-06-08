package towerofhannoi;

public class TowerOfHanoi {
	static int x=0;
	public static void main(String[] args) {
		move(3,"A","B","C");
		System.out.println(x);
	}

	public static void move(int n,String start,String intermediate,String end){
		if(n==0){
			return;
		}
		x++;
		move(n-1,start,end,intermediate);
		System.out.println("move "+ n +" from  "+ start +"  to " +end);
		move(n-1,intermediate,start,end);
//		3,A,B,C
//		| ___(2,A,C,B)
//		          |__(1,A,B,C) =MOVE 1 FROM A TO C (1)
//		            =MOVE 2 FROM A TO B(2)
//		          |__(1,C,A,B) =MOVE 1 FROM C TO B (3)
//		|__MOVE 3 FROM A TO C (4)
//
//		|___(2,B,A,C)
//		        |__(1,B,C,A) =MOVE 1 FROM B TO A (5)
//		           =MOVE 2 FROM B TO C (6)
//		        |__(1,A,B,C) =MOVE 1 FROM A TO C (7)

		
		
		
	}
}
