import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
public static void main(String[] args) {
	List<String> listA = new ArrayList<>();
	listA.add("element 1");
	listA.add("element 2");
	listA.add("element 3");
	listA.add(0, "element 0");
	System.out.println(listA);
	int size = listA.size();
	for(int i=0;i<size;i++){
		listA.remove(i);
		size--;
		i--;
	}
	System.out.println(listA);
}
}
