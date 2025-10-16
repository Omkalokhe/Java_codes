package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInsideList {

	List<List<String>> getCountry() {

		List<String> maharastra = new ArrayList<String>();
		maharastra.add("Pune");
		maharastra.add("Nashik");
		maharastra.add("Nagpur");

		List<String> keral = new ArrayList<String>();
		keral.add("Trivandram");
		keral.add("kochi");
		keral.add("kozhilkode");

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(maharastra);
		india.add(keral);

		return india;
	}

	public static void main(String[] args) {
		ListInsideList obj = new ListInsideList();
		System.out.println(obj.getCountry());
		List<List<String>> state = obj.getCountry();
		Iterator<List<String>> itr = state.iterator();
		while (itr.hasNext()) {
			List<String> city = itr.next();
			Iterator<String> itr1 = city.iterator();
			while (itr1.hasNext()) {
				String string = (String) itr1.next();
				System.out.println(string);
			}
		}
	}

}
