package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use the declared String text as input
				String text = "We learn java basics as part of java sessions in java week1";	
				//split the string into an array
				String[] words = text.split(" ");
				
				Set<String> set = new LinkedHashSet<String>();
				
				for(int i=0; i<words.length; i++)
				{
					//put the words of the array into a set
					set.add(words[i]);
				}
				
				System.out.println(set);
				
			}

		
	}


