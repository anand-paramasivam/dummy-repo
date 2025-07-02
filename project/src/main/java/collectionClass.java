import java.util.*;

public class collectionClass {

	public static void main(String[] args) {
		System.out.println("Hello World");

		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Mango");
		
		LinkedList<String> vegList = new LinkedList<>();
		vegList.add("Potato");
		vegList.add("Tomato");
		
		System.out.println("FavFruit: " + fruitList.get(1));
		System.out.println("FavVeg: " + vegList.get(1));
		
		HashMap<String, Integer> ageMap = new HashMap<>();
		ageMap.put("Shruthi", 28);
		ageMap.put("Anand", 11);
		
		System.out.println("ageMap: " + ageMap);
		
		TreeSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("benz");
		sortedSet.add("charlie");
		sortedSet.add("aaron");
		
		HashSet<String> unSortedSet = new HashSet<>();
		unSortedSet.add("benz");
		unSortedSet.add("charlie");
		unSortedSet.add("aaron");
		
		System.out.println("sortedSet: " + sortedSet);
		System.out.println("unSortedSet: " + unSortedSet);
		//

	}
}
