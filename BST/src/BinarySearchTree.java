import java.util.Stack;

public class BinarySearchTree {
	public   Node root;
	
	public void insert(int data){
		Node newNode = new Node(data);
		if(root==null){
			root=new Node(data);
			return;
		}
		Node current = root;
		Node parent = null;
		while(true) {
			parent = current;
			if(data<current.data){
				current=current.left;
				if(current==null){
					parent.left=newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public boolean delete(int data){
		Node parent=root;
		Node current=root;
		boolean isLeft=false;
		while(current.data!=data){
			parent=current;
			if(current.data>data){
				isLeft=true;
				current=current.left;
			}else {
				isLeft=false;
				current=current.right;
			}
			if(current==null){
				return false;
			}
		}
		if(current.left==null && current.right==null){
			if(current==root){
				root=null;
			}else if(isLeft){
				parent.left=null;
			}else{
				parent.right=null;
			}
		}else if(current.left==null){
			if(current==root){
				root=current.right;
			}else if(isLeft){
				parent.left=current.right;
			}else{
				parent.right=current.right;
			}
		}else if(current.right==null){
			if(current==root){
				root=current.left;
			}else if(isLeft){
				parent.left=current.left;
			}else{
				parent.right=current.left;
			}
		}else if(current.left!=null && current.right!=null){
			Node successor=getSuccessor(current);
			if(current==root){
				root=successor;
			}else if(isLeft){
				parent.left=successor;
			}else {
				parent.right=successor;
			}
			successor.left = current.left;
		}
		return true;
	}
	
	private Node getSuccessor(Node del) {
		Node successorParent=null;
		Node successor=null;
		Node current=del.right;
		while(current!=null){
			successorParent=successor;
			successor=current;
			current=current.left;
		}
		
		if(successor!=del.right){
			successorParent.left=successor.right;
			successor.right=del.right;
		}
		return successor;
	}

	void preOrderTraversal(){
		Stack<Node>stk=new Stack<>();
		stk.push(root);
		while(!stk.isEmpty()){
			Node btNode=stk.pop();
			System.out.printf("%d ",btNode.getData());
			if(btNode.getRight()!=null){
				stk.push(btNode.getRight());
			}
			if(btNode.getLeft()!=null){
				stk.push(btNode.getLeft());
			}
		}
	}

void postOrderTraversal(){
	Stack<Node>stk=new Stack<>();
	stk.push(root);
	System.out.println();

	while(!stk.isEmpty()){
		Node btNode=stk.pop();
		if(btNode.getLeft()!=null){
			stk.push(btNode.getLeft());
		}
		if(btNode.getRight()!=null){
			stk.push(btNode.getRight());
		}
		System.out.printf("%d ",btNode.getData());
	}
}

public void leastCommonAncestor(int a, int b){
	System.out.println(leastCommonAncestor(root, a, b).getData());
}

public  Node leastCommonAncestor(Node root, int a,int b) {
	
	if (root == null) {
	       return null;
	   }

	   // If the root is one of a or b, then it is the LCA
	   if (root.getData()==a || root.getData()==b) {
	       return root;
	   }

	  Node left = leastCommonAncestor(root.getLeft(), a, b);
	  Node right = leastCommonAncestor(root.getRight(), a, b);

	   if (left != null && right != null) {
	      return root;
	   }

	   return (left != null) ? left : right; 
	}

}




 class Node{
	Node left;
	Node right;
	int data;
	public Node(int data){
		this.data=data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	
}