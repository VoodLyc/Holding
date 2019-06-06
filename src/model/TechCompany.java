package model;

/**
*<b>Description:</b> The class TechCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class TechCompany extends SubordinateCompany{

//Constants

	public static final String[] SERVICES = {"Consultancy", "Training", "Custom development", "Infrastructure as a service", "Software as a service", "Platform as a service"};

//Attributes

	private int[] services;

//Constructor
/**
*<b>Description:</b> The constructor of the class TechCompany.<br>
*<b>Post:</b> All attributes of the class are initialized.<br>
*@param name The name of the company.
*@param nit The number that identifies the company.
*@param address The company's correspondence address.
*@param phone The contact phone number of the company.
*@param assets the value of the company's assets in pesos.
*@param dateOfConstitution The date of constitution of the company.
*@param type The type of organization (The types of organizations that exist are specified in the constant TYPE).
*@param amountOfEmployees The number of the company's employees.
*@param legalRepresentative The name of the company's representative legal.
*@param floors The number of floors of the company's building.
*@param numberOfCubicles The number of cubicles per floor.
*/

	public TechCompany(String name, int nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, int numberOfCubicles, int [] services){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, numberOfCubicles);
		for(int i = 0; i < this.services.length; i++){

			services[i] = this.services[i];
		}
	}
}