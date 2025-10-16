package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInsideListUniversityExample {
	List<List<String>> getAllUniversity() {
		List<String> puneUni = new ArrayList<String>();
		puneUni.add("Engineering");
		puneUni.add("Art");
		puneUni.add("Science");
		puneUni.add("Law");

		List<String> mumbiaUni = new ArrayList<String>();
		mumbiaUni.add("Commerce");
		mumbiaUni.add("Medical");
		mumbiaUni.add("Management");
		mumbiaUni.add("Law");

		List<String> nagpurUni = new ArrayList<String>();
		nagpurUni.add("Agriculture");
		nagpurUni.add("Pharmacy");
		nagpurUni.add("Engineering");

		List<List<String>> maharashtraUniversities = new ArrayList<List<String>>();
		maharashtraUniversities.add(puneUni);
		maharashtraUniversities.add(nagpurUni);
		maharashtraUniversities.add(mumbiaUni);

		return maharashtraUniversities;
	}
	public static void main(String[] args) {
		ListInsideListUniversityExample obj = new ListInsideListUniversityExample();
	
		List<List<String>> University = obj.getAllUniversity();
		Iterator<List<String>> itr = University.iterator();
		while (itr.hasNext()) {
			List<String> Branch = itr.next();
			Iterator<String> itr1 = Branch.iterator();
			while (itr1.hasNext()) {
				String string = (String) itr1.next();
				System.out.println(string);
			}
			System.out.println("-------------------------------");
		}
	}

}
