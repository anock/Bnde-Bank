package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("Enter account number: ");

		int number = sc.nextInt();

		System.out.println("enter account holder:  ");
		sc.nextLine();

		String holder = sc.nextLine();

		System.out.println("Is there an initial deposit (y/n)?");

		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value : "); //inicia cnta com saldo. 
			double initialDeposit = sc.nextDouble();

			account = new Account(number, holder, initialDeposit);
		}

		else {
			account = new Account(number, holder); //inicia a conta sem saldo .
		}

		System.out.println();
		System.out.println("Account data :");
		System.out.println(account);

		// Deposito
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("update account value ");
		System.out.println(account);

		// saque
		System.out.println();
		System.out.println("Enter widthdraw value: ");
		double widthValue = sc.nextDouble();
		account.withdraw(widthValue);
		System.out.println("update account value ");
		System.out.println(account);

		sc.close();

	}

}
