package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) { //metodo construtor de dois argumentos 
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialdeposit) { //metodo construtor de 3 argumentos 
		
		this.number = number;
		this.holder = holder;
		deposit(initialdeposit);
	}

	public int getNumber() {
		return number;
	}

	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) { // deposito 
		balance += amount;
	}
	
	public void withdraw(double amount) { // saque com taxa de 5.00
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account : "
				+ number
				+", Holder: "
				+holder
				+", Balance : $ "
				+String.format("%.2f", balance);
		
	}
	
	

}