package mapInterface;

import java.util.HashMap;
import java.util.Map;

// IN CASE OF CUSTOM OBJECTS
public class Friends_Main {
	public static void main(String[] args) {

		Friends f1 = new Friends("Avinash", 545);
		Friends f2 = new Friends("Vikram", 525);
		Friends f3 = new Friends("Vasista", 540);
		Friends f4 = new Friends("Dhanu", 503);

		HashMap<Friends, String> hmap = new HashMap<>();

		hmap.put(f1, "is a Developer");
		hmap.put(f2, "is a Government Employee");
		hmap.put(f3, "is a Doctor");
		hmap.put(f4, "is a Graduate");

		for (Map.Entry<Friends, String> a : hmap.entrySet()) {

			System.out.println(a.getKey() + "" + a.getValue());
		}
	}
}
/**
 * Friends [name=Avinash, roll_number=545]is a Developer
 * Friends [name=Vasista, roll_number=540]is a Doctor
 * Friends [name=Dhanu, roll_number=503]is a Graduate
 * Friends [name=Vikram, roll_number=525]is a Government Employee
 */

