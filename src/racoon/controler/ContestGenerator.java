package racoon.controler;

import racoon.service.GenerationStrategy;
import racoon.service.impl.AllRandomGenerationStrategy;

public class ContestGenerator 
{	
	GenerationStrategy generator;
	
	public ContestGenerator()
	{
		generator = new AllRandomGenerationStrategy();
	}
	public void run() 
	{
		generator.generate();
	}
	public GenerationStrategy getGenerator() {
		return generator;
	}
}
