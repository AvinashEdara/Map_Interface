package mapInterface;

import java.util.HashMap;

public class Basic_Operations {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		hmap.put("Avinash", 5);
		hmap.put("Chandu", 6);
		hmap.put("praharsha", 10);
		hmap.put("Lokesh", 4);
		hmap.put("Durga prasad", 8);
		hmap.put("Manikanta", 7);

		// get Key ()
		System.out.println("Value at 1 is " + hmap.get("Avinash"));
		System.out.println("Value at 2 is " + hmap.get("praharsha"));

		// containsKey() and containsValue ()

		System.out.println(hmap.containsKey("Anil"));
		System.out.println(hmap.containsValue(8));

		// size()
		System.out.println(hmap.size());

		// remove(ObjectKey) or remove(ObjectKey,ObjectValue)

		hmap.remove("Avinash");
		hmap.remove("Chandu", 6);

		System.out.println(hmap);

		// clear()
		hmap.clear();

		// isEmpty()
		System.out.println(hmap.isEmpty());
	}
}

/**
 * OUTPUT 
 * getKey() Value at 1 is 5
 * 
 * containsKey() false
 * 
 * containsValue() true
 * 
 * size() 6
 * 
 * remove() {Durga prasad=8, praharsha=10, Manikanta=7, Lokesh=4}
 * 
 * isEmpty() true
 */
