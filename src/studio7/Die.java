package studio7;

import java.util.Scanner;

public class Die {

	// Instance Variable
	private int n;
	private int rollNum;
	
	// Constructor
	public Die(int n) {
		this.n = n;
		this.rollNum = 0;
	}
	
	// Methods
	public int dieRoll() {
		rollNum += (int) (n*Math.random()+1);
		return rollNum;
	}
	
	public String toString() {
		String print = "This die has " + n + " sides.";
		return print;
	}

	// Getters
	public int getDieRoll() {
		return rollNum;
	}
	
	public int getSides() {
		return n;
	}
	
	// Setters
	public void setN(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Die dieOne = new Die(6);
		dieOne.dieRoll();
		System.out.println("A die with " + dieOne.getSides() + " sides is rolled to obtain " + dieOne.getDieRoll());
		// System.out.println("How many sides does your die have?");
		// int n = in.nextInt();
		// Die dieTwo = new Die(n);
	}

}
