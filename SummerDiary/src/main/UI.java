package main;

import java.util.Scanner;

public class UI 
{
	private Scanner sc = new Scanner(System.in);
	private Player p;
	private Player[] players;
	private Generator g;
	//String name, int score, String[] titles, int titleNumber, int heart, int page
	
	public String welcome()
	{
		String i = "欢迎大家来到暑假日记~~相信规则都已经明白了吧^_^\n"
				 + "那么事不宜迟，就让我们开始吧！\n\n"
				 + "请问有几位玩家呢？ （虽然知道肯定是三位但还是要问一下的，输入数字）\n";
		return i;
	}
	
	public void setupPlayer()
	{
		System.out.print("请选择姓名~\n");
		
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
}
