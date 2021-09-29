package sw_dev.interfaces.from_lecture;//Tester for sorting SavingsAccounts using Comparators.

import java.util.ArrayList;
import java.util.Collections;

public class SavingsAccountComparatorTester
{
	public static void main(String[] args)
	{
		//Let's create a list with some BankAccount objects
		ArrayList<SavingsAccount> list = new ArrayList<SavingsAccount>();
		list.add(new SavingsAccount(3, 100));
		list.add(new SavingsAccount(1, 70));
		list.add(new SavingsAccount(5, 90));
		list.add(new SavingsAccount(4, 40));
		list.add(new SavingsAccount(5, 80));

		//Print out the list
		System.out.println("Original list:\n " + list);
		
		//Sort the list - this is only possible if the sort method
		//can compare our objects. In this example we can sort either
		//by interest rate or by balance
		Collections.sort(list, new RateComparator());

		//Print out the list again
		System.out.println("Sorted list(by Interest Rate):\n " + list);
		
		Collections.sort(list, new BalanceComparator());

		//Print out the list again
		System.out.println("Sorted list (by Balance):\n " + list);
		
		
			
	}
}