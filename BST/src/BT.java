
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
/**
 * 
 * 
 * @author siso261735
 *
 * @param <T> :Generic Type
 * 
 * 
 *                        1
 *                 /              \  
 *             2                     3
 *          /     \               /    \
 *        4        5            6        7
 *       /  \     /   \       /   \     /  \
 *     8     9  10    11    12     13  14  15
 *        
 */

public class BT<T> {

	BTNode<T> root;

	
	public static void main(String[] args) {
		BT<Integer>bt=new BT<>();
		bt.insertElement(1);
		bt.insertElement(2);
		bt.insertElement(3);
		bt.insertElement(4);
		bt.insertElement(5);
		bt.insertElement(6);
		bt.insertElement(7);
		bt.insertElement(8);
		bt.insertElement(9);
		bt.insertElement(10);
		bt.insertElement(11);
		bt.insertElement(12);
		bt.insertElement(13);
		bt.insertElement(14);
		bt.insertElement(15);
		
		System.out.println(bt.countNodes());
		bt.preOrderTraversal();
		bt.inOrderTraversal();
		bt.postOrderTraversal();
		bt.postorderIter();
		bt.postOrder();
		System.out.println();
		System.out.println(bt.heightOfBinaryTreeRecursively());
		System.out.println(bt.heightOfBinaryTreeIterative());
		System.out.println(bt.getDiameter());
		System.out.println(bt.getMaxSumInLevel());

		ArrayList<BTNode<Integer>> path = new ArrayList<>();
		bt.PrintAllPossiblePath(bt.root,path);
		bt.createMirror(bt.root);
		bt.preOrderTraversal();
		bt.inOrderTraversal();
		bt.postOrderTraversal();
		bt.postorderIter();
		bt.postOrder();
		System.out.println();
		bt.printAncestors(bt.root, 5);
		
		System.out.println();
		
		System.out.println(bt.leastCommonAncestor(bt.root, 4, 6).getData());
	}

	

	public int countNodes(){

		return countNodes(root);
	}

	public int countNodes(BTNode<T> root){

		if(root==null){
			return 0;
		}

		int l=1;

		l+=countNodes(root.getLeft());
		l+=countNodes(root.getRight());

		return l;		
	}


	public int heightOfBinaryTreeRecursively(){
		return heightOfBinaryTreeRecursively(root);
	}


	private int heightOfBinaryTreeRecursively(BTNode<T> root) {
		if(root==null){
			return -1;
		}
		int lh =heightOfBinaryTreeRecursively(root.getLeft());
		int rh =heightOfBinaryTreeRecursively(root.getRight());

		if (rh > lh) {
			return 1 + rh;
		} 
		return 1 + lh;
	}


	public int heightOfBinaryTreeIterative(){
		if(root==null){
			return -1;
		}

		Queue<BTNode<T>>queue=new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		int level=-1;
		while(!queue.isEmpty()){
			BTNode<T> temp = queue.poll();
			if(temp==null){
				if(!queue.isEmpty()){
					queue.offer(null);
				}
				level++;
			}else{
				if(temp.getLeft()!=null){
					queue.offer(temp.getLeft());
				}
				if(temp.getRight()!=null){
					queue.offer(temp.getRight());
				}
			}
		}
		return level;
	}


	
	/**
	 * 
	 *                        1
	 *                 /              \  
	 *             2                     3
	 *          /     \               /    \
	 *        4        5            6        7
	 *       /  \     /   \       /   \     /  \
	 *     8     9  10    11    12     13  14  15
	 *        
	 */

	void insertElement(T data){
		Queue<BTNode<T>>queue=new LinkedList<>();
		BTNode<T>newNode=new BTNode<>();
		newNode.setData(data);
		BTNode<T>tempNode=null;
		if(root==null){
			root=newNode;
			return;
		}
		queue.offer(root);
		while(!queue.isEmpty()){
			tempNode=queue.poll();
			if(tempNode.getLeft()!=null){
				queue.offer(tempNode.getLeft());
			}else{
				tempNode.setLeft(newNode);
				queue.poll();
				return;
			}

			if(tempNode.getRight()!=null){
				queue.offer(tempNode.getRight());
			}else{
				tempNode.setRight(newNode);
				queue.poll();
				return;
			}
		}
	}

	void preOrderTraversal(){
		Stack<BTNode<T>>stk=new Stack<>();
		stk.push(root);
		while(!stk.isEmpty()){
			BTNode<T> btNode=stk.pop();
			System.out.printf("%d ",btNode.getData());
			if(btNode.getRight()!=null){
				stk.push(btNode.getRight());
			}
			if(btNode.getLeft()!=null){
				stk.push(btNode.getLeft());
			}
		}
	}



	void inOrderTraversal(){
		Stack<BTNode<T>>stk=new Stack<>();
		System.out.println();
		BTNode<T>curr=root;
		while(!stk.isEmpty() || curr!=null){
			if(curr!=null){
				stk.push(curr);
				curr=curr.getLeft();
			}else{
				BTNode<T> ele = stk.pop();
				System.out.printf("%d ",ele.getData());
				curr=ele.getRight();
			}
		}
	}



	void postOrderTraversal(){
		Stack<BTNode<T>>stk=new Stack<>();
		stk.push(root);
		System.out.println();

		while(!stk.isEmpty()){
			BTNode<T> btNode=stk.pop();
			if(btNode.getLeft()!=null){
				stk.push(btNode.getLeft());
			}
			if(btNode.getRight()!=null){
				stk.push(btNode.getRight());
			}
			System.out.printf("%d ",btNode.getData());
		}
	}


	public void postorderIter() {

		if( root == null ) return;
		Stack<BTNode<T>> s = new Stack<>();

		BTNode<T> current = root;

		System.out.println(" ");

		while( true ) {
			if( current != null ) {

				if( current.getRight() != null ) {
					s.push( current.getRight() );
				}

				s.push( current );
				current = current.getLeft();
				continue;
			}
			if( s.isEmpty( ) ) {
				return;
			}
			current = s.pop( );

			if( current.getRight() != null && ! s.isEmpty( ) && current.getRight() == s.peek( ) ) {
				s.pop( );
				s.push( current );
				current = current.getRight();
			} else {
				System.out.print( current.getData() + " " );
				current = null;
			}
		}
	}


	public void postOrder(){
		if(root==null){
			return;
		}
		
		Stack<BTNode<T>>stk=new Stack<>();
		
		BTNode<T>currNode=root;
		
		System.out.println(" ");
		while(true){

			if(currNode!=null){
				if(currNode.getRight()!=null){
					stk.push(currNode.getRight());
				}
				stk.push(currNode);
				currNode=currNode.getLeft();
				continue;
			}

			if(stk.isEmpty()){
				return;
			}

			currNode=stk.pop();

			if(currNode.getRight()!=null && !stk.isEmpty() && stk.peek()==currNode.getRight()){
				stk.pop();
				stk.push(currNode);
				currNode=currNode.getRight();

			}else{

				System.out.print(currNode.getData()+" ");

				currNode=null;
			}
		}
	}




	public T getMaxElement() {
		Queue<BTNode<T>>q=new LinkedList<>();

		q.offer(root);
		T max=root.getData();

		while(!q.isEmpty()){
			BTNode<T> temp = q.poll();

			if(((Integer)max)<(Integer)temp.getData()){
				max=temp.getData();
			}

			if(temp.getLeft()!=null){
				q.offer(temp.getLeft());
			}

			if(temp.getRight()!=null){
				q.offer(temp.getRight());
			}
		}

		return max;
	}


	public int getDiameter(){
		return getDiameter(root);
	}

	private int getDiameter(BTNode<T> root) {

		if (root == null){
			return 0;
		}

		int rootDiameter = getHeight(root.getLeft()) + getHeight(root.getRight()) + 1;
		int leftDiameter = getDiameter(root.getLeft());
		int rightDiameter = getDiameter(root.getRight());

		return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	}

	public int getHeight(BTNode<T>node){

		if(node==null){
			return 0;
		}

		return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
	}


	public int getMaxSumInLevel(){
		int currSum = 0,maxSum=0;
		int level = 0,maxLevel=0;
		Queue<BTNode<T>>queue=new LinkedList<>();
		queue.offer(root);
		queue.offer(null);

		while(!queue.isEmpty()){
			BTNode<T>node=queue.poll();
			if(node==null){
				if(currSum>maxSum){
					maxSum=currSum;
					maxLevel=level;
				}
				currSum=0;
				if(!queue.isEmpty()){
					queue.offer(null);
				}
				level++;
			}else{
				currSum+=(Integer)node.getData();
				if(node.getLeft()!=null){
					queue.offer(node.getLeft());
				}
				if(node.getRight()!=null){
					queue.offer(node.getRight());
				}

			}
		}
		System.out.println(maxSum);
		return maxLevel;
	}




	public void PrintAllPossiblePath(BTNode<T> node,List<BTNode<T>> nodelist)
	{
		if(node != null)
		{
			nodelist.add(node);
			if(node.getLeft() != null)
			{
				PrintAllPossiblePath(node.getLeft(),nodelist);
			}
			if(node.getRight() != null)
			{
				PrintAllPossiblePath(node.getRight(),nodelist);
			}
			else if(node.getLeft() == null && node.getRight() == null)
			{

				for(int i=0;i<nodelist.size();i++)
				{
					System.out.print(nodelist.get(i).getData());
				}

				System.out.println();

			}
			nodelist.remove(node);
		}
	}


	public void createMirror(BTNode<T>root){
		BTNode<T>temp;
		if(root!=null){
			createMirror(root.getLeft());
			createMirror(root.getRight());
			temp=root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
		}
	}

	boolean printAncestors(BTNode<T> node, int target) 
	{
		/* base cases */
		if (node == null)
			return false;

		if ((Integer)node.getData() == (Integer)target)
			return true;

		/* If target is present in either left or right subtree 
	           of this node, then print this node */
		if (printAncestors(node.getLeft(), target)
				|| printAncestors(node.getRight(), target)) 
		{
			System.out.print(node.getData() + " ");
			return true;
		}
		/* Else return false */
		return false;
	}
	
	public  BTNode<T> leastCommonAncestor(BTNode<T> root, T a, T b) {
		
		if (root == null) {
		       return null;
		   }

		   // If the root is one of a or b, then it is the LCA
		   if (root.getData().toString().equals(a.toString()) || root.getData().toString().equals(b.toString())) {
		       return root;
		   }

		   BTNode<T> left = leastCommonAncestor(root.getLeft(), a, b);
		   BTNode<T> right = leastCommonAncestor(root.getRight(), a, b);

		   if (left != null && right != null) {
		      return root;
		   }

		   return (left != null) ? left : right; 
		}


}
