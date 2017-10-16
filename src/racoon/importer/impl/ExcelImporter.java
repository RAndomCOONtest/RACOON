package racoon.importer.impl;

import java.util.List;

import racoon.entity.Item;
import racoon.entity.Question;
import racoon.importer.Importer;
import racoon.util.ExcelBrowser;

public class ExcelImporter extends Importer
{
	ExcelBrowser browser;
	public ExcelImporter()
	{
		browser = new ExcelBrowser();
	}
	
	@Override
	public void loadItems() 
	{
		List<List<String>> content = browser.getContent("D:\\Documents\\Documents\\Projet\\Racoon_2017\\Workspace\\racoon\\resources\\files\\ItemsContestants.xlsx","Items");
		for(int i = 1;i<content.size();i++)
		{
			String itemName = content.get(i).get(1);
			if(!itemName.equalsIgnoreCase(""))
				allItems.add(new Item(itemName,"")) ;
		}
	}
	@Override
	public void loadQuestions() {
		List<List<String>> content = browser.getContent("D:\\Documents\\Documents\\Projet\\Racoon_2017\\Workspace\\racoon\\resources\\files\\Questions.xlsx","Questions");
		for(int i = 1;i<content.size();i++)
		{
			String questionDesc = content.get(i).get(1);
			if(!questionDesc.equalsIgnoreCase(""));
				allQuestions.add(new Question("Question "+i,questionDesc)) ;
		}
	}
	@Override
	public void loadTags() {
		// TODO Auto-generated method stub
		super.loadTags();
	}
}
