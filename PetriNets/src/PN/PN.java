package PN;

import java.util.List;
import java.util.Map;

public class PN 
{
	// places
	private List<Integer> p;
	// transitions
	private List<Integer> t;
	
	// flow relation, form places to transitions
	private List<Integer> pt;
	// flow relation, from transitions to places
	private List<Integer> tp;
	
	// weight function for pt
	private List<Integer> wpt;
	//weight function for tp
	private List<Integer> wtp;
	
	// initial marking
	private List<Integer> m;
	
	public PN()
	{
		
	}
	
	public PN(List<Integer>p, List<Integer> t, List<Integer> pt, List<Integer> tp, List<Integer> wpt, List<Integer> wtp, List<Integer> m)
	{
		this.p = p;
		this.t = t;
		this.pt  = pt;
		this.tp  = tp;
		this.wpt = wpt;
		this.wtp = wtp;
		this.m   = m;
	}

	public List<Integer> getP() 
	{
		return p;
	}

	public void setP(List<Integer> p) 
	{
		this.p = p;
	}

	public List<Integer> getT() 
	{
		return t;
	}

	public void setT(List<Integer> t) 
	{
		this.t = t;
	}

	public List<Integer> getPt() 
	{
		return pt;
	}

	public void setPt(List<Integer> pt) 
	{
		this.pt = pt;
	}

	public List<Integer> getTp() 
	{
		return tp;
	}

	public void setTp(List<Integer> tp) 
	{
		this.tp = tp;
	}

	public List<Integer> getWpt() 
	{
		return wpt;
	}

	public void setWpt(List<Integer> wpt) 
	{
		this.wpt = wpt;
	}

	public List<Integer> getWtp() 
	{
		return wtp;
	}

	public void setWtp(List<Integer> wtp) 
	{
		this.wtp = wtp;
	}

	public List<Integer> getM() 
	{
		return m;
	}

	public void setM(List<Integer> m) 
	{
		this.m = m;
	}
}
