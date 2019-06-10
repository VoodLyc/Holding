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
	*@param floors The number of floors of the company's building (it must be between 3 and 7).
	*/

	public Holding(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String amountOfEmployees, String legalRepresentative, int floors){

		super(name, nit, address, phone, assets, dateOfConstitution, amountOfEmployees, legalRepresentative, floors);
		companies = new ArrayList<Company>();
	}

//Methods

	/**
	<b>Description:</b> This method allows adding a manufacturing company to the holding's ArrayList of companies.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> The manufacturing company will be added to the holding's ArrayList of companies.<br>
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
	*@return A message that indicates to the user that the manufacturing company was added successfully.
	*/

	public String addManufacturingCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors){

		String msg = "\nThe manufacturing company was added successfully!\n";

		companies.add(new ManufacturingCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors));

		return msg;
	}

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
	*@param status The status (Valid = <code> true </code> and Not renewed = <code> false </code>).
	*@param modality The modality of the company.
	*@param expirationDate The expiration date of the sanitary registration.
	*@return A message that indicates to the user that the pharmaceutical company was added successfully. 
	*/
	
	public String addPharmaceuticalCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors, String sanitaryRegistration, boolean status, String modality, Date expirationDate){

		String msg = "\nThe pharmaceutical company was added successfully!\n";
		
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

	public String addTechnologyCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors, double energyConsumed, int service1, int service2, int service3, int service4, int service5, int service6){
		
		String msg = "\nThe technology company was added successfully!\n";
		
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

	public String addEducationalCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors, String id, int accreditedYears, int nationalPositioningTest11Pro, String rectorName, int educationalSector, int studentsOfLowStratus, int amountOfStudents){

		String msg = "\nThe educational company was added successfully!\n";
		
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

	public String addPublicServicesCompany(String name, String nit, String address, String phone, String assets, Date dateOfConstitution, String type, String amountOfEmployees, String legalRepresentative, int floors, String service, int amountOfSubscribers, int subscribersOfStratum1And2){

		String msg = "\nThe public services company was added successfully!\n";
		
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
		String msg = "\nThe company could not be found, please try with another nit\n";

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit)){

				msg = "\n" +companies.get(i).addEmployee(name, job, email) + "\n";
				running = false;
			}
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allows adding a survey to the ArrayList of surveys.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*<b>Post:</b> The survey will be added to the ArrayList of surveys.<br>
	*@param answer1 A number that represents the answer to question 1(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*@param answer2 A number that represents the answer to question 2(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*@param answer3 A number that represents the answer to question 3(On a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with: the questions are specified in the constant QUESTIONS).
	*@return  A message that tells the user if the survey has been successfully added or not.
	*/

	public String addSurvey(int answer1, int answer2, int answer3, String nit){

		ServicesCompany company = null;
		boolean running = true;
		String msg = "\nThe company could not be found or the company is not a services company, please try with another nit\n";

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit) && companies.get(i) instanceof ServicesCompany){

				company = (ServicesCompany) companies.get(i);
				msg = "\n" + company.addSurvey(answer1, answer2, answer3) + "\n";
				running = false;
			}
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allow calculate the company's satisfaction level (Use the nit to found the company).<br>
	*<b>Pre:</b> The nit cannot be null.<br>
	*@param nit A String that identifies the company.
	*@return A message that indicates if the company was found or not, if the company was found, will show the company's satisfaction level.
	*/

	public String calculateLevelOfSatisfaction(String nit){

		ServicesCompany company = null;
		boolean running = true;
		String msg = "\nThe company could not be found or the company is not a services company, please try with another nit\n";

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit) && companies.get(i) instanceof ServicesCompany){

				company = (ServicesCompany) companies.get(i);

				if(company.calculateLevelOfSatisfaction() != 0){

					msg = "\nThe level of satisfaction is: " + company.calculateLevelOfSatisfaction() + "\n";
					running = false;
				}
				else{

					msg = "\nThere are not enough surveys to calculate the level of satisfaction\n";
				}
			}
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allows calculating the educational company's proculture tax (Use the nit to found the company).<br>
	*<b>Pre:</b> The nit cannot be null.<br>
	*@param nit A String that identifies the company.
	*/

	public String calculateProCultureTax(String nit){

		EducationalCompany company = null;
		boolean running = true;
		String msg = "\nThe company could not be found or the company is not a educational company, please try with another nit\n";

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit) && companies.get(i) instanceof EducationalCompany){

				company = (EducationalCompany) companies.get(i);
				msg = company.calculateProCultureTax();
				running = false;
			}
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allows converting the company's attributes in a String.<br>
	*@return A String with the company's attributes.
	*/

	public String toString(){

		String toString;
		toString = "\nHolding: \n";
		toString += super.toString();
		return toString;
	}

	/**
	*<b>Description:</b> This method allows showing all data entered by the user.<br>
	*@return A message with all data entered by the user.
	*/

	public String showListOfAllData(){

		String data = "";

		for(int i = 0; i < companies.size(); i++){

			if(companies.get(i) != null && companies.get(i) instanceof PharmaceuticalCompany){

				System.out.println("\n(" + Company.CLASSES_OF_COMPANIES[2] + ")\n" + companies.get(i).toString());
			}

			else if(companies.get(i) != null && companies.get(i) instanceof FoodCompany){

				System.out.println("\n(" + Company.CLASSES_OF_COMPANIES[1] + ")\n" + companies.get(i).toString());
			}

			else if(companies.get(i) != null && companies.get(i) instanceof ManufacturingCompany){

				System.out.println("\n(" + Company.CLASSES_OF_COMPANIES[0] + ")\n" + companies.get(i).toString());
			}

			else if(companies.get(i) != null && companies.get(i) instanceof TechnologyCompany){

				System.out.println("\n(" + Company.CLASSES_OF_COMPANIES[3] + ")\n" + companies.get(i).toString());
			}

			else if(companies.get(i) != null && companies.get(i) instanceof EducationalCompany){

				System.out.println("\n(" + Company.CLASSES_OF_COMPANIES[4] + ")\n" + companies.get(i).toString());
			}

			else if(companies.get(i) != null && companies.get(i) instanceof PublicServicesCompany){

				System.out.println("\n(" + Company.CLASSES_OF_COMPANIES[5] + ")\n" + companies.get(i).toString());
			}
		}

		return data;
	}

	/**
	*<b>Description:</b> This method allows adding a product to the ArrayList of products.<br>
	*<b>Pre:</b> No one parameter can be null.<br>
	*@param name The name of the product.
	*@param id The id that identifies it
	*@param waterRequired The amount of water (liters) required for manufacturing.
	*@param inventory The number of units in the inventory.
	*@param nit A String that identifies the company.
	*@return A message that tells the user if the product has been successfully added or not.
	*/

	public String addProduct(String name, String id, double waterRequired, int inventory, String nit){

		ManufacturingCompany company = null;
		boolean running = true;
		String msg = "\nThe company could not be found or the company is not a manufacturing company, please try with another nit\n";

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit) && companies.get(i) instanceof ManufacturingCompany){

				company = (ManufacturingCompany) companies.get(i);
				msg = company.addProduct(name, id, waterRequired, inventory);
				running = false;
			}
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allows calculating the number of trees that needs to plant the company based on water consumption.<br>
	*@return The number of trees that needs plants the company. 
	*/

	public String calculateTree(String nit){

		PharmaceuticalCompany company = null;
		boolean running = true;
		String msg = "\nThe company could not be found or the company is not a pharmaceutical company, please try with another nit\n";
		double waterRequired = 0;

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit) && companies.get(i) instanceof PharmaceuticalCompany){

				company = (PharmaceuticalCompany) companies.get(i);
				waterRequired = company.calculateTree();
			}
		}

		if(waterRequired <= 0){

			msg = "\nThe company don't need to plant trees.\n";
		}

		else if(waterRequired >= 1 && waterRequired <= 140){

			msg = "\nThe company needs to plant 6 trees.\n";
		}

		else if(waterRequired >= 141 && waterRequired <= 800){

			msg = "\nThe company needs to plant 25 trees.\n";
		}

		else if(waterRequired > 800){

			msg = "\nThe company needs to plants 200 trees.\n";
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allows search the employee's extension wit the name of the employee<br>
	*@return The employee's extension or a message that indicates the user that the company could not be found.
	*/

	public String searchExtension(String name, int typeOfSearch, String nit){

		String msg = "The company could not be found, please try with another nit";
		boolean running = true;

		for(int i = 0; i < companies.size() && running != false; i++){

			if(companies.get(i) != null && companies.get(i).getNit().equals(nit)){

				msg = companies.get(i).searchExtension(name, typeOfSearch);
			}
		}

		return msg;
	}
}