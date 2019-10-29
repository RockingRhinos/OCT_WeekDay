package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] num= {25,35,25,35,45,55,62};
		
		Set<Integer> values=new LinkedHashSet<Integer>();
		
		for (Integer newValues : num) {
			values.add(newValues);
			
		}
		
		System.out.println(values);

	}

}
