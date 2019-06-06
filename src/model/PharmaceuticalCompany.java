package model;

/**
*<b>Description:</b> The class PharmaceuticalCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class PharmaceuticalCompany extends ManufacturingCompany{

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
*@param sanitaryRegistration The sanitary registry given by INVIMA.
*@param status The status (Valid = true and Not renewed = false).
*@param modality The modality of the company.
*@param expirationDate The expiration date of the sanitary registration.
*/

	public PharmaceuticalCompany(String name, int nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, int numberOfCubicles, String sanitaryRegistration, boolean status, String modality, Date expirationDate){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, numberOfCubicles);
		this.sanitaryRegistration = sanitaryRegistration;
		this.status = status;
		this.modality = modality;
		this.expirationDate = expirationDate;
	}
}