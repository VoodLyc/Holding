package model;

/**
*<b>Description:</b> The class Date in the package model.<br>
*@author Johan Giraldo.
*/

public class Date{

//Attributes

	private int day;
	private int month;
	private int year;

//Constructor
/**
*<b>Description:</b> The constructor of the class Employee.<br>
*<b>Post:</b> All attributes of the class are initialized.<br>
*@param day A number that represents the day.
*@param month A number that represents the month.
*@param year A number that represents the year.
*/

	public Date(int day, int month, int year){

		this.day = day;
		this.month = month;
		this.year = year;
	}

//Gets
	/**
	*<b>Description:</b> Return the day of the date.<br>
	*@return An int that represents the day of the date.<br>
	*/

	public int getDay(){

		return day;
	}

	/**
	*<b>Description:</b> Return the month of the date.<br>
	*@return An int that represents the month of the date.<br>
	*/

	public int getMonth(){

		return month;
	}

	/**
	*<b>Description:</b> Return the year of the date.<br>
	*@return An int that represents the year of the date.<br>
	*/

	public int getYear(){

		return year;
	}

//Sets
	/**
	*<b>Description:</b> Modify the day of the date.<br>
	*<b>Post:</b> The day was modified.<br>
	*@param day A number that represents the day.
	*/

	public void setDay(int day){

		this.day = day;
	}

	/**
	*<b>Description:</b> Modify the month of the date.<br>
	*<b>Post:</b> The month was modified.<br>
	*@param month A number that represents the month.
	*/

	public void setMonth(int month){

		this.month = month;
	}

	/**
	*<b>Description:</b> Modify the year of the date.<br>
	*<b>Post:</b> The year was modified.<br>
	*@param year A number that represents the year.
	*/

	public void setYear(int year){

		this.year = year;
	}

	/**
	*<b>Description</b> : Show the date in a date format(d/m/y).<br>
	*@param day A number that represents the day.
    *@param month A number that represents the month.
	*@param year A number that represents the year.
	*/

	public void showDate(int day, int month, int year){

		System.out.print(day + "/" + month + "/" + year);
	}
}