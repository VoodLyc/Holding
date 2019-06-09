package model;

/**
*<b>Description:</b> The class Employee in the package model.<br>
*@author Johan Giraldo.
*/

public class Employee{

//Attributes

	private String name;
	private String job;
	private String email;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class Employee.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> All attributes of the class are initialized.<br>
	*@param name The name of the employee.
	*@param job The job of the employee.
	*@param email The email of the employee.
	*/

	public Employee(String name, String job, String email){

		this.name = name;
		this.job = job;
		this.email = email;
	}
}