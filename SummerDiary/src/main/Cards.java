package main;

public class Cards 
{
	private Card[] cardsONE;
	private Card[] cardsTWO;
	private Card[] cardsTHREE;
	private Card[] cardsFOUR;
	private Generator g = new Generator();;
	
	public void setupCards()
	{
		setupCardsONE();
		setupCardsTWO();
		setupCardsTHREE();
		setupCardsFOUR();
	}
	
	// int ID, String name, int day, int heart, int[] scores, int[] pages, String title
	public void setupCardsONE()
	{
		cardsONE = new Card[6];
		
		cardsONE[0] = new Card(1, 	"TA回来啦！去机场接TA吧！", 	1, 1, new int[] {6, 4}, 	null, "怎么就你一个啊");
		cardsONE[1] = new Card(2, 	"真人剧本杀", 				1, 2, new int[] {4, 2}, 	null, "我福尔摩斯不需要别人的帮助！");
		cardsONE[2] = new Card(3, 	"回一中", 					1, 3, new int[] {8, 6, 10}, null, "哦， 是你啊");
		cardsONE[3] = new Card(4, 	"KTV小跳蛙！", 				1, 2, new int[] {6, 4, 8}, 	null, "见习魔法师");
		cardsONE[4] = new Card(5, 	"海底捞", 					1, 2, new int[] {6, 4, 2}, 	null, null);
		cardsONE[5] = new Card(6, 	"密室逃脱", 					2, 3, new int[] {8, 6, 2}, 	null, "不想和陌生人组队");
	}
	
	public Card[] getCardsONE()
	{
		return cardsONE;
	}
	
	public void setupCardsTWO()
	{
		cardsTWO = new Card[6];
		
		cardsTWO[0] = new Card(7, 	"听说罗小黑大电影上映了", 		1, 2, new int[] {6, 4, 4}, 	null, null);
		cardsTWO[1] = new Card(8, 	"一起来L4D2吧！", 			1, 1, new int[] {6, 4, 2}, 	null, "你们三个怎么落单了");
		cardsTWO[2] = new Card(9, 	"MC才是坠吼滴！", 			1, 1, new int[] {8, 6, 2}, 	null, "为什么要开服务器？");
		cardsTWO[3] = new Card(10, 	"锡惠公园好像也不错", 		2, 2, new int[] {8, 6, 12}, null, null);
		cardsTWO[4] = new Card(11, 	"啊太湖的水我的泪", 			2, 3, new int[] {10, 8, 6}, null, "蓝蓝的天空银河里");
		cardsTWO[5] = new Card(12, 	"For The King！！", 			1, 1, new int[] {8, 6}, 	null, "一人分饰多角");
	}
	
	public Card[] getCardsTWO()
	{
		return cardsTWO;
	}
	
	public void setupCardsTHREE()
	{
		cardsTHREE = new Card[6];
		
		cardsTHREE[0] = new Card(13, "我抢到CP展的门票了", 		2, 2, new int[] {10, 6}, 	null, "房费都没人平摊");
		cardsTHREE[1] = new Card(14, "逛GAI", 					1, 1, new int[] {8, 6, 2}, 	null, null);
		cardsTHREE[2] = new Card(15, "家庭旅行", 				2, 2, new int[] {10, 8, 6}, null, "和睦的家庭");
		cardsTHREE[3] = new Card(16, "巴蜀三日游", 				3, 3, new int[] {10, 8, 6}, null, "医院人好多");
		cardsTHREE[4] = new Card(17, "游戏，不打不行！", 			1, 1, new int[] {6, 4}, 	null, null);
		cardsTHREE[5] = new Card(18, "帮TA穿女装", 				1, 3, new int[] {12, 6}, 	null, "斯巴拉西");
	}
	
	public Card[] getCardsTHREE()
	{
		return cardsTHREE;
	}
	
	public void setupCardsFOUR()
	{
		cardsFOUR = new Card[6];
		
		cardsFOUR[0] = new Card(19,  "啊啊啊要来不及写作业了！", 	1, 0, null, randomNumber(),		  "你们都做完了？");
		cardsFOUR[1] = new Card(20,  "作业？我就是要打游戏！", 	1, 0, new int[] {4, 2}, 	null, "那你很勇哦");
		cardsFOUR[2] = new Card(21,  "再来一次海底捞吧", 			1, 0, new int[] {8, 6}, 	null, "到头来不过是");
		cardsFOUR[3] = new Card(22,  "甄嬛传还是好看的呀", 		1, 0, new int[] {6, 4}, 	null, null);
		cardsFOUR[4] = new Card(23,  "去迪士尼VAN~", 			3, 0, new int[] {12, 8, 6}, null, "我很快乐，真的");
		cardsFOUR[5] = new Card(24,  "谁是运气王！", 				1, 0, randomNumber(), 		null, null);
	}
	
	public Card[] getCardsFOUR()
	{
		return cardsFOUR;
	}
	
	public void printCard(Card card)
	{
		String name 	= card.getName();
		int id 			= card.getID();
		int day 		= card.getDay();
		int heart 		= card.getHeart();
		String title 	= card.getTitle();
		
		System.out.print(name + "\n\n");
		
		if (id == 1 || id == 2 || id == 13 || id == 17 || id == 20 || id == 21)
		{
			System.out.print("多人出游：每人+" + card.getScores()[0] + "分\n" +
							 "单人出游：每人+" + card.getScores()[1] + "分");
			if (!(title == null))
			{
				System.out.print("，并获得称号：" + title);
			}
			System.out.print("\n天数：" + day + "\n" + 
							 "爱心：" + heart);
			
		}
		else if (id == 6 || id == 8 || id == 15)
		{
			System.out.print("偶数人出游：每人+" + card.getScores()[0] + "分\n" +
					 		 "奇数人出游：每人+" + card.getScores()[1] + "分");
			if (card.getScores().length == 3)
			{
				System.out.print("\n单人出游：每人+" + card.getScores()[2] + "分");
			}
			if (!(title == null))
			{
				System.out.print("，并获得称号：" + title);
			}
			System.out.print("\n天数：" + day + "\n" + 
							 "爱心：" + heart);
		}
		else if (id == 7 || id == 9 || id == 16 || id == 23)
		{
			System.out.print("奇数人出游：每人+" + card.getScores()[0] + "分\n" +
			 		 		 "偶数人出游：每人+" + card.getScores()[1] + "分");
			if (card.getScores().length == 3)
			{
				System.out.print("\n单人出游：每人+" + card.getScores()[2] + "分");
			}
			if (!(title == null))
			{
				System.out.print("，并获得称号：" + title);
			}
			System.out.print("\n天数：" + day + "\n" + 
					 		 "爱心：" + heart);
		}
		else if (id == 3 || id == 4 || id == 10 || id == 11 || id == 18 || id == 22)
		{
			System.out.print("同性出游：每人+" + card.getScores()[0] + "分\n" +
							 "异性出游：每人+" + card.getScores()[1] + "分");
			if (card.getScores().length == 3)
			{
				System.out.print("\n单人出游：每人+" + card.getScores()[2] + "分");
			}
			if (!(title == null))
			{
				System.out.print("，并获得称号：" + title);
			}
			System.out.print("\n天数：" + day + "\n" + 
			 		 		 "爱心：" + heart);
		}
		else if (id == 5 || id == 14)
		{
			System.out.print("异性出游：每人+" + card.getScores()[0] + "分\n" +
					 		 "同性出游：每人+" + card.getScores()[1] + "分");
			if (card.getScores().length == 3)
			{
				System.out.print("\n单人出游：每人+" + card.getScores()[2] + "分");
			}
			if (!(title == null))
			{
				System.out.print("，并获得称号：" + title);
			}
			System.out.print("\n天数：" + day + "\n" + 
	 		 		 		 "爱心：" + heart);
		}
		else if (id == 12)
		{
			System.out.print("人数为3：每人+8分\n除此以外：每人+6分，并获得称号：" + title);
		}
		else if (id == 19)
		{
			System.out.print("玩家进行1~6的点数判定，出现的点数即是本活动完成的作业点数\n"
						   + "一个人：作业完成度+5，并获得称号：" + title);
		}
		else
		{
			System.out.print("参与的玩家进行投骰子比试，获得的分数就是骰面大小");
		}
	}
	
	public int[] randomNumber()
	{
		int i = g.generateRandomNumber();
		int j = g.generateRandomNumber();
		int k = g.generateRandomNumber();
		
		int[] array = {i, j, k};
		
		return array;
	}
	
	public Card pickUpCard(Card[] cards)
	{
		int i = g.generateRandomNumber();
		
		Card card = cards[i-1];
		
		return card;
	}
	
	public Card[] pickUpCards(Card[] cards)
	{
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
		
		Card cardONE 	= cards[i-1];
		Card cardTWO 	= cards[j-1];
		Card cardTHREE 	= cards[k-1];
		
		Card[] Cards = {cardONE, cardTWO, cardTHREE};
		
		return Cards;
	}
}
