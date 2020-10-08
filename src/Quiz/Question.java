package Quiz; /**
 A question with a text and an answer
 */

/**
 * @author Catherine
*/
public class Question
{
    private String text;
   	private String answer;

    /**
     Construct a question with an empty question and answer
    */
    public Question()
    {
      text = "";
      answer = "";
    }

    /**
     Sets the question text
     @param questionText the text of this question
    */
    public void setText(String questionText)
   	{
       text = questionText;
    }

   	/**
     	Sets the answer for this question
     	@param correctResponse the answer
   	*/
   	public void setAnswer(String correctResponse)
    {
       	answer = correctResponse;
   	}

    /**
    	checks a response for correctness
     	@param response the response to check
     	@return true if the response was correct, false otherwise
    */
   	public boolean checkAnswer(String response)
   	{
        return response.equals(answer);
   	}

    /**
     	Displays the question
    */
    public void display()
   	{
        System.out.println(text);
   	}
}
