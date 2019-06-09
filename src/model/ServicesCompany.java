package model;
import java.util.ArrayList;

/**
*<b>Description:</b> The class ServicesCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class ServicesCompany extends SubordinateCompany{

//Attributes

	private ArrayList<Survey> surveys;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class ServicesCompany.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> All attributes of the class are initialized.<br>
	*@param name The name of the company.
	*@param nit A String that identifies the company.
	*@param address The company's correspondence address.
	*@param phone The contact phone number of the company.
	*@param assets The value of the company's assets in pesos.
	*@param dateOfConstitution The date of constitution of the company.
	*@param type The type of organization (The types of organizations that exist are specified in the constant TYPE).
	*@param amountOfEmployees The number of the company's employees.
	*@param legalRepresentative The name of the company's representative legal.
	*@param floors The number of floors of the company's building (it must be between 3 and 7).
	*/

	public ServicesCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors);
		surveys = new ArrayList<Survey>();
	}

//Methods

	/**
	*<b>Description:</b> This method allows adding a survey to the ArrayList of surveys.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> The survey will be added to the ArrayList of surveys.<br>
	*@param answer1 A number that represents the answer to question 1(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*@param answer2 A number that represents the answer to question 2(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*@param answer3 A number that represents the answer to question 3(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*/

	public String addSurvey(int answer1, int answer2, int answer3){

		String msg = "The survey was added successfully";
		
		if(surveys.size() < 50){

			surveys.add(new Survey(answer1, answer2, answer3));
		}

		else{

			msg = "The survey cannot be added because there are already 50 surveys (The survey limit)";
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allows calculate the company's level of satisfaction.<br>
	*@return A double that indicates the level of satisfaction.
	*/

	public double calculateLevelOfSatisfaction(){

		double satisfaction = 0;

		if(surveys.size() >= 10){

			for(int i = 0; i < surveys.size(); i++){

				if(surveys.get(i) != null){

					satisfaction += surveys.get(i).calculateLevelOfSatisfaction();
				}
			}

			satisfaction /= surveys.size();
		}

		return satisfaction;
	}
}