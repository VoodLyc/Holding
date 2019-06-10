package model;
import java.util.ArrayList;

/**
*<b>Description:</b> The class ManufacturingCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class ManufacturingCompany extends SubordinateCompany{

//Attributes

	private ArrayList<Product> products;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class ManufacturingCompany.<br>
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
	
	public ManufacturingCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors);
		products = new ArrayList<Product>();
	}

//Gets

	public ArrayList<Product> getProducts(){

		return products;
	}

	/**
	*<b>Description:</b> This method allows adding a product to the ArrayList of products.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*@param name The name of the product.
	*@param id The id that identifies it
	*@param waterRequired The amount of water (liters) required for manufacturing.
	*@param inventory The number of units in the inventory.
	*@return A message that tells the user if the product has been successfully added or not.
	*/
	
	public String addProduct(String name, String id, double waterRequired, int inventory){

		String msg = "\nThe product was added successfully\n";

		products.add(new Product(name, id, waterRequired, inventory));

		return msg;
	}
}