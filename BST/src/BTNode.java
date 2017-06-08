
/**
 * 
 * @author siso261735
 *
 * @param <T> : Node with left and right descendants.
 */
public class BTNode<T> {
	
	private  BTNode<T> left, right;
	
    private T data;
    
	public BTNode<T> getLeft() {
		return left;
	}
	public void setLeft(BTNode<T> left) {
		this.left = left;
	}
	public BTNode<T> getRight() {
		return right;
	}
	public void setRight(BTNode<T> right) {
		this.right = right;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
  
     
}
