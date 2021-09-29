package sw_dev.interfaces.from_lecture;

import java.util.Comparator;

public class RateComparator implements Comparator<SavingsAccount>
{
	public int compare(SavingsAccount ob1, SavingsAccount ob2)
	{
		
		 
		return (int)(ob1.getInterestRate() - ob2.getInterestRate()); 
	}

	//Note: we should also provide the equals() method, but the one we inherit from the Object
	//class will allow this to compile

}