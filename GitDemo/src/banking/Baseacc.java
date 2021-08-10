package banking;

import java.util.Scanner;

public abstract class Baseacc {
	int balance;
	int accnum;
	String name;
	int Savbal;
	Scanner sc = new Scanner(System.in);
	
	public abstract void With();
	public abstract void dep();
}
