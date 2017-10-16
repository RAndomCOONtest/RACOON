package racoon.entity;

import java.util.Calendar;
import java.util.Date;

public class Contest extends NamedElement
{
	private Date dateCreation;
	private Question question;
	private Item winner;
	private Item loser;
	
	public Contest()
	{
		dateCreation = Calendar.getInstance().getTime();
	}
	
	public Contest(Question question, Item winner, Item loser)
	{
		dateCreation = Calendar.getInstance().getTime();
		this.question=question;
		this.winner=winner;
		this.loser=loser;
		// ----- Associations reciproques -----//
		this.question.getContests().add(this);
		this.winner.getContestsWinner().add(this);
		this.loser.getContestsLoser().add(this);
	}
	
	public Question getQuestion() 
	{
		return question;
	}
	public void setQuestion(Question question) 
	{
		this.question = question;
	}

	public Item getWinner() {
		return winner;
	}

	public void setWinner(Item winner) {
		this.winner = winner;
	}

	public Item getLoser() {
		return loser;
	}

	public void setLoser(Item loser) {
		this.loser = loser;
	}

}
