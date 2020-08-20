package main;

public class Generator 
{
	public static final int MAXIMAM = 6;

	public int generateRandomNumber() {

		int min = 1;
		int number = 0;

		number = (int) ((Math.random() * ((MAXIMAM - min) + 1)) + min);
		
		return number;
	}
}
