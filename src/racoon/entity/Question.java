package racoon.entity;

import java.util.ArrayList;
import java.util.List;

public class Question extends NamedElement
{
	private List<Contest> contests;
	
	public Question(String name,String desc)
	{
		this.name = name;
		this.desc = desc;
		contests = new ArrayList<Contest>();
	}
	
	public List<Contest> getContests()
	{
		return contests;
	}
	
	@Override
	public String toString() 
	{
		return desc;
	}
}
