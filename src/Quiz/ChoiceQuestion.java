package Quiz;

import java.util.ArrayList;

public class ChoiceQuestion extends Question
{
	//This instance variable is added to the subclass
	private ArrayList<String> choices;


	/**
	 Constructs a ChoiceQuestion with no choices
	*/
	public ChoiceQuestion()
	{
		choices = new ArrayList<String>();
	}

	//This method is added to the subclass
	public void addChoice(String choice, boolean correct)
	{
		choices.add(choice);
		if (correct)
		{
			//convert choices.size() to string
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}

	//This method overrides a method from the superclass
	public void display()
	{
		//display the question
		super.display();

		//display the answer choices
		for (int i = 0; i < choices.size(); i++)
		{
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + " : " + choices.get(i));
		}

	}
}
