package week3.day1;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String name="Hariprasad";
		char[] charArray = name.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char ch : charArray) {
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}else {
				map.put(ch, 1);
			}
					
			
		}
		
		System.out.println(map);
		
		

	}

}
