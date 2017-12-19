package collections;

import java.util.EnumMap;
import java.util.Iterator;

public class Test1 {
	enum E {
		ONE, TWO, THR, FOUR;
	}

	enum F {
		FIVE, SIX, SEVEN, EIGHT;
	}
	
	public static void main(String[] args) {
		EnumMap<E, String> em = new EnumMap<>(E.class);
		em.put(E.ONE, "One");
		em.put(E.TWO, "One");
		em.put(E.THR, "One");
		Iterator<String> it =em.values().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Iterator it1 =em.entrySet().iterator();
		while(it1.hasNext()){
			
			System.out.println(it1.next());
		}
	}
}
