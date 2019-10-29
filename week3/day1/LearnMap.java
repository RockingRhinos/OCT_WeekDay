package week3.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		Map<Integer, String> empDetails = new TreeMap<Integer, String>();
		empDetails.put(100, "Naveen");
		empDetails.put(103, "Sarath");
		empDetails.put(104, "Koushik");
		empDetails.put(101, "Hari");
		empDetails.put(101, "Sam");
		empDetails.put(102, "Babu");
		System.out.println(empDetails.get(101));	
		empDetails.remove(104);
		Set<Entry<Integer, String>> entrySetValue = empDetails.entrySet();
		for (Entry<Integer, String> val : entrySetValue) {
			
			System.out.println(val.getKey()+ " "+val.getValue());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
