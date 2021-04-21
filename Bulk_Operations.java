package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Bulk_Operations {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		hmap.put("Avinash", 5);
		hmap.put("Chandu", 6);
		hmap.put("praharsha", 10);
		hmap.put("Lokesh", 4);
		hmap.put("Durga prasad", 8);
		hmap.put("Manikanta", 7);

		// EntrySet()
		Set<Entry<String, Integer>> a = hmap.entrySet();
		System.out.println(a);
		// Keyset
		Set<String> b = hmap.keySet();
		System.out.println(b);
		// Values
		Collection<Integer> values = hmap.values();
		System.out.println(values);
	}
}
/**
 * OUTPUT
 *  EntrySet()
	[Avinash=5, Durga prasad=8, praharsha=10, Manikanta=7, Chandu=6, Lokesh=4]
 * 
 *  KeySet()
 *   [Avinash, Durga prasad, praharsha, Manikanta, Chandu, Lokesh]
 *  
 *   Values()
 *   [5, 8, 10, 7, 6, 4]
 */