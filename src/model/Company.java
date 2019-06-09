package model;

/**
*<b>Description:</b> The class Company in the package model.<br>
*@author Johan Giraldo.
*/

public abstract class Company{

//Constants
	
	public static final String[] CLASSES_OF_COMPANIES = {"Manufacturing company", "Food company", "Pharmaceutical company", "Technology company", "Educational company", "Public services company"};
	public static final int CUBICLES = 20; 

//Attributes

	private String name;
	private String nit;
	private String address;
	private String phone;
	private String assets;
	private Date dateOfConstitution;
	private String amountOfEmployees;
	private String legalRepresentative;
	private int floors;
	private Cubicle[][] building;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class Company.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> All attributes of the class are initialized.<br>
	*@param name The name of the company.
	*@param nit A String that identifies the company.
	*@param address The company's correspondence address.
	*@param phone The contact phone number of the company.
	*@param assets the value of the company's assets in pesos.
	*@param dateOfConstitution The date of constitution of the company.
	*@param amountOfEmployees The number of the company's employees.
	*@param legalRepresentative The name of the company's representative legal.
	*@param floors The number of floors of the company's building.
	*/

	public Company(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String amountOfEmployees, String legalRepresentative, int floors){

		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.assets = assets;
		this.dateOfConstitution = dateOfConstitution;
		this.amountOfEmployees = amountOfEmployees;
		this.legalRepresentative = legalRepresentative;
		this.floors = floors;
		building = new Cubicle [floors][CUBICLES];

		for(int x = 0; x < building.length; x++){
			for(int y = 0; y < building[0].length; y++){

				building[x][y] = new Cubicle(x +""+ y);
			}
		}
	}

//Gets

	/**
	*<b>Description:</b> This method returns the company's nit.<br>
	*@return A number that represents the nit of the company.
	*/

	public String getNit(){

		return nit;
	}

//Methods

	/**
	*<b>Description:</b> This method allows adding the employee to the first available cubicle that is found.<br>
	*<b>Post:</b> The employee is added and returns a message indicating it or the employee cannot be added and returns a message indicating it.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*@param name The name of the employee.
	*@param job The job of the employee.
	*@param email The email of the employee.
	*@return A message that indicates if the employee was added or not.
	*/

	public String addEmployee(String name, String job, String email){

		boolean running = true;
		String msg = "The employee cannot be added because the cubicles are full";

		for(int x = 0; x < building.length && running != false; x++){
			for(int y = 0; y < building[0].length && running != false; y++){

				if(building[x][y] != null){

					msg = building[x][y].addEmployee(name, job, email);
				}
			}
		}

		return msg;
	}
}
