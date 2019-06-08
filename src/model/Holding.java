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
*@param nit A String that identifies the company.
*@param address The company's correspondence address.
*@param phone The contact phone number of the company.
*@param assets the value of the company's assets in pesos.
*@param dateOfConstitution The date of constitution of the company.
*@param amountOfEmployees The number of the company's employees.
*@param legalRepresentative The name of the company's representative legal.
*@param floors The number of floors of the company's building (it must be between 3 and 7).
*/

	public Holding(String name, String nit, String address, String phone, int assets, Date dateOfConstitution, int amountOfEmployees, String legalRepresentative, int floors){

		super(name, nit, address, phone, assets, dateOfConstitution, amountOfEmployees, legalRepresentative, floors);
		companies = new ArrayList<Company>();
	}

//Methods

	/**
	*<b>Description:</b> This method allows adding a pharmaceutical company to the holding's ArrayList of companies.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> The pharmaceutical company will be added to the holding's ArrayList of companies.<br>
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
	*@param sanitaryRegistration The sanitary registry given by INVIMA.
	*@param status The status (Valid = true and Not renewed = false).
	*@param modality The modality of the company.
	*@param expirationDate The expiration date of the sanitary registration.
	*@return A message that indicates to the user that the pharmaceutical company was added successfully. 
	*/
	public String addPharmaceuticalCompany(String name, String nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, String sanitaryRegistration, boolean status, String modality, Date expirationDate){

		String msg = "The pharmaceutical company was added successfully";
		
		companies.add(new PharmaceuticalCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, sanitaryRegistration, status, modality, expirationDate));
		
		return msg;
	}

	/**
	*<b>Description:</b> This method allows adding a technology company to the holding's ArrayList of companies.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> The technology company will be added to the holding's ArrayList of companies.<br>
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
	*@param energyConsumed The energy consumed by the company in kilowatts.
	*@param service1 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service2 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service3 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service4 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service5 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@param service6 A number that indicates if the company has that service (0 if the company does not have that service and 1 if the company have that service).
	*@return A message that indicates to the user that the technology company was added successfully.
	*/
	public String addTechnologyCompany(String name, String nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, double energyConsumed, int service1, int service2, int service3, int service4, int service5, int service6){
		
		String msg = "The technology company was added successfully";
		
		companies.add(new TechnologyCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, energyConsumed, service1, service2, service3, service4, service5, service6));
		
		return msg;
	}

	/**
	*<b>Description:</b> This method allows adding a educational company to the holding's ArrayList of companies.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> The educational company will be added to the holding's ArrayList of companies.<br>
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
	*@param id The registration number of approval before the Ministry of National Education.
	*@param accreditedYears The number of years accredited as a high-quality entity.
	*@param nationalPositioningTest11Pro National position according to exams saber11/Pro.
	*@param rectorName The name of the rector.
	*@param educationalSector A number that indicates the education sector (0 if it is high school and 1 if it is a university).
	*@param studentsOfLowStratus The number of active students stratum 1 and 2.
	*@param amountOfStudents The total number of active students.
	*@return A message that indicates to the user that the educational company was added successfully.
	*/
	public String addEducationalCompany(String name, String nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, String id, int accreditedYears, int nationalPositioningTest11Pro, String rectorName, int educationalSector, int studentsOfLowStratus, int amountOfStudents){

		String msg = "The educational company was added successfully";
		
		companies.add(new EducationalCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, id, accreditedYears, nationalPositioningTest11Pro, rectorName, educationalSector, studentsOfLowStratus, amountOfStudents));
		
		return msg;
	}

	/**
	*<b>Description:</b> This method allows adding a public services company to the holding's ArrayList of companies.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> The public services company will be added to the holding's ArrayList of companies.<br>
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
	*@param service The type of service provided by the company.
	*@param amountOfSubscribers The current number of total subscribers.
	*@param subscribersOfStratum1And2 The number of subscribers in stratum 1 and 2.
	*@return A message that indicates to the user that the public services company was added successfully.
	*/

	public String addPublicServicesCompany(String name, String nit, String address, String phone, int assets, Date dateOfConstitution, String type, int amountOfEmployees, String legalRepresentative, int floors, String service, int amountOfSubscribers, int subscribersOfStratum1And2){

		String msg = "The public services company was added successfully";
		
		companies.add(new PublicServicesCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, service, amountOfSubscribers, subscribersOfStratum1And2));
		
		return msg;
	}

	/**
	*<b>Description:</b> This method allows adding an employee to the first available cubicle of a company (Use the nit to found the company).<br>
	*<b>Post:</b> The employee was added to the company's cubicle.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*@param name The name of the employee.
	*@param job The job of the employee.
	*@param email The email of the employee.
	*@param nit A String that identifies the company.
	*@return A message that indicates if the company was found and the employee was added or not.
	*/

	public String addEmployee(String name, String job, String email, String nit){

		boolean running = true;
		String msg = "The company could not be found, please try with another nit";

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit)){

				msg = companies.get(i).addEmployee(name, job, email);
			}
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allow calculate the company's satisfaction level ((Use the nit to found the company).<br>
	*@param nit A String that identifies the company.
	*@return A message that indicates if the company was found or not, if the company was found, will show the company's satisfaction level.
	*/

	public String calculateLevelOfSatisfaction(String nit){

		ServicesCompany company = null;
		boolean running = true;
		String msg = "The company could not be found, please try with another nit";

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit) && companies.get(i) instanceof ServicesCompany){

				company = (ServicesCompany) companies.get(i);

				if(company.calculateLevelOfSatisfaction() != 0){

					msg = "The level of satisfaction is: " + company.calculateLevelOfSatisfaction();
				}
				else{

					msg = "There are not enough surveys to calculate the level of satisfaction";
				}
			}
		}

		return msg;
	}
}