package racoon.importer.impl;

import racoon.entity.*;
import racoon.importer.Importer;

public class HardCodedImporter extends Importer
{
	@Override
	public void loadItems() {
		allItems.add(new Item("Perceval",""));
		allItems.add(new Item("Dark Vador",""));
		allItems.add(new Item("Boubou",""));
		allItems.add(new Item("Galy",""));
	}
	@Override
	public void loadQuestions() {
		allQuestions.add(new Question("","Qui a le plus gros nez ?"));
		allQuestions.add(new Question("","Qui pue le plus des pieds ?"));
		allQuestions.add(new Question("","Qui adore le couscous ?"));
	}
	@Override
	public void loadTags() {
		// TODO Auto-generated method stub
		super.loadTags();
	}
}
