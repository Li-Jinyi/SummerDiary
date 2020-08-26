package main;

public class Setup 
{
	private Card[] cardsONE;
	private Card[] cardsTWO;
	private Card[] cardsTHREE;
	private Card[] cardsFOUR;
	
	public void setupCards()
	{
		setupCardsONE();
	}
	
	// int ID, String name, int day, int heart, int[] scores, int[] pages, String title
	public void setupCardsONE()
	{
		cardsONE = new Card[6];
		
		cardsONE[0] = new Card(1, 	"TA回来啦！去机场接TA吧！", 	1, 1, new int[] {6, 4, 0}, 	null, "怎么就你一个啊");
		cardsONE[1] = new Card(2, 	"真人剧本杀", 				1, 2, new int[] {4, 2, 0}, 	null, "我福尔摩斯不需要别人的帮助！");
		cardsONE[2] = new Card(3, 	"回一中", 					1, 3, new int[] {8, 6, 10}, null, "哦， 是你啊");
		cardsONE[3] = new Card(4, 	"KTV小跳蛙！", 				1, 2, new int[] {6, 4, 8}, 	null, "见习魔法师");
		cardsONE[4] = new Card(5, 	"海底捞", 					1, 2, new int[] {6, 4, 2}, 	null, "有点尬");
		cardsONE[5] = new Card(6, 	"密室逃脱", 					2, 3, new int[] {8, 6, 2}, 	null, "不想和陌生人组队");
	}
	
	public void setupCardsTWO()
	{
		cardsTWO = new Card[6];
		
		cardsTWO[0] = new Card(7, 	"听说罗小黑大电影上映了", 		0, 0, new int[] {}, null, "");
		cardsTWO[1] = new Card(8, 	"一起来L4D2吧！", 			0, 0, new int[] {}, null, "");
		cardsTWO[2] = new Card(9, 	"MC才是坠吼滴！", 			0, 0, new int[] {}, null, "");
		cardsTWO[3] = new Card(10, 	"锡惠公园好像也不错", 			0, 0, new int[] {}, null, "");
		cardsTWO[4] = new Card(11, 	"啊太湖的水我的泪", 			0, 0, new int[] {}, null, "");
		cardsTWO[5] = new Card(12, 	"For The King！！", 			0, 0, new int[] {}, null, "");
	}
	
	public void setupCardsTHREE()
	{
		cardsTHREE = new Card[6];
		
		cardsTHREE[0] = new Card(13, "我抢到CP展的门票了", 		0, 0, new int[] {}, null, "");
		cardsTHREE[1] = new Card(14, "逛GAI", 					0, 0, new int[] {}, null, "");
		cardsTHREE[2] = new Card(15, "家庭旅行", 					0, 0, new int[] {}, null, "");
		cardsTHREE[3] = new Card(16, "巴蜀三日游", 				0, 0, new int[] {}, null, "");
		cardsTHREE[4] = new Card(17, "游戏，不打不行！", 			0, 0, new int[] {}, null, "");
		cardsTHREE[5] = new Card(18, "帮TA穿女装", 				0, 0, new int[] {}, null, "");
	}
	
	public void setupCardsFOUR()
	{
		cardsFOUR = new Card[6];
		
		cardsFOUR[0] = new Card(19,  "啊啊啊要来不及写作业了！", 	0, 0, new int[] {}, null, "");
		cardsFOUR[1] = new Card(20,  "作业？我就是要打游戏！", 		0, 0, new int[] {}, null, "");
		cardsFOUR[2] = new Card(21,  "再来一次海底捞吧", 			0, 0, new int[] {}, null, "");
		cardsFOUR[3] = new Card(22,  "甄嬛传还是好看的呀", 		0, 0, new int[] {}, null, "");
		cardsFOUR[4] = new Card(23,  "去迪士尼VAN~", 				0, 0, new int[] {}, null, "");
		cardsFOUR[5] = new Card(24,  "谁是运气王！", 				0, 0, new int[] {}, null, "");
	}
	
}
