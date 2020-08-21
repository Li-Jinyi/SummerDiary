package main;

import java.util.Scanner;

public class UI 
{
	private Scanner sc = new Scanner(System.in);
	private Player p;
	private Player[] players;
	private Generator g;
	private Names names;
	
	private int[] genders;
	//String name, int score, String[] titles, int titleNumber, int heart, int page
	
	public void welcome()
	{
		System.out.print("欢迎大家来到暑假日记~~相信规则都已经明白了吧^_^\n"
				 	   + "那么事不宜迟，就让我们开始吧！\n\n"
				 	   + "第一位玩家 ~");
		setupPlayer();
		
	}
	
	public Player setupPlayer()
	{
		System.out.print("请选择姓名~（输入数字）\n\n");
		names.printNames();
		int name = getIntInput();
		names.removeName(name-1);
		
		System.out.print("");
		
		return p;
	}
	
	public int getIntInput()
	{
		int i = sc.nextInt();
		return i;
	}
	
	public String getStringInput()
	{
		String s = sc.next();
		return s;
	}
	
	public int[] countData(int[] data)
	{
		int[] Data = {};
		return Data;
	}
}
