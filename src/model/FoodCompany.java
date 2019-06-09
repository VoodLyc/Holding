package model;

/**
*<b>Description:</b> The class FoodCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class FoodCompany extends ManufacturingCompany{

//Attributes

//Constructor
/**
	*<b>Description:</b> The constructor of the class FoodCompany.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> All attributes of the class are initialized.<br>
	*@param name The name of the company.
	*@param nit A String that identifies the company.
	*@param address The company's correspondence address.
	*@param phone The contact phone number of the company.
	*@param assets the value of the company's assets in pesos.
	*@param dateOfConstitution The date of constitution of the company.
	*@param type The type of organization (The types of organizations that exist are specified in the constant TYPE).
	*@param amountOfEmployees The number of the company's employees.
	*@param legalRepresentative The name of the company's representative legal.
	*@param floors The number of floors of the company's building (it must be between 3 and 7).
	*/

	public FoodCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors);

	}
}