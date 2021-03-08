package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
//		Cards c = new Cards();
//		c.setupCards();
//		
//		Card[] cardsONE = c.getCardsONE();
//		Card[] cardsTWO = c.getCardsTWO();
//		Card[] cardsTHREE = c.getCardsTHREE();
//		Card[] cardsFOUR = c.getCardsFOUR();
//		
//		for (int i = 0; i < cardsONE.length; i++)
//		{
//			c.printCard(cardsONE[i]);
//			System.out.print("\n\n");
//		}
//		
//		for (int i = 0; i < cardsTWO.length; i++)
//		{
//			c.printCard(cardsTWO[i]);
//			System.out.print("\n\n");
//		}
//		
//		for (int i = 0; i < cardsTHREE.length; i++)
//		{
//			c.printCard(cardsTHREE[i]);
//			System.out.print("\n\n");
//		}
//		
//		for (int i = 0; i < cardsFOUR.length; i++)
//		{
//			c.printCard(cardsFOUR[i]);
//			System.out.print("\n\n");
//		}
		
//		UI ui = new UI();
//		ui.welcome();
//		ui.game();
		
		double x=Math.random();
		double y=2.0;
		System.out.println("x: " + x + "	y: " + y + "\n");
		
		x+=y+1;
		System.out.println("x: " + x + "	y: " + y + "\n");
		
		double z=x-y;
		System.out.println("x: " + x + "	y: " + y + "	z: " + z + "\n");
		
		x=Math.random();
		System.out.println("x: " + x + "	y: " + y + "	z: " + z + "\n");
		
		if(x>0.5){
		  x=0.5;
		}
		
		System.out.println("x: " + x + "	y: " + y + "	z: " + z + "\n");
	}

}
