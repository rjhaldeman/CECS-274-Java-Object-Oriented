package labAssignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		
		System.out.println("Hello");
		System.out.println("Please enter the number that you would like to test.");
		int x = s.nextInt();
		
		while(x<0)
		{
			System.out.println("Please enter a positive interger.");
			x = s.nextInt();
		}
		
		Happy tester = new Happy(x); // This creates a Happy object.
				
		if(tester.isHappy()) // This will call the testing boolean and get a true/false answer.
		{
			System.out.print("Your number is Happy.");
		}
		
		else
		{
			System.out.println("Number is not Happy");
		}
		
	}

}
