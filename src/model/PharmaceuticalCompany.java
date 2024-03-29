package model;

/**
*<b>Description:</b> The class PharmaceuticalCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class PharmaceuticalCompany extends ManufacturingCompany implements TreeCalculator{

//Constants

	public static final String[] MODALITIES = {"Manufacture and to export", "Manufacture and sell", "Import and sell"};

//Attributes

	private String sanitaryRegistration;
	private boolean status;
	private String modality;
	private Date expirationDate;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class PharmaceuticalCompany.<br>
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
	*@param sanitaryRegistration The sanitary registry given by INVIMA.
	*@param status The status (Valid = <code> true </code> and Not renewed = <code> false </code>).
	*@param modality The modality of the company.
	*@param expirationDate The expiration date of the sanitary registration.
	*/

	public PharmaceuticalCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors, String sanitaryRegistration, boolean status, String modality, Date expirationDate){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors);
		this.sanitaryRegistration = sanitaryRegistration;
		this.status = status;
		this.modality = modality;
		this.expirationDate = expirationDate;
	}

//Methods

	/**
	*<b>Description:</b> This method allows converting the company's attributes in a String.</br>
	*@return A String with the company's attributes.
	*/

	public String toString(){

		String toString;

		toString = super.toString();
		toString += "\nSanitary registration: " + sanitaryRegistration;
		toString += "\nSanitary registration status: " + status;
		toString += "\nModality: " + modality;
		toString += "\nSanitary registration expiration date: " + expirationDate.toString();

		return toString;
	}

	/**
	*<b>Description:</b> This method allows calculating the water consumed by the company.<br>
	*@return The water consumed by the company.
	*/
	public double calculateTree(){

		String msg;
		double waterConsumed = 0;

		for(int i = 0; i < super.getProducts().size(); i++){

			if(super.getProducts().get(i) != null){

				waterConsumed += super.getProducts().get(i).calculateTree(); 
			}
		}

		return waterConsumed;

	}
}