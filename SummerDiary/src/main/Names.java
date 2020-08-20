package main;

import java.util.ArrayList;
import java.util.List;

public class Names 
{
	private List<String> names;
	
	public void setNames()
	{
		names = new ArrayList<String>();
		
		String  a = "阿伟";
		names.add(a);
		
		String  b = "皮皮";
		names.add(b);
		
		String  c = "秃头";
		names.add(c);
		
		String  d = "莉莉";
		names.add(d);
		
		String  e = "喵喵";
		names.add(e);
		
		String  f = "杰哥";
		names.add(f);
		
		String  g = "番茄";
		names.add(g);
		
		String  h = "小黑";
		names.add(h);
		
		String  i = "彬彬";
		names.add(i);
		
		String  j = "西西";
		names.add(j);
		
		String  k = "阿根";
		names.add(k);
		
		String  l = "利卡";
		names.add(l);
	}
	
	public List<String> getNames()
	{
		return names;
	}
	
	public void removeName(int i)
	{
		names.remove(i);
	}
	
	public void printNames()
	{
		for(int i = 0; i < names.size(); i++)
		{
			int index = i+1;
			System.out.print(index + "\t" + names.get(i) + "\n");
		}
	}
}
