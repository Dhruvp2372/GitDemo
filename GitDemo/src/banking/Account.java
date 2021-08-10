package banking;

import java.util.Random;
public class Account extends Baseacc{

	public void CurrentAccount() {	
		System.out.println("Welcome to Chase Bank: We will start off by setting up your Checking Account");
		System.out.print("Please provide your Legal Name: ");
		name = sc.nextLine();
		System.out.print("Please provide your starting balance: ");
		balance = sc.nextInt();
		if(balance < 300) {
			System.out.print("Please provide more starting balance(Min required: 300): ");
			balance = sc.nextInt();	
		}
		Random randomnum = new Random();
		for (int i = 0; i <= 1; ++i) {
			accnum = randomnum.nextInt(100000000);
		}
		System.out.println("Your Accout Number is: " + accnum);
		System.out.println("><-----><-----><-----><-----><-----><");
	}
	
	public void Savings(){		
		int month;
		System.out.println("Hi! Would you also like to create a Saving Account(Y/N)");
		char r = sc.next().charAt(0);
		
		if(r == 'N') {
			System.out.println("This appliction is declined due to user not cooperating with process"); 
			System.out.println("Thank you for your time, Have a good day!!!");
			System.out.println("><-----><-----><-----><-----><-----><");
		}else if(r == 'Y'){
			System.out.print("Please provide your starting SB Balance: ");
			Savbal = sc.nextInt();
			if(Savbal < 100) {
				System.out.print("Please provide your starting SB balance again (Min Required : 100): ");
				Savbal = sc.nextInt();
			}
			double calc = (Savbal * 0.04);
			double total = (calc + Savbal);
			System.out.println("INFO TIME!!!!!!");
			System.out.println("The bank will pay 4% intrest rate every month, YAYYY!!!!");
			System.out.println("You can also know your balance for any of 12 upcoming months");
			System.out.print("What months balance would you like to know at this rate (ex: 1,6,8): ");
			month = sc.nextInt();
			double fina = calc*month;
			System.out.println("Your balance after " + month + " months would be: " + (fina+total));
			System.out.println("><-----><-----><-----><-----><-----><");
			With();
			dep();
		}else {
			System.out.println("Application was denied due to not cooperating");
			System.out.println("><-----><-----><-----><-----><-----><");
		}
					
	}
	
	public void With(){
		System.out.println("Would you like to withdraw money?(Y/N)");
		char w = sc.next().charAt(0);
		if(w == 'N') {
			System.out.println("No money will be withdrawn from your acc");
			System.out.println("><-----><-----><-----><-----><-----><");
		}else if(w == 'Y') {
			double withdraw;
			System.out.println("How much money would you like to withdraw?");
			withdraw = sc.nextDouble();
			System.out.println("Your remaining balance is " + (Savbal - withdraw));
		}
	}
	
	public void dep(){
		System.out.println("Would you like to Deposit money?(Y/N)");
		char d = sc.next().charAt(0);
		if(d == 'N') {
			System.out.println("No money will be deposited in your acc");
			System.out.println("><-----><-----><-----><-----><-----><");
		}else if(d == 'Y') {
			double Deposit;
			System.out.println("How much money would you like to withdraw?");
			Deposit = sc.nextDouble();
			System.out.println("Your remaining balance is " + (Savbal + Deposit));
		}
	}
}
