package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7};

				//Arrange the array in ascending order
				Set<Integer> set = new HashSet<Integer>();
				for(int i=0; i<data.length; i++)
				{
					set.add(data[i]);
				}
				
				//Pick the 2nd element from the last and print it
				List<Integer> lst = new ArrayList<Integer>();
				lst.addAll(set);
				
				System.out.println(lst.get(lst.size()-2));
						 
						
			}

		
	}


