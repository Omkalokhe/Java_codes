package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountryMapExample {
	static Map<String, List<String>> addCountry() {
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nagpur");
		maharashtra.add("Nashik");
		maharashtra.add("Satara");

		List<String> keral = new ArrayList<String>();
		keral.add("Trivandram");
		keral.add("kochi");
		keral.add("kozhilkode");
		keral.add("Thrissur");
		keral.add("Alappuzha");

		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("KERAL", keral);
		india.put("MAHARASHTRA", maharashtra);

		return india;
	}

	public static void main(String[] args) {
		Map<String, List<String>> india = addCountry();
		System.out.println("----USING ITERATOR----");
		Set<String> countrySet = india.keySet();
		Iterator<String> itr = countrySet.iterator();
		while (itr.hasNext()) {
			String state = itr.next();
			List<String> cities = india.get(state);
			System.out.println(state);
			Iterator<String> itr2 = cities.iterator();
			while (itr2.hasNext()) {
				String city = (String) itr2.next();
				System.out.println(city);
			}
			System.out.println("--__------__------__--\n");

		}
		System.out.println("----USING FOR_EACH----");
		for (String state : countrySet) {
			List<String> cities = india.get(state);
			System.out.println(state);
			for (String city : cities) {
				System.out.println(city);
			}
			System.out.println("--__------__------__--");

		}

	}
}
