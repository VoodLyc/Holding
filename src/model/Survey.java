package model;

/**
*<b>Description:</b> The class Survey in the package model.<br>
*@author Johan Giraldo.
*/

public class Survey{

//Constants

	public static final String[] QUESTIONS = {"The service provided", "The response time given", "The cost / benefit ratio of the service purchased"};

//Attributes

	private int[] answers;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class Survey.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> All attributes of the class are initialized.<br>
	*@param answer1 A number that represents the answer to question 1(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*@param answer2 A number that represents the answer to question 2(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*@param answer3 A number that represents the answer to question 3(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*/

	public Survey(int answer1, int answer2, int answer3){

		answers = new int[3];
		answers[0] = answer1;
		answers[1] = answer2;
		answers[2] = answer3;
	}

//Methods 

	/**
	*<b>Description:</b> This method allows calculate the average of the survey.<br>
	*@return A double that is the average of the survey.
	*/

	public double calculateLevelOfSatisfaction(){

		double satisfaction = 0;

		for(int i = 0; i < answers.length; i++){

			satisfaction += answers[i];
		}

		satisfaction /= answers.length;

		return satisfaction;	
	}

}