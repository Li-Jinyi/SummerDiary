package main;

import java.util.ArrayList;
import java.util.List;

public class Player 
{
	private String name;
	private int score;
	private List<String> titles = new ArrayList<String>();
	private int titleNumber;
	private int heart;					// refer to heart got from others
	private int page;					// refer to pages of homework completed
	private int gender;
	
	public Player(String name, int score, List<String> titles, int titleNumber, int heart, int page, int gender)
	{
		setName(name);
		setScore(score);
		setTitles(titles);
		setTitleNumber(titleNumber);
		setHeart(heart);
		setPage(page);
		setGender(gender);
	}
	
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
	
	public List<String> getTitles() 
	{
		return titles;
	}
	
	public void setTitles(List<String> titles) 
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

	
}
