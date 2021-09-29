package sw_dev.interfaces.from_lecture;

/**
   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount 
{  
   private double interestRate;

   /**
      Constructs a bank account with a given interest rate.
      @param rate the interest rate
   */
   public SavingsAccount(double rate) 
   { 
		interestRate = rate;
   }

   /**
      Constructs a bank account with a given interest rate.
      @param rate the interest rate
   */
   public SavingsAccount(double rate, double initBalance) 
   {  
		super(initBalance);
      interestRate = rate;
   }


	public double getInterestRate()
	{
		return interestRate;
	}
	
   /**
      Adds the earned interest to the account balance.
   */
   public void addInterest() 
   {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }

	//Because BankAccount implements the Comparable interface we can
	//simply override the compareTo method in the subclass
	public int compareTo(SavingsAccount other)
	{
		//NOTE: how do we want to compare savings accounts
		//1: based on balance (handled by superclass
		//2: based on interest rate
		//3: based on a combination of both
		//Well, that's up to us. In this example we first check the balances
		//is they're equal we then use the interest rate to determine a
		//less-than/greater-than relationship
		int retVal = super.compareTo(other);
		
		if (retVal != 0)
		{
			return retVal;
		}
		else
		{
			return (int)(this.interestRate - other.interestRate);
		}
	}
	
	public String toString()
	{
		return "SavingsAccount: interest rate = " + interestRate + ", SuperClass : " + super.toString();
	}

}
