package model;

/**
*<b>Description:</b> The class TechnologyCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class TechnologyCompany extends SubordinateCompany{

//Constants

	public static final String[] SERVICES = {"Consultancy", "Training", "Custom development", "Infrastructure as a service", "Software as a service", "Platform as a service"};

//Attributes

	private double energyConsumed;
	private int[] services;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class TechnologyCompany.<br>
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
	*@param energyConsumed The energy consumed by the company in kilowatts.
	*@param service1 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service2 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service3 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service4 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service5 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service6 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*/

	public TechnologyCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors, double energyConsumed, int service1, int service2, int service3, int service4, int service5, int service6){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors);
		this.energyConsumed = energyConsumed;
		services = new int[6];
		services[0] = service1;
		services[1] = service2;
		services[2] = service3;
		services[3] = service4;
		services[4] = service5;
		services[5] = service6;
	}

	/**
	*<b>Description:</b> This method allows converting the company's attributes in a String.</br>
	*@return A String with the company's attributes.
	*/

	public String toString(){

		String toString;

		toString = super.toString();
		toString += "\nThe energy consumed by the company: " + energyConsumed;
		toString += "\nServices: " + showServices(services);

		return toString;
	}

	/**
	*<b>Description:</b> This method allows showing the technology company's services.<br>
	*@param services A technology company's array of services
	*@return A message with the technology company's services.
	*/

	public String showServices(int [] services){

		String technologyCompanyServices = "";

		for(int i = 0; i < services.length; i++){

			if(services[i] == 1){

				technologyCompanyServices += SERVICES[i] + ", ";
			}
		}

		return technologyCompanyServices;
	}
}