
public class Account
{
	private float balance; // variável de instancia que armazena o saldo
	
	//construtor
	public Account (float initialBalance)
	{
		if (initialBalance > 0.0)
			balance = initialBalance;
	}
	
	public void credit(float amount)
	{
		balance = balance + amount;
	}
	
	public float getBalance()
	{
		return balance;
	}
}
