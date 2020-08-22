package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI 
{
	private Scanner sc = new Scanner(System.in);
	private Player p;
	private List<Player> players = new ArrayList<Player>();
	private Generator g;
	private Names names;
	
	private int[] genders;
	//String name, int score, String[] titles, int titleNumber, int heart, int page
	
	public void welcome()
	{
		names = new Names();
		names.setNames();
		System.out.print("欢迎大家来到暑假日记~~相信规则都已经明白了吧^_^\n"
				 	   + "那么事不宜迟，就让我们开始吧！\n\n"
				 	   + "第一位玩家 ~");
		players.add(setupPlayer());
		
		System.out.print("\n\n第二位玩家~");
		players.add(setupPlayer());
		
		System.out.print("\n\n第三位玩家~");
		players.add(setupPlayer());
		
		printPlayersData();
		System.out.print("\n\n信息收录完毕，开始游戏了呦~哈吉马路！\n\n");
	}
	
	public Player setupPlayer()
	{
		System.out.print("请选择姓名~（输入数字）\n\n");
		names.printNames();
		int n = getIntInput();
		String name = names.getNames().get(n-1);
		names.removeName(n-1);
		
		System.out.print("请选择性别~（输入数字，0为男，1为女）\n");
		int gender = getIntInput();
		
		return new Player(name, 0, new ArrayList<String>() , 0, 0, 0, gender);
	}
	
	public Player setPlayer(String name, int score, List<String> titles, int titleNumber, int heart, int page, int gender)
	{
		Player p = new Player(name, gender, titles, gender, gender, gender, gender);
		
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
	
	public void printPlayersData()
	{
		for (int i = 0; i < players.size(); i++)
		{
			Player pl = players.get(i);
			
			String male 	= "男";
			String female 	= "女";
			
			String name 	= pl.getName();
			String gender 	= pl.getGender() == 0 ? male : female;
			int score 		= pl.getScore();
			int page 		= pl.getPage();
			int heart 		= pl.getHeart();
			int titleNumber = pl.getTitleNumber();
			
			System.out.print("\n" + (i+1) + ".\t姓名:\t\t" 	+ name 			+ "\n"
										  + "\t性别:\t\t" 	+ gender 		+ "\n"
										  + "\t分数：\t\t" 	+ score 		+ "\n"
										  + "\t作业页数：\t" 	+ page 			+ "\n"
										  + "\t获得爱心：\t" 	+ heart 		+ "\n"
										  + "\t头衔数：\t\t" 	+ titleNumber 	+ "\n"
										  + "\t头衔：\n");
			
			if (titleNumber > 0)
			{
				printTitles(p);
			}
			else
			{
				System.out.print("无\n");
			}
		}
	}
	
	public void printTitles(Player pl)
	{
		List<String> titles = pl.getTitles();
		
		for (int i = 0; i < titles.size(); i++)
		{
			String title = titles.get(i);
			System.out.print("\t\t\t" + title + "\n");
		}
	}
}
