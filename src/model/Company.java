package model;

/**
*Description: The class Company in the package model.</br>
*@author Johan Giraldo.
*/

public abstract class Company{

//Constats

	public static final String [] TYPES = {"Agriculture, hunting, silviculture and fishing", "Exploitation of mines and quarries", "Manufacturing industry", "Electricity, gas and steam", "Building", "Wholesale and retail", "Transportation, storage and communications", "Est.F / Cieros, insurance, B.estate, Serv. to companies", "Communal, Social"} 

//Attributes

	private String name;
	private int nit;
	private String address;
	private String phone;
	private int assets;
	private Date dateOfConstitution;
	private int amountOfEmployees;
	private String legalRepresentative;
	private int floors;
	private int numberOfCubicles;
	private Cubicle [][] cubicles;

//Constructor
/**
*Description: The constructor of the class Company.</br>
*Post: All attributes of the class are initialized.</br>
*@param name The name of the company.
*@param nit The number that identifies the company.
*@param address The company's correspondence address.
*@param phone The contact phone number of the company.
*@param assets the value of the company's assets in pesos.
*@param dateOfConstitution The date of constitution of the company.
*@param amountOfEmployees The number of the company's employees.
*@param legalRepresentative The name of the company's representative legal.
*@param floors The number of floors of the company's building.
*@param numberOfCubicles The number of cubicles per floor.
*/

	public Company(String name, int nit, String address, String phone, int assets, Date dateOfConstitution, int amountOfEmployees, String legalRepresentative, int floors, int numberOfCubicles){

		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.assets = assets;
		this.dateOfConstitution = dateOfConstitution;
		this.type = type;
		this.amountOfEmployees = amountOfEmployees;
		this.legalRepresentative = legalRepresentative;
		this.floors = floors;
		this.numberOfCubicles = numberOfCubicles;
		cubicles = new Cubicle [floors][cubicles];
	}
}
