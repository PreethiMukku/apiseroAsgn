package demoo;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
public static void main(String[] args) {
	List l1  = new ArrayList();
	l1.add("string");
	l1.add(300);
	l1.add(400.300);
	System.out.println(l1);

	List<String> list = new ArrayList<>();
	list.add("AA");
	list.add("BB");
	list.add("CC");
	list.add(1,"bb");
	list.add("DD");
	list.remove(0);
	list.set(3,"ee");
	int indexOfLastElement = list.size() - 1;
	list.remove(indexOfLastElement);

	System.out.println(list);
}

}

//1. add item at last position
//2. add item at nth position
//3. delete
//4 modify item
//print
