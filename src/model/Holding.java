package model;
import java.util.ArrayList;

/**
*<b>Description:</b> The class Holding in the package model.<br>
*@author Johan Giraldo.
*/

public class Holding extends Company{

//Attributes

	private ArrayList<Company> companies;

//Constructor
/**
*<b>Description:</b> The constructor of the class Holding.<br>
*<b>Post:</b> All attributes of the class are initialized.<br>
*@param name The name of the company.
*@param nit The number that identifies the company.
*@param address The company's correspondence address.
*@param phone The contact phone number of the company.
*@param assets the value of the company's assets in pesos.
*@param dateOfConstitution The date of constitution of the company.
*@param amountOfEmployees The number of the company's employees.
*@param legalRepresentative The name of the company's representative legal.
*@param floors The number of floors of the company's building.
*/

	public Holding(String name, int nit, String address, String phone, int assets, Date dateOfConstitution, int amountOfEmployees, String legalRepresentative, int floors	){

		super(name, nit, address, phone, assets, dateOfConstitution, amountOfEmployees, legalRepresentative, floors);
		companies = new ArrayList<Company>();
	}
}