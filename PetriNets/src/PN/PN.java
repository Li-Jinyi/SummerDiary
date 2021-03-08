package PN;

import java.util.List;
import java.util.Map;

public class PN 
{
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
	
	public PN(List<Integer> pt, List<Integer> tp, List<Integer> wpt, List<Integer> wtp, List<Integer> m)
	{
		this.pt  = pt;
		this.tp  = tp;
		this.wpt = wpt;
		this.wtp = wtp;
		this.m   = m;
	}
}
