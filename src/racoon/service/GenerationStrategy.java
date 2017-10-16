package racoon.service;

import racoon.entity.Item;
import racoon.entity.Question;
import racoon.entity.Tag;
import racoon.importer.Importer;

public abstract class GenerationStrategy 
{
	protected Item drawnItem1;
	protected Item drawnItem2;
	protected Question drawnQuestion;
	protected Importer loader;
	
	public void generate()
	{
	}
	
	public Item getDrawnItem1() {
		return drawnItem1;
	}

	public Item getDrawnItem2() {
		return drawnItem2;
	}

	public Question getDrawnQuestion() {
		return drawnQuestion;
	}
	
	@Override
	public String toString() {
		return "Question : " + drawnQuestion.toString()+"\n" 
				+ "Choix 1 : " + drawnItem1.toString() + "\n" 
				+ "Choix 2 : " + drawnItem2.toString() + "\n";
	}
	
}
