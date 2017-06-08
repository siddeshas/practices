
public class BSTImpl {
public static void main(String[] args) {
	BinarySearchTree tree=new BinarySearchTree();
	tree.insert(15);
	tree.insert(10);
	tree.insert(20);
	tree.insert(8);
	tree.insert(12);
	tree.insert(17);
	tree.insert(25);
//	tree.preOrderTraversal();
//	tree.postOrderTraversal();
//	tree.delete(15);
//	tree.preOrderTraversal();
//	tree.postOrderTraversal();
	tree.leastCommonAncestor(17, 8);
}
}
