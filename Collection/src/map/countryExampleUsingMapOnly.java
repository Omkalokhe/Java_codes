package map;


import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Set;

public class countryExampleUsingMapOnly {

	static Map<String, Map<String, String>> addCountry() {
		Map<String, String> maharashtra = new HashMap<String, String>();
		maharashtra.put("PUNE", "Pune");
		maharashtra.put("MUNBAI", "Mumbai");
		maharashtra.put("NAGPUR", "Nagpur");
		maharashtra.put("NASHIK", "Nashik");
		maharashtra.put("SATARA", "Satara");

		Map<String, String> keral = new HashMap<String, String>();
		keral.put("TRIVANDRAM", "Trivandram");
		keral.put("KOCHI", "kochi");
		keral.put("KOZHILKODE", "kozhilkode");
		keral.put("THRISSUR", "Thrissur");
		keral.put("ALAPPUZHA", "Alappuzha");

		Map<String, Map<String, String>> india = new HashMap<String, Map<String, String>>();
		india.put("KERAL", keral);
		india.put("MAHARASHTRA", maharashtra);

		return india;
	}

	public static void main(String[] args) {
		Map<String, Map<String, String>> india = addCountry();
		Set<String> stateSet = india.keySet();
		Iterator<String> stateIterator = stateSet.iterator();

		while (stateIterator.hasNext()) {
			String stateName = stateIterator.next();
			System.out.println("State: " + stateName);
			Map<String, String> cities = india.get(stateName);
			Set<String> citySet = cities.keySet();
			Iterator<String> cityIterator = citySet.iterator();
			
			while (cityIterator.hasNext()) {
				String cityCode = cityIterator.next();
				String cityName = cities.get(cityCode);
				System.out.println("City Code: " + cityCode + ", City Name: " + cityName);
			}
			System.out.println();
		}

	}

}
