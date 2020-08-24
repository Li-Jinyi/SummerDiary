package main;

public class Card 
{
	private int ID;
	private String name;
	private int day;
	private int heart;
	private int[] scores;
	private int[] pages;
	private String title;
	
	public Card(int ID, String name, int day, int heart, int[] scores, int[] pages, String title)
	{
		setID(ID);
		setName(name);
		setDay(day);
		setScores(scores);
		setPages(pages);
		setTitle(title);
	}
	
	public int getID() 
	{
		return ID;
	}
	
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getDay() 
	{
		return day;
	}
	
	public void setDay(int day) 
	{
		this.day = day;
	}
	
	public int getHeart()
	{
		return heart;
	}
	
	public void setHeart(int heart)
	{
		this.heart = heart;
	}
	
	public int[] getScores() 
	{
		return scores;
	}
	
	public void setScores(int[] scores) 
	{
		this.scores = scores;
	}
	
	public int[] getPages()
	{
		return pages;
	}
	
	public void setPages(int[] pages)
	{
		this.pages = pages;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
	
	
}
