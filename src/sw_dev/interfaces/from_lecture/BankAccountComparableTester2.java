package sw_dev.interfaces.from_lecture;//Simple demonstration of calling the compareTo() method.

public class BankAccountComparableTester2
{
	public static void main(String[] args)
	{
		//Change the balances to test the if - elseif conditions
		BankAccount b1 = new BankAccount(99.5);
		BankAccount b2 = new BankAccount(99);

		int returnVal = b1.compareTo(b2);
		
		if(returnVal == 0)
		{
			System.out.println("b1 and b2 both have the same money");
		}
		else if(returnVal < 0)
		{
			System.out.println("b1 has less money than b2");
		}
		else //MUST be > 0
		{
			System.out.println("b1 has more money than b2");
		}
			
	}
}