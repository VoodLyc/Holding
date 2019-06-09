package model;

/**
*<b>Description:</b> The class SubordinateCompany in the package model.<br>
*@author Johan Giraldo.
*/

public abstract class SubordinateCompany extends Company{

//Constants 

	public static final String[] TYPES = {"Agriculture, hunting, silviculture and fishing", "Exploitation of mines and quarries", "Manufacturing industry", "Electricity, gas and steam", "Building", "Wholesale and retail", "Transportation, storage and communications", "Est.F / Cieros, insurance, B.estate, Serv. to companies", "Communal, Social"};

//Attributes

	private String type;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class SubordinateCompany.<br>
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
	public SubordinateCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors){

		super(name, nit, address, phone, assets, dateOfConstitution, amountOfEmployees, legalRepresentative, floors);
		this.type = type;
	}

	/**
	*<b>Description:</b> This method allows converting the company's attributes in a String.<br>
	*@return A String with the company's attributes.
	*/

	public String toString(){

		String toString;

		toString = super.toString();
		toString += "\nType: " + type;
		
		return toString;
	}
}
