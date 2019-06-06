package model;

/**
*<b>Description:</b> The class Cubicle in the package model.<br>
*@author Johan Giraldo.
*/

public class Cubicle{

//Attributes

	private String extension;
	private Employee employee;

//Constructor
/**
*<b>Description:</b> The constructor of the class Cubicle.<br>
*<b>Post:</b> All attributes of the class are initialized.<br>
*@param extension A String that identifies the cubicle.
*/

	public Cubicle(String extension){

		this.extension = extension;
		employee = null;		
	}
}