package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class Basic_Traversing {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<>();

		hmap.put("Avinash", 45);
		hmap.put("Ammalu", 47);
		hmap.put("Vikram", 25);
		hmap.put("Gowtham", 46);
		hmap.put("Dhanu", 49);

		for (Map.Entry<String, Integer> h : hmap.entrySet()) {

			System.out.print(h.getKey() + " ");
			System.out.println(h.getValue());
		}

		// normal method
		System.out.println(hmap);
	}
}

/**
 * OUTPUT
 * USING FOR-EACH LOOP
 * Avinash 45 
 * Ammalu 47 
 * Gowtham 46 
 * Dhanu 49 
 * Vikram 25 
 * 
 * NORMAL METHOD
 * {Avinash=45, Ammalu=47,Gowtham=46, Dhanu=49, Vikram=25}
 */
