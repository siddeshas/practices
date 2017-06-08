import java.util.Arrays;

public class ArrayListExample {
	private int size;
	private Object[]elements;
	public ArrayListExample(){
		elements=new Object[10];
	}

	public void add(Object obj){
		if(elements.length-size<=5){
			increaseSize();
		}
		elements[size++]=obj;
	}

	private void increaseSize() {
		elements=Arrays.copyOf(elements, elements.length*2);
	}

	public Object remove(int index){
		if(index<size){
			Object obj=elements[index]; 
			elements[index]=null;
			int tmp = index;
			while(tmp < size){
				elements[tmp] = elements[tmp+1];
				elements[tmp+1] = null;
				tmp++;
			}
			size--;
			return obj;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
}
