package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> Strings = new ArrayList<String>();
		//2. Add seven Strings to your list
		Strings.add("Fritz");
		Strings.add("is");
		Strings.add("very");
		Strings.add("a passion fruit");
		Strings.add("person");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < Strings.size(); i++){
			System.out.println(Strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String tard : Strings){
			System.out.println(tard);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < Strings.size(); i++){
			if(i % 2 == 0){
			System.out.println(Strings.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = Strings.size() -1; i > 0; i--){
			System.out.println(Strings.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String tard : Strings){
			if(tard.contains("e"))
			System.out.println(tard);
		}
	}
}
