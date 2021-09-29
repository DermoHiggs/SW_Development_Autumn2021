package sw_dev.interfaces.from_lecture;//Simple demonstration of calling the compareTo() method.

public class SavingsAccountComparableTester
{
	public static void main(String[] args)
	{
		SavingsAccount s1 = new SavingsAccount(20,200);
		SavingsAccount s2 = new SavingsAccount(10,200);


		int returnVal = s1.compareTo(s2);
		
		if(returnVal == 0)
		{
			System.out.println("s1 and s2 are equal");
		}
		else if(returnVal < 0)
		{
			System.out.println("s1 is less then s2, but what does this mean??");
		}
		else //MUST be > 0
		{
			System.out.println("s1 is greater then s2, but what does this mean??");
		}
			
	}
}