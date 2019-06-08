package model;

/**
*<b>Description:</b> The class PublicServicesCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class PublicServicesCompany extends ServicesCompany{

//Constants

	public static final String [] PUBLIC_SERVICES = {"Sewage", "Energy", "Aqueduct"};

//Attributes
	
	private String service;
	private int amountOfSubscribers;
	private int subscribersOfStratum1And2;

//Constructor
/**
*<b>Description:</b> The constructor of the class PublicServicesCompany.<br>
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
*@param service The type of service provided by the company.
*@param amountOfSubscribers The current number of total subscribers.
*@param subscribersOfStratum1And2 The number of subscribers in stratum 1 and 2.
*/

	public PublicServicesCompany(String name, String nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, String service, int amountOfSubscribers, int subscribersOfStratum1And2){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors);
		this.service = service;
		this.amountOfSubscribers = amountOfSubscribers;
		this.subscribersOfStratum1And2 = subscribersOfStratum1And2;
	}
}