package sw_dev.interfaces.from_lecture;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Comparable<BankAccount>
{ 

   private double balance; 
	 
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {  
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {  
      balance = initialBalance;
   }
 
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount) 
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount) 
   {  
		if (balance >= amount)
		{
      	balance = balance - amount;
		}
		else
		{
			System.out.println("Withdrawal error: insufficent funds");
		}
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {  
      return balance; 
   }
   
   /**
      Transfers money from the bank account to another account
      @param amount the amount to transfer
      @param other the other account
   */
   public void transfer(double amount, BankAccount other)
   {  
      withdraw(amount);
      other.deposit(amount);
   }
	
	
	//Note how the compareTo is supposed to work:
	//From the API:
	//Returns a negative integer, zero, or a positive 
	//integer as this object is less than, equal to, or greater than the specified object.
	public int compareTo(BankAccount other)
	{
		//I need to cast because i'm subtracting 2 doubles and the
		//return type is of type int
		return (int)(this.balance - other.balance);

	}
	
	public String toString()
	{
		return "BankAccount: balance = " + balance + "\n";
	}


}
