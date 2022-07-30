package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num = {2,4,6,3,5,3,2,1};

// Ask requester how to remove 1 or 2 from below
//Method 1)- Just give only first occurrence like 2,4,6,3,5,1- Remove dulpicate of second occueance --> Its possible usibg set as its hold ionky unique vale.
// method 2) remove duplicates completely like- 4,6,5,1
	

// Method 1 

Set<Integer> unique = new HashSet<Integer>();// Assigning to Set
for(int i =0; i<=num.length-1;i++)// Using for loop to get iterate
{
	unique.add(num[i]); // As its sets it will wont hold duplicate value only unique value
}
System.out.println(unique);


// Use LinkedHashset
Set<Integer> unique1 = new LinkedHashSet<Integer>();// Assigning to LinkedHashSet as it will return with same order it wont do any sorting
for(int i =0; i<=num.length-1;i++)// Using for loop to get iterate
{
	unique1.add(num[i]); // As its sets it will wont hold duplicate value only unique value
}
System.out.println(unique1);
	}

}
