package week1.day2;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		
		
		
		String[] friends = {"Vidhya","Priya","Vijay","Balaji","Ranjith"};
		int length = friends.length;
		System.out.println(length);
		Arrays.sort(friends);
		
		for (String friend : friends) {
			System.out.println(friend);
		}
		
		
		/*
		 * for(int i=0;i<length;i++) { System.out.println(friends[i]); }
		 */
	
	}

}