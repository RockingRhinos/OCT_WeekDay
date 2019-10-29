package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {

		List<Integer> values = new LinkedList<Integer>();
		values.add(25);
		// values.add("TestLeaf");
		values.add(35);
		values.add(45);
		values.add(85);
		values.add(55);
		values.add(78);
		values.add(25);
		values.add(44);
		values.add(76);
		values.add(52);
		values.add(72);
		values.add(45);
		values.add(74);
		values.add(63);
		//System.out.println(values.size());

		List<Integer> newValues = new LinkedList<Integer>();
		newValues.addAll(values);
		/*
		 * for (Integer val : newValues) { System.out.println(val);
		 * 
		 * }
		 */
		Collections.sort(values);
		Collections.reverse(values);
		System.out.println(Collections.max(values));
		System.out.println(Collections.min(values));
		System.out.println(values);

		// values.remove(2);
		// System.out.println(values.get(3));
		// System.out.println(values.size());
		/*
		 * for (int i = 0; i < values.size(); i++) { System.out.println(values.get(i));
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		

	}
}
