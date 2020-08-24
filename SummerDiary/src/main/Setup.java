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
		
		cardsTWO[0] = new Card(7, 	null, 0, 0, null, null, null);
		cardsTWO[1] = new Card(8, 	null, 0, 0, null, null, null);
		cardsTWO[2] = new Card(9, 	null, 0, 0, null, null, null);
		cardsTWO[3] = new Card(10, 	null, 0, 0, null, null, null);
		cardsTWO[4] = new Card(11, 	null, 0, 0, null, null, null);
		cardsTWO[5] = new Card(12, 	null, 0, 0, null, null, null);
	}
	
}
