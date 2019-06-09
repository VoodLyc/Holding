package model;

/**
*<b>Description:</b> The class Product in the package model.<br>
*@author Johan Giraldo.
*/

public class Product{

//Attributes

	private String name;
	private String id;
	private double waterRequired;
	private int inventory;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class Product.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> All attributes of the class are initialized.<br>
	*@param name The name of the product.
	*@param id The id that identifies it
	*@param waterRequired The amount of water (liters) required for manufacturing.
	*@param inventory The number of units in the inventory.
	*/

	public Product(String name, String id, double waterRequired, int inventory){

		this.name = name;
		this.id = id;
		this.waterRequired = waterRequired;
		this.inventory = inventory;
	}
}