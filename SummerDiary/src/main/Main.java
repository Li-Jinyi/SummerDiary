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
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		System.out.print(l.get(0) + " " + l.get(1) + " " + l.get(2) + "\n");
		
		l.remove(1);
		
		System.out.print(l.get(0) + " " + l.get(1));
	}

}
