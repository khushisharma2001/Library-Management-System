package library_project;

import java.util.ArrayList;

public class EnhancedFor {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1); numbers.add(2); numbers.add(3);
		
		for(int number:numbers) {
			System.out.println(number);
		}

	}

}
