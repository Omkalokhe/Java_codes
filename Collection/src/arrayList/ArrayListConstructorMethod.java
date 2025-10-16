package arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListConstructorMethod {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(15);
		al.add(15);
		al.add("Om");
		al.add("Dipa");
		al.add(3, "Ram");
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
		List li=al.reversed();
		System.out.println(li);
		System.out.println(al.getFirst());
		System.out.println("--------------------------");
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}
	}
}
