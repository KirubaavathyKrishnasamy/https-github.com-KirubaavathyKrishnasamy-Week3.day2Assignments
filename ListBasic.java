package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name = new ArrayList<String>();
		// add names
		name.add("Kiruba");
		name.add("Hari");
		name.add("Kanil");
		
		// to check how many names are there (count)
		
		int count = name.size();
		System.out.println(count);
		
		//Remove particular data
		
		name.remove("Kiruba");
		int count1 = name.size();
		System.out.println(count1);
	
	// add to particular index
		name.add(1,"family");
		System.out.println(name);
		name.add("Kanil"); // Allows duplicate values also
		System.out.println(name);
		// Use get Method- "get()- Will always return last value in the list)
		System.out.println(name.get(name.size()-1));
		//or
		System.out.println(name.get(1));
		
	//clear ArrayList	
		name.clear();
		System.out.println(name);
	}
	

}



