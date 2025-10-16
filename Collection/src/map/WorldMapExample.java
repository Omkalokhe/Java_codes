package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorldMapExample {

	static Map<String, Map<String, List<String>>> addCountry() {
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

		List<String> los_Angeles = new ArrayList<String>();
		los_Angeles.add("Los Angeles");
		los_Angeles.add("Long Beach");
		los_Angeles.add("Pasadena");
		los_Angeles.add("Glendale");
		los_Angeles.add("Santa Monica");

		List<String> Illinois = new ArrayList<String>();
		Illinois.add("Chicago");
		Illinois.add("Evanston");
		Illinois.add("Oak Park");
		Illinois.add("Cicero");
		Illinois.add("Des Plaines");

		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("KERAL", keral);
		india.put("MAHARASHTRA", maharashtra);

		Map<String, List<String>> usa = new HashMap<String, List<String>>();
		usa.put("LOS ANHELES", los_Angeles);
		usa.put("ILLINOIS", Illinois);

		Map<String, Map<String, List<String>>> world = new HashMap<String, Map<String, List<String>>>();
		world.put("INDIA", india);
		world.put("USA", usa);

		return world;

	}

	public static void main(String[] args) {
		
		System.out.println("------USING ITERATOR------\n");
		Map<String, Map<String, List<String>>> world = addCountry();
		Set<String> countryNameSet = world.keySet();
		Iterator<String> itr = countryNameSet.iterator();
		while (itr.hasNext()) {
			String countryName = itr.next();
			System.out.println("|-----"+countryName+"-----|\n");
			Map<String, List<String>> countrys = world.get(countryName);
			Set<String> stateNameSet = countrys.keySet();
			Iterator<String> itr2 = stateNameSet.iterator();
			while (itr2.hasNext()) {
				String states = itr2.next();
				System.out.println("++--"+states+"--++");
				System.out.println("-----cities-----");
				List<String> cities = countrys.get(states);
				Iterator<String> itr3 = cities.iterator();
				while (itr3.hasNext()) {
					String city = itr3.next();
					System.out.println(city);
				}
				System.out.println("");
			
			}
			System.out.println("--__------__------__--\n");
		}
		System.out.println("----------USING FOR_EACH----------\n");
		for (String countryName : countryNameSet) {
			Map<String, List<String>> countryMap=world.get(countryName);
			System.out.println("|-----"+countryName+"-----|\n");
			Set<String>countryNameSet1=countryMap.keySet();
			for (String stateName : countryNameSet1) {
				List<String> cityList=countryMap.get(stateName);
				System.out.println("++--"+stateName+"--++");
				System.out.println("-----cities-----");
				for (String city : cityList) {
					System.out.println(city);
				}
				System.out.println("");
			}
		}
	}

}
