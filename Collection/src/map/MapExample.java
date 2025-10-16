package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
		public static void main(String[] args) {
			Map<Integer, String> map=new HashMap<Integer, String>();
			map.put(1, "Om");
			map.put(2, "abc");
			map.put(3, "xyz");
			map.remove(3);
			System.out.println(map);
		}
}
