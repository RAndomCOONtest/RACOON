package racoon.service.impl;

import racoon.importer.impl.*;
import racoon.service.GenerationStrategy;

public class AllRandomGenerationStrategy extends GenerationStrategy
{
	public AllRandomGenerationStrategy()
	{
		loader = new ExcelImporter();
	}
	@Override
	public void generate()
	{
		loader.load();
		int rdmNb = (int)((Math.random())*loader.getAllQuestions().size());
		this.drawnQuestion=loader.getAllQuestions().get(rdmNb);
		rdmNb = (int)((Math.random())*loader.getAllItems().size());
		this.drawnItem1 = loader.getAllItems().get(rdmNb);
		int rdmNb2 = (int)((Math.random())*loader.getAllItems().size());
		while(rdmNb2==rdmNb)
		{
			rdmNb2 = (int)((Math.random())*loader.getAllItems().size());
		}
		this.drawnItem2 = loader.getAllItems().get(rdmNb2);
	}

}
