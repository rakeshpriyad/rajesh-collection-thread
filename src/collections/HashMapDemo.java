package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	static Map<Integer, String> hm = new HashMap<Integer, String>();

	public static void main(String[] args) {
		hm.put(2, "English is easy languase");
		System.out.println("HashMap:->>" + hm);
		System.out.println("\n funcnality putifAbsent Method->>" + functionalityOfPutIfAbsent(2, "Rajesh"));
		System.out.println("HashMap->>" + hm);
		System.out.println("\n funcnality putifAbsent Method->>" + functionalityOfPutIfAbsent(4, "Rakesh"));
		System.out.println("HashMap->>" + hm);

	}

	public static synchronized String functionalityOfPutIfAbsent(Integer key, String value) {
		if (!hm.containsKey(key))
			return hm.put(key, value);
		else
			return hm.get(key);

	}
}
