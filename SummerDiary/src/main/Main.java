package main;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Generator g = new Generator();
		
		int i = g.generateRandomNumber();
		int j = g.generateRandomNumber();
		int k = g.generateRandomNumber();
		
		while (j == i)
		{
			j = g.generateRandomNumber();
		}
		while (k == i || k == j)
		{
			k = g.generateRandomNumber();
		}
		
		System.out.print(i + "" + j + "" + k);
	}

}
