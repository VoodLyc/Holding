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
	*<b>Pre:</b> The extension cannot be null.<br>
	*<b>Post:</b> All attributes of the class are initialized.<br>
	*@param extension A String that identifies the cubicle.
	*/

	public Cubicle(String extension){

		this.extension = extension;
		employee = null;		
	}

//Gets

	/**
	*<b>Description: </b> This method allows returning the employee.<br>
	*@return The employee.
	*/

	public Employee getEmployee(){

		return employee;
	}

//Methods

	/**
	*<b>Description:</b> This method allows instantiating an employee.<br>
	*<b>Post:</b> The employee was instantiated.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*@param name The name of the employee.
	*@param job The job of the employee.
	*@param email The email of the employee.
	*@return A message that indicates to the user that the employee was added successfully.
	*/

	public String addEmployee(String name, String job, String email){

		String msg = "The employee was added successfully";

		employee = new Employee(name, job, email);

		return msg;
	}
}