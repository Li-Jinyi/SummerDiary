package main;

public class Player 
{
	private String name;
	private int score;
	private String[] titles;
	private int titleNumber;
	private int heart;					// refer to heart got from others
	private int page;					// refer to pages of homework completed
	private int gender;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getScore() 
	{
		return score;
	}
	
	public void setScore(int score) 
	{
		this.score = score;
	}
	
	public String[] getTitles() 
	{
		return titles;
	}
	
	public void setTitles(String[] titles) 
	{
		this.titles = titles;
	}
	
	public int getTitleNumber() 
	{
		return titleNumber;
	}
	
	public void setTitleNumber(int titleNumber) 
	{
		this.titleNumber = titleNumber;
	}
	
	public int getHeart() 
	{
		return heart;
	}
	
	public void setHeart(int heart) 
	{
		this.heart = heart;
	}
	
	public int getPage() 
	{
		return page;
	}
	
	public void setPage(int page) 
	{
		this.page = page;
	}
	
	public int getGender() 
	{
		return gender;
	}
	
	public void setGender(int gender) 
	{
		this.gender = gender;
	}

	public Player setPlayer(String name, int score, String[] titles, int titleNumber, int heart, int page, int gender)
	{
		Player p = new Player();
		
		p.setName(name);
		p.setScore(score);
		p.setTitles(titles);
		p.setTitleNumber(titleNumber);
		p.setHeart(heart);
		p.setPage(page);
		p.setGender(gender);
		
		return p;
	}
}
