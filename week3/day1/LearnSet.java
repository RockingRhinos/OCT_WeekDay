package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> values = new TreeSet<String>();
		values.add("TestLeaf");
		values.add("Wipro");
		System.out.println(values.add("TCS"));
		values.add("HCL");
		System.out.println(values.add("TCS"));

		/*
		 * List<String> newValues = new ArrayList<String>(); newValues.addAll(values);
		 * System.out.println(newValues.get(0));
		 */
		System.out.println(values.size());
		// System.out.println(values);

		for (String val : values) {
			System.out.println(val);
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
