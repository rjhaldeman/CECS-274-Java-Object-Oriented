package labAssignment2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Happy {

	static int orgNumber; // This will be our number at the start of every test.
	
	int newNumber; // This will be the number at the end of the test.
	
	public Happy(int x) // This is our constructor.
	{
		orgNumber = x;
	}
	
	ArrayList<String> tempList = new ArrayList<String>(); // This Array List keeps the numbers we checked for repitition.

	public static void changeOrg(int newNumber) // This changes the value of our original number.
	{
		orgNumber = newNumber;
	}
	
	public boolean isHappy() // This is the boolean to determin if the number is Happy.
	{
		String orgString = String.valueOf(orgNumber); //This makes a string of the original number.
		
		int[] orgArray = new int[orgString.length()]; // This makes an array of integers.
		
		tempList.add(orgString); // This will add each number to be tested for repitition.
		
		if(orgString.equals("1")) // This will check to see if the number is happy over all. 
		{
			System.out.println(orgNumber);
			return true;
		}
		
		for(int i =0; i< orgString.length(); i++) // This for loop will seperate the digits of the orgnumber.
		{
			int x = Integer.parseInt(orgString.substring(i,i+1));
			orgArray[i] = x;
		}
		
		int newNumber = 0; // This will reset our testing variable.

		for(int i = 0; i <orgArray.length; i++) // This will sum the squared digits.
		{
			newNumber = newNumber + orgArray[i]*orgArray[i];
		}
		
		if(newNumber == 1) // This will be the first of several testers.
		{
			System.out.println(newNumber);
			return true;
		}
		
		else if(tempList.contains(String.valueOf(newNumber))) // Another outcome tester.
		{
			System.out.println(newNumber);
			return false;
		}
		
		else if(!(newNumber == 1)) // This is a final outcome tester.
		{
			System.out.println(newNumber);
			orgNumber = newNumber;
			return isHappy(); //This is where the recursion happens.
		}
		return false;
	}
}
