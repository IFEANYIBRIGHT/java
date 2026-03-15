public class BrightPay{

	double balance;

	public void deposit(double amount){
		balance += amount;
	} 

	public double getBalance(){
		return balance;
	}

	public void withdraw(double amount){
		if (amount > balance)
		throw new IllegalArgumentException("THIEF!!!");
		balance -= amount;

	}
 


   public double transferMoney(int transfer){
    
    transfer -= balance;
    }

return transfer;
}

