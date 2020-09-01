package main;

import java.util.ArrayList;
import java.util.List;

public class Schedule 
{
	private int[] week;
	
	public int[] getWeek()
	{
		return week;
	}
	
	public void setWeek(int[] week)
	{
		this.week = week;
	}
	
	public void setEmpty(int[] week)
	{
		for (int i = 0; i < week.length; i++)
		{
			week[i] = 0;
		}
	}
	
	public boolean isEmpty(int[] week, int day)
	{
		if (week[day-1] == 0)
		{
			return true;
		}
		
		return false;
	}
	
	public void occupy(int[] week, int day)
	{
		week[day-1] = 1;
	}
	
	public int[] daysEmpty(int[] week)
	{
		int index = 0;
		
		for(int i = 0; i < week.length; i++)
		{
			if (week[i] == 1)
			{
				week[index++] = i + 1;
			}
		}
		
		int[] result = new int[index];
		System.arraycopy(week, 0, result, 0, index);
		
		return result;
	}
	
	public boolean isWenEmpty(int[] week)
	{
		if (week[2] == 0)
		{
			return true;
		}
		
		return false;
	}
}
