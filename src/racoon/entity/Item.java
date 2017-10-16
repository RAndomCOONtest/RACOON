package racoon.entity;

import java.util.ArrayList;
import java.util.List;

public class Item extends NamedElement
{
	private String image;
	private int score;
	private List<Contest> contestsW;
	private List<Contest> contestsL;
	
	public Item()
	{
		contestsW = new ArrayList<Contest>();
		contestsL = new ArrayList<Contest>();
	}
	
	public Item(String name,String desc)
	{
		contestsW = new ArrayList<Contest>();
		contestsL = new ArrayList<Contest>();
		this.name=name;
		this.desc=desc;
	}
	
	public Item(String name,String desc,String image)
	{
		contestsW = new ArrayList<Contest>();
		contestsL = new ArrayList<Contest>();
		this.name=name;
		this.desc=desc;
		this.image = image;
	}
	
	public List<Contest> getContestsWinner()
	{
		return contestsW;
	}
	
	public List<Contest> getContestsLoser()
	{
		return contestsL;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int score)
	{
		this.score=score;
	}
	
	public String getImage()
	{
		return image;
	}
	
	public void setImage(String image)
	{
		this.image=image;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
