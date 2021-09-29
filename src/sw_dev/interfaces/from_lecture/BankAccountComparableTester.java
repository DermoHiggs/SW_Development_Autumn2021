package sw_dev.interfaces.from_lecture;//Tester for comparing BankAccount objects.

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountComparableTester
{
	public static void main(String[] args)
	{
		//Let's create a list with some BankAccount objects
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		list.add(new BankAccount(100));
		list.add(new BankAccount(70));
		list.add(new BankAccount(90));
		list.add(new BankAccount(40));
		list.add(new BankAccount(80));

		//Print out the list
		System.out.println("Original list:\n " + list);
		
		//Sort the list - this is only possible if the sort method
		//can compare our objects (i.e. we implement the Comparable 
		//interface). Note that the sort method
		//will actually call the compareTo method to do its job.
		//You could say that it "plugs in" to the interface we've provided
		Collections.sort(list);

		//Print out the list again
		System.out.println("Sorted list:\n " + list);
			
	}
}