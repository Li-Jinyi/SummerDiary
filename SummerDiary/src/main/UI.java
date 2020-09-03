package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UI 
{
	private Scanner sc = new Scanner(System.in);
	private Player p;
	private List<Player> players = new ArrayList<Player>();
	private Generator g;
	private Names names;
	private Cards cards = new Cards();;
	
	private int[] genders;
	private Card[] cardset;
	private Schedule weekONE;
	private Schedule weekTWO;
	private Schedule weekTHREE;
	private int[] join;
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
		
		genders = new int[3];
		genders[0] = players.get(0).getGender();
		genders[1] = players.get(1).getGender();
		genders[2] = players.get(2).getGender();
		
		printPlayersData();
		System.out.print("\n\n信息收录完毕，开始游戏了呦~哈吉马路！\n\n");
	}
	
	public void game()
	{
		cards.setupCards();
		int[] week = new int[] {0, 0, 0, 0, 0, 0, 0};
		weekONE = new Schedule(week);
		weekTWO = new Schedule(week);
		weekTHREE = new Schedule(week);
		
		for (int i = 0; i < 8; i++)
		{
			if (i == 0 || i == 1)
				cardset = cards.getCardsONE();
			else if (i == 2 || i == 3)
				cardset = cards.getCardsTWO();
			else if (i == 4 || i == 5)
				cardset = cards.getCardsTHREE();
			else
				cardset = cards.getCardsFOUR();
			
			System.out.print("第"+ (i+1) +"周的生活开始啦，");
			
			for (int j = 0; j < 3; j++)
			{
				System.out.print("请第" + (j+1) + "位玩家舍弃以下的一种活动，并组织另外两项");
				
				int[] randomNumber = cards.randomNumber();
				
				System.out.print("\n\n1.");
				cards.printCard(cardset[randomNumber[0]-1]);
				System.out.print("\n\n2.");
				cards.printCard(cardset[randomNumber[1]-1]);
				System.out.print("\n\n3.");
				cards.printCard(cardset[randomNumber[2]-1]);
				
				System.out.print("请选择舍弃的活动（输入数字）\n");
				int discard = getIntInput();
				randomNumber[discard-1] = 0;
				randomNumber = removeZero(randomNumber);
				
				Card cardONE = cardset[randomNumber[0]-1];
				Card cardTWO = cardset[randomNumber[1]-1];
				
				System.out.print("\n\n活动一，希望在哪一天举行这个活动？（输入数字，即起始日期）\n");
				int startDayONE = getIntInput();
				join = countJoin();
				
			}
		}
	}
	
	public void typeONE(int[] join, Card card)
	{
		int[] scores = card.getScores();
		int score;
		
		int joined = numberJoined(join);
		
		if (joined > 1)
		{
			score = scores[0];
		}
		else
		{
			score = scores[1];
		}
		
		players.get(0).addScore(score*join[0]);
		players.get(1).addScore(score*join[1]);
		players.get(2).addScore(score*join[2]);
	}
	
	public void typeTWO(int[] join, Card card)
	{
		int[] scores = card.getScores();
		int score;
		
		int joined = numberJoined(join);
		
		if (joined <= 1)
		{
			score = scores[2];
		}
		else if (joined % 2 == 0)
		{
			score = scores[0];
		}
		else
		{
			score = scores[1];
		}
		
		players.get(0).addScore(score*join[0]);
		players.get(1).addScore(score*join[1]);
		players.get(2).addScore(score*join[2]);
	}
	
	public void typeTHREE(int[] join, Card card)
	{
		int[] scores = card.getScores();
		int score;
		
		int joined = numberJoined(join);
		
		if (joined <= 1)
		{
			score = scores[2];
		}
		else if (joined % 2 == 0)
		{
			score = scores[1];
		}
		else
		{
			score = scores[0];
		}
		
		players.get(0).addScore(score*join[0]);
		players.get(1).addScore(score*join[1]);
		players.get(2).addScore(score*join[2]);
	}
	
	public void typeFOUR(int[] join, Card card, Player[] Players)
	{
		int[] scores = card.getScores();
		int score;
		
		if (scores.length == 2)
		{
			if (isHomo(join, Players))
			{
				score = scores[1];
			}
			else
			{
				score = scores[0];
			}
		}
		else
		{
			if (numberJoined(join) <= 1)
			{
				score = scores[2];
			}
			else if (isHomo(join, Players))
			{
				score = scores[1];
			}
			else
			{
				score = scores[0];
			}
		}

		players.get(0).addScore(score*join[0]);
		players.get(1).addScore(score*join[1]);
		players.get(2).addScore(score*join[2]);
	}
	
	public void typeFIVE(int[] join, Card card, Player[] Players)
	{
		int[] scores = card.getScores();
		int score;
		
		if (scores.length == 2)
		{
			if (isHomo(join, Players))
			{
				score = scores[0];
			}
			else
			{
				score = scores[1];
			}
		}
		else
		{
			if (numberJoined(join) <= 1)
			{
				score = scores[2];
			}
			else if (isHomo(join, Players))
			{
				score = scores[0];
			}
			else
			{
				score = scores[1];
			}
		}

		players.get(0).addScore(score*join[0]);
		players.get(1).addScore(score*join[1]);
		players.get(2).addScore(score*join[2]);
	}
	
	public void typeSIX(int[] join, Card card)
	{
		int[] scores = card.getScores();
		int score;
		
		if (numberJoined(join) == 3)
		{
			score = scores[0];
		}
		else
		{
			score = scores[1];
		}
		
		players.get(0).addScore(score*join[0]);
		players.get(1).addScore(score*join[1]);
		players.get(2).addScore(score*join[2]);
	}
	
	public void typeSEVEN(int[] join, Card card)
	{
		int[] scores = card.getScores();
		
		if (numberJoined(join) <= 1)
		{
			System.out.print("\nroll到了" + scores[0] + "呢！！\n");
			players.get(0).addScore((scores[0]+5)*join[0]);
			players.get(1).addScore((scores[1]+5)*join[1]);
			players.get(2).addScore((scores[2]+5)*join[2]);
		}
		else
		{
			System.out.print("\n让我康康，分别roll到了 ");
			for (int i = 0; i < numberJoined(join); i++)
			{
				System.out.print("\n" + scores[i]);
			}
			System.out.print("呀！\n斯国一！！");
			
			players.get(0).addScore(scores[0]*join[0]);
			players.get(1).addScore(scores[1]*join[1]);
			players.get(2).addScore(scores[2]*join[2]);
		}
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
		Player p = new Player(name, score, titles, titleNumber, heart, page, gender);
		
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
	
	public int checkCardType(int id)
	{
		if (id == 1 || id == 2 || id == 13 || id == 17 || id == 20 || id == 21)
		{
			return 1;
		}
		else if (id == 6 || id == 8 || id == 15)
		{
			return 2;
		}
		else if (id == 7 || id == 9 || id == 16 || id == 23)
		{
			return 3;
		}
		else if (id == 3 || id == 4 || id == 10 || id == 11 || id == 18 || id == 22)
		{
			return 4;
		}
		else if (id == 5 || id == 14)
		{
			return 5;
		}
		else if (id == 12)
		{
			return 6;
		}
		else if (id == 19)
		{
			return 7;
		}
		
		return 8;
	}
	
	public int numberJoined(int[] Join)
	{
		int result = 0;
		for (int i = 0; i < Join.length; i++)
		{
			if (Join[i] == 1)
			{
				result = result + 1;
			}
		}
		
		return result;
	}
	
	public boolean isHomo(int[] Join, Player[] Players)
	{
		int result = 0;
		
		for (int i = 0; i < Join.length; i++)
		{
			if (Join[i] == 1)
			{
				result = result + Players[i].getGender();
			}
		}
		
		if (result == numberJoined(Join))
		{
			return true;
		}
		
		return false;
	}
	
	public int[] removeZero(int[] array)
	{
		int index = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] == 1)
			{
				array[index++] = array[i];
			}
		}
		
		int[] result = new int[index];
		System.arraycopy(array, 0, result, 0, index);
		
		return result;
	}
	
	public int[] countJoin()
	{
		join = new int[] {0, 0, 0};
		
		System.out.print("\n\n有谁加入？（输入数字，即玩家号码,0为无人参与）\n");
		
		int firstJoin = getIntInput();
		if (!(firstJoin == 0))
		{
			join[firstJoin-1] = 1;
			System.out.print("\n\n还有谁！！！\n");
			int secondJoin = getIntInput();
			if (!(secondJoin == 0))
			{
				join[secondJoin-1] = 1;
				System.out.print("\n\n该不会都去吧？\n");
				int thirdJoin = getIntInput();
				if (!(thirdJoin == 0))
				{
					join[thirdJoin-1] = 1;
				}
			}
		}
		
		return join;
	}
}
