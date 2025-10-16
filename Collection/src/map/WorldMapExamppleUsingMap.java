package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldMapExamppleUsingMap {

	static Map<String, Map<String, Map<String, String>>> addCountry() {
		Map<String, String> maharashtra = new HashMap<>();
		maharashtra.put("PUNE", "Pune");
		maharashtra.put("MUMBAI", "Mumbai");
		maharashtra.put("NAGPUR", "Nagpur");
		maharashtra.put("NASHIK", "Nashik");
		maharashtra.put("SATARA", "Satara");

		Map<String, String> kerala = new HashMap<>();
		kerala.put("TRIVANDRUM", "Trivandrum");
		kerala.put("KOCHI", "Kochi");
		kerala.put("KOZHIKODE", "Kozhikode");
		kerala.put("THRISSUR", "Thrissur");
		kerala.put("ALAPPUZHA", "Alappuzha");

		Map<String, String> losAngeles = new HashMap<>();
		losAngeles.put("LA", "Los Angeles");
		losAngeles.put("LB", "Long Beach");
		losAngeles.put("PA", "Pasadena");
		losAngeles.put("GL", "Glendale");
		losAngeles.put("SM", "Santa Monica");

		Map<String, String> illinois = new HashMap<>();
		illinois.put("CHI", "Chicago");
		illinois.put("EV", "Evanston");
		illinois.put("OP", "Oak Park");
		illinois.put("CIC", "Cicero");
		illinois.put("DP", "Des Plaines");

		Map<String, Map<String, String>> india = new HashMap<>();
		india.put("KERALA", kerala);
		india.put("MAHARASHTRA", maharashtra);

		Map<String, Map<String, String>> usa = new HashMap<>();
		usa.put("LOS ANGELES", losAngeles);
		usa.put("ILLINOIS", illinois);

		Map<String, Map<String, Map<String, String>>> world = new HashMap<>();
		world.put("INDIA", india);
		world.put("USA", usa);

		return world;
	}

	public static void main(String[] args) {
		System.out.println("------USING ITERATOR------\n");
		Map<String, Map<String, Map<String, String>>> world = addCountry();

		Set<String> countrySet = world.keySet();
		Iterator<String> countryItr = countrySet.iterator();
		while (countryItr.hasNext()) {
			String countryName = countryItr.next();
			System.out.println("|-----" + countryName + "-----|\n");

			Map<String, Map<String, String>> states = world.get(countryName);
			Set<String> stateSet = states.keySet();
			Iterator<String> stateItr = stateSet.iterator();
			while (stateItr.hasNext()) {
				String stateName = stateItr.next();
				System.out.println("++--" + stateName + "--++");
				System.out.println("-----Cities-----");

				Map<String, String> cities = states.get(stateName);

				Set<String> cityCodes = cities.keySet();
				Iterator<String> cityItr = cityCodes.iterator();
				while (cityItr.hasNext()) {
					String code = cityItr.next();
					String cityName = cities.get(code);
					System.out.println("City Code: " + code + ", City Name: " + cityName);
				}
				System.out.println();
			}
			System.out.println("--__------__------__--\n");
		}

		System.out.println("----------USING FOR_EACH----------\n");
		for (String countryName : world.keySet()) {
			Map<String, Map<String, String>> states = world.get(countryName);
			System.out.println("|-----" + countryName + "-----|\n");

			for (String stateName : states.keySet()) {
				Map<String, String> cities = states.get(stateName);
				System.out.println("++--" + stateName + "--++");
				System.out.println("-----Cities-----");

				for (String city : cities.keySet()) {
					System.out.println("City Code: " + city + ", City Name: " + cities.get(city));
				}
				System.out.println();
			}
		}
	}
}
