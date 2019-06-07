package model;

/**
*<b>Description:</b> The class EducationalCompany in the package model.<br>
*@author Johan Giraldo.
*/

public class EducationalCompany extends ServicesCompany{

//Attributes

	private String id;
	private int accreditedYears;
	private int nationalPositioningTest11Pro;
	private String rectorName;
	private int educationalSector;
	private int studentsOfLowStratus;
	private int amountOfStudents;

//Constructor
/**
*<b>Description:</b> The constructor of the class EducationalCompany.<br>
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
*@param id The registration number of approval before the Ministry of National Education.
*@param accreditedYears The number of years accredited as a high-quality entity.
*@param nationalPositioningTest11Pro National position according to exams saber11/Pro.
*@param rectorName The name of the rector.
*@param educationalSector A number that indicates the education sector (0 if it is high school and 1 if it is a university).
*@param studentsOfLowStratus The number of active students stratum 1 and 2.
*@param amountOfStudents The total number of active students.
*/

	public EducationalCompany(String name, int nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, String id, int accreditedYears, int nationalPositioningTest11Pro, String rectorName, int educationalSector, int studentsOfLowStratus, int amountOfStudents){

		super(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors);
		this.id = id;
		this.accreditedYears = accreditedYears;
		this.nationalPositioningTest11Pro = nationalPositioningTest11Pro;
		this.rectorName = rectorName;
		this.educationalSector = educationalSector;
		this.studentsOfLowStratus = studentsOfLowStratus;
		this.amountOfStudents = amountOfStudents;
	}
}