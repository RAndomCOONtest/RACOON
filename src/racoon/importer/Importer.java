package racoon.importer;

import java.util.ArrayList;
import java.util.List;

import racoon.entity.Item;
import racoon.entity.Question;
import racoon.entity.Tag;

public abstract class Importer 
{
	protected List<Item> allItems;
	protected List<Question> allQuestions;
	protected List<Tag> allTags;
	
	private void initialise()
	{
		allItems = new ArrayList<Item>();
		allQuestions = new ArrayList<Question>();
		allTags = new ArrayList<Tag>();
	}
	public void load()
	{
		initialise();
		loadItems();
		loadQuestions();
		loadTags();
	}
	public void loadItems()
	{
		
	}
	
	public void loadQuestions()
	{
		
	}

	public void loadTags()
	{
		
	}
	
	public List<Item> getAllItems() {
		return allItems;
	}

	public List<Question> getAllQuestions() {
		return allQuestions;
	}

	public List<Tag> getAllTags() {
		return allTags;
	}
}
