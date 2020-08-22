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
		
		p = new Player(name, 0, new ArrayList<String>() , 0, 0, 0, gender);
		
		return p;
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
			p = players.get(i);
			
			String male 	= "男";
			String female 	= "女";
			
			String name 	= p.getName();
			String gender 	= p.getGender() == 0 ? male : female;
			int score 		= p.getScore();
			int page 		= p.getPage();
			int heart 		= p.getHeart();
			int titleNumber = p.getTitleNumber();
			
			System.out.print(i + ".\t姓名:\t" 	+ name 			+ "\n"
							   + "\t性别:\t" 	+ gender 		+ "\n"
							   + "\t分数：\t" 	+ score 		+ "\n"
							   + "\t作业页数：\t" + page 			+ "\n"
							   + "\t获得爱心：\t" + heart 		+ "\n"
							   + "\t头衔数：\t" 	+ titleNumber 	+ "\n"
							   + "\t头衔：\t");
		}
	}
	
	public void printTitles(Player pl)
	{
		List<String> titles = pl.getTitles();
		
		for (int i = 0; i < titles.size(); i++)
		{
			String title = titles.get(i);
			
		}
	}
}
