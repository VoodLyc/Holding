package ui;
import model.Company;
import model.Cubicle;
import model.Date;
import model.EducationalCompany;
import model.Employee;
import model.FoodCompany;
import model.Holding;
import model.ManufacturingCompany;
import model.PharmaceuticalCompany;
import model.ProCultureCalculator;
import model.Product;
import model.PublicServicesCompany;
import model.ServicesCompany;
import model.SubordinateCompany;
import model.Survey;
import model.TechnologyCompany;
import model.TreeCalculator;
import java.util.Scanner;

/**
*<b>Description:</b> The class Main in the package ui.<br>
*@author Johan Giraldo.
*/

public class Main{

//Attributes

	private Holding holding;

//Constructor
	/**
	*<b>Description:</b> The constructor of the class Main.<br>
	*/
	public Main(){

		init();
	}

	public static void main(String[]args){

		Main main = new Main();
		main.menu();
	}

	/**
	*<b>Description:</b> This method allows initializing the scanner and the objects necessary to the program's correct operation<br>
	*<b>Post:</b> The objects are initialized.<br>
	*/

	public void init(){

		Date holdingDate = new Date(12, 12, 12);
		holding = new Holding("MadHouse", "1193545173", "Street42", "4331029", "$2672939203", holdingDate, "134600", "Light Yagami", 7);

		Date manufacturingCompanyDate = new Date(21,2,13);
		holding.addManufacturingCompany("BIG HIT", "1193545178", "String47", "4331034", "$124594534", manufacturingCompanyDate, "Manufacturing industry", "9023", "Kim Seokjin", 3);
		
		Date pharmaceuticalCompanyDate = new Date(29, 8, 13);
		Date pharmaceuticalCompanyExpirationDate = new Date(12, 9, 20);
		holding.addPharmaceuticalCompany("Bones", "1193545174", "Street43", "4331030", "$570384234", pharmaceuticalCompanyDate, "Manufacturing industry", "12656", "Misa Amane", 5, "INVIMA 2019M-003432-R6", true, "Manufacture and to export", pharmaceuticalCompanyDate);
		
		Date technologyCompanyDate = new Date(10, 3, 13);
		holding.addTechnologyCompany("JYP", "1193545175", "Street44", "4331031", "$835530530", technologyCompanyDate, "Electricity, gas and steam", "24403", "Kim Dahyun", 6, 850, 1, 0, 1, 0, 1, 1);

		Date educationalCompanyDate = new Date(19, 2, 13);
		holding.addEducationalCompany("YG", "1193545176", "Street45", "4331032", "$319223323", educationalCompanyDate, "Communal, Social", "15393", "Kim Jisoo", 6, "2291301", 3, 12, "Jennie Kim", 1, 223, 621);

		Date publicServicesCompanyDate = new Date(20, 10, 14);
		holding.addPublicServicesCompany("Steam", "1193545177", "Street46", "4331033", "$293874432", publicServicesCompanyDate, "Electricity, gas and steam", "17893", "Rosseane Park", 3, "Energy", 1204, 234);

		holding.addEmployee("Midoriya Izuku", "Engineer", "midoriya.ALLMIGHT@gmail.com", "1193545174");
		holding.addEmployee("Mikasa Ackerman", "CEO", "mikasa.ATTACKONTITAN@gmail.com", "1193545176");
		holding.addEmployee("Eren Jaeger", "Administrator", "eren.ATTACKONTITAN@gmail.com", "1193545177");
	}

	/**
	*<b>Description:</b> This method allows showing the program's menu.<br>
	*/

	public void menu(){

		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while(running){

			System.out.println("\n---------------------------------------------------------------------------------------------------------------\n");

			System.out.println("1. Register a company.");
			System.out.println("2. Show the listing of all the information entered.");
			System.out.println("3. Register a Employee.");
			System.out.println("4. Register a Survey.");
			System.out.println("5. Calculate proculture tax.");
			System.out.println("6. Calculate the average satisfaction level.");
			System.out.println("7. Register a product.");
			System.out.println("8. Calculate the waterXtree service for pharmaceutical companies.");
			System.out.println("9. Find extension with the employee's name");
			System.out.println("10.");
			System.out.println("11.");
			System.out.println("12. Quit\n");

			int choice;
			choice = scanner.nextInt();

			switch(choice){

				case 1:

				registerCompanyMenu();
				
				break;

				case 2:

				showListOfAllData();
				
				break;

				case 3:

				registerEmployeeMenu();

				break;

				case 4:

				registerSurveyMenu();

				break;

				case 5:

				calculateProCultureTaxMenu();

				break;

				case 6:

				calculateTheAverageSatisfactionLevelMenu();

				break;

				case 7:

				registerProductMenu();

				break;

				case 8:

				calculateTheWaterXTreeServiceForPharmaceuticalCompanies();

				break;

				case 9:

				findExtensionWithTheNameOfTheEmployeeMenu();

				break;

				case 12:

				running = false;

				break;
			}
		}

	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to create a company.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void registerCompanyMenu(){

		Scanner scanner;

		scanner = new Scanner(System.in);
		String name, nit, address, phone, assets, type, amountOfEmployees, legalRepresentative;
		Date dateOfConstitution;
		int constitutionDay, constitutionMonth, constitutionYear, floors, typeSelection, classCompany;


		System.out.println("\nPlease enter the company's name.\n");
		name = scanner.nextLine();

		System.out.println("\nPlease enter the company's nit.\n");
		nit = scanner.nextLine();

		System.out.println("\nPlease enter the company's address.\n");
		address = scanner.nextLine();

		System.out.println("\nPlease enter the company's phone.\n");
		phone = scanner.nextLine();

		System.out.println("\nPlease enter the company's assets.\n");
		assets = "$" + scanner.nextLine();

		System.out.println("\nPlease enter the company's day of constitution (between 1 and 30).\n");
		constitutionDay = validateInt(1, 31);

		System.out.println("\nPlease enter the company's month of constitution (between 1 and 12).\n");
		constitutionMonth = validateInt(1, 12);

		System.out.println("\nPlease enter the company's year of constitution (until 2019).\n");
		constitutionYear = validateInt(1, 2019);

		dateOfConstitution = new Date(constitutionDay, constitutionMonth, constitutionYear);

		System.out.println("\nPlease select the company's type:");
		System.out.println(showConstantType() + "\n");
		typeSelection = scanner.nextInt();
		type = selectType(typeSelection);
		scanner.nextLine();

		System.out.println("\nPlease enter the company's amount of employees.\n");
		amountOfEmployees = scanner.nextLine();

		System.out.println("\nPlease enter the company's legal representative.\n");
		legalRepresentative = scanner.nextLine();

		System.out.println("\nPlease enter the company's floors (between 3 and 7).\n");
		floors = validateInt(3, 7);

		System.out.println("\nPlease select the class of company do you want to create:");
		System.out.println(showConstantClassesOfCompanies() + "\n");
		classCompany = validateInt(1, 6);
		
		switch (classCompany){

			case 1:

			System.out.println(holding.addManufacturingCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors));

			break;

			case 2:


			break;
			
			case 3:

			String sanitaryRegistration, modality;
			boolean status;
			Date expirationDate;
			int modalitySelection, expirationDay, expirationMonth, expirationYear;

			System.out.println("\nPlease enter the company's sanitary registration.\n");
			sanitaryRegistration = scanner.nextLine();

			System.out.println("\nPlease enter the sanitary registration status.\n");
			System.out.println("\n1. Valid\n2. Not renewed\n");
			status = validateBoolean();

			System.out.println("\nPlease select the company's modality:");
			System.out.println(showConstantModalites() + "\n");
			modalitySelection = validateInt(1, 3);
			modality = selectModalitie(modalitySelection);

			System.out.println("\nPlease enter the sanitary registration expiration day (between 1 and 30).\n");
			expirationDay = validateInt(1, 30);

			System.out.println("\nPlease enter the sanitary registration expiration month (between 1 and 12).\n");
			expirationMonth = validateInt(1, 12);

			System.out.println("\nPlease enter the sanitary registration expiration year.\n");
			expirationYear = validateInt(1, 2050);

			expirationDate = new Date(expirationDay, expirationMonth, expirationYear);

			System.out.println(holding.addPharmaceuticalCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, sanitaryRegistration, status, modality, expirationDate));

			break;

			case 4:

			double energyConsumed;
			int service1, service2, service3, service4, service5, service6;

			System.out.println("\nPlease enter the company's energy consumption.\n");
			energyConsumed = scanner.nextDouble();

			System.out.println("\nThe company has this service?: " + TechnologyCompany.SERVICES[0] + "\n");
			System.out.println("\n0. No.\n1. Yes.\n");
			service1 = validateInt(0, 1);

			System.out.println("\nThe company has this service?: " + TechnologyCompany.SERVICES[1] + "\n");
			System.out.println("\n0. No.\n1. Yes.\n");
			service2 = validateInt(0, 1);

			System.out.println("\nThe company has this service?: " + TechnologyCompany.SERVICES[2] + "\n");
			System.out.println("\n0. No.\n1. Yes.\n");
			service3 = validateInt(0, 1);

			System.out.println("\nThe company has this service?: " + TechnologyCompany.SERVICES[3] + "\n");
			System.out.println("\n0. No.\n1. Yes.\n");
			service4 = validateInt(0, 1);

			System.out.println("\nThe company has this service?: " + TechnologyCompany.SERVICES[4] + "\n");
			System.out.println("\n0. No.\n1. Yes.\n");
			service5 = validateInt(0, 1);

			System.out.println("\nThe company has this service?: " + TechnologyCompany.SERVICES[5] + "\n");
			System.out.println("\n0. No.\n1. Yes.\n");
			service6 = validateInt(0, 1);

			System.out.println(holding.addTechnologyCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, energyConsumed, service1, service2, service3, service4, service5, service6));

			break;

			case 5:

			String id, rectorName; 
			int accreditedYears, nationalPositioningTest11Pro, educationalSector, studentsOfLowStratus, amountOfStudents;

			System.out.println("\nPlease enter the company's id.\n");
			id = scanner.nextLine();

			System.out.println("\nPlease enter the company's accredited years.\n");
			accreditedYears = scanner.nextInt();

			System.out.println("\nPlease enter the company's national positioning based on test 11/Pro.\n");
			nationalPositioningTest11Pro = scanner.nextInt();

			System.out.println("\nPlease enter the company's rector name.\n");
			rectorName = scanner.nextLine();

			System.out.println("\nPlease enter the company's educational sector.\n");
			System.out.println("\n0. High school.\n1. University.");
			educationalSector = validateInt(0, 1);

			System.out.println("\nPlease enter the company's students of low stratus.\n");
			studentsOfLowStratus = scanner.nextInt();

			System.out.println("\nPlease enter the company's amount of students.\n");
			amountOfStudents = scanner.nextInt();

			System.out.println(holding.addEducationalCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, id, accreditedYears, nationalPositioningTest11Pro, rectorName, educationalSector, studentsOfLowStratus, amountOfStudents));

			break;

			case 6:

			String service;
			int amountOfSubscribers, subscribersOfStratum1And2, serviceSelection;

			System.out.println("\nPlease select the company's service:\n");
			System.out.println(showConstantPublicServices() + "\n");
			serviceSelection = validateInt(1, 3);
			service = selectPublicService(serviceSelection);

			System.out.println("\nPlease enter the company's amount of subscribers.\n");
			amountOfSubscribers = scanner.nextInt();

			System.out.println("\nPlease enter the company's subscribers of stratum 1 and 2.\n");
			subscribersOfStratum1And2 = scanner.nextInt();

			System.out.print(holding.addPublicServicesCompany(name, nit, address, phone, assets, dateOfConstitution, type, amountOfEmployees, legalRepresentative, floors, service, amountOfSubscribers, subscribersOfStratum1And2));

			break;

			default:

			System.out.print("\nInvalid number, please try again.\n");

			break;
		}
	}

	/**
	*<b>Description:</b> This method allows for displaying the list with all data entered by the user.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void showListOfAllData(){


		System.out.println(holding.toString());

		System.out.println(holding.showListOfAllData());
	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to create a employee.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void registerEmployeeMenu(){

		Scanner scanner = new Scanner(System.in);

		String name, job, email, nit;

		System.out.println("\nPlease enter the employee's name.\n");
		name = scanner.nextLine();

		System.out.println("\nPlease enter the employee's job.\n");
		job = scanner.nextLine();
		
		System.out.println("\nPlease enter the employee's email.\n");
		email = scanner.nextLine();

		System.out.println("\nPlease enter the company's nit you wish to add the employee to.\n");
		nit = scanner.nextLine();

		System.out.println(holding.addEmployee(name, job, email, nit));
	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to create a survey.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void registerSurveyMenu(){

		Scanner scanner = new Scanner(System.in);

		int answer1, answer2, answer3;
		String nit;

		System.out.println("\nOn a scale of 1 to 5 where 1 is not satisfied and 5 is very satisfied, how satisfied are you with:\n");
		System.out.println(Survey.QUESTIONS[0]);
		answer1 = validateInt(1, 5);
		
		System.out.println(Survey.QUESTIONS[1]);
		answer2 = validateInt(1, 5);

		System.out.println(Survey.QUESTIONS[2]);
		answer3 = validateInt(1, 5);

		System.out.println("\nPlease enter the nit of the company to which you want to add the survey.\n");
		nit = scanner.nextLine();

		System.out.println(holding.addSurvey(answer1, answer2, answer3, nit));

	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to calculate the proculture tax.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void calculateProCultureTaxMenu(){

		Scanner scanner = new Scanner(System.in);

		String nit;

		System.out.println("\nPlease enter the nit of the educational company to which you want to calculate proculture tax.\n");
		nit = scanner.nextLine();

		System.out.println(holding.calculateProCultureTax(nit));
	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to calculate the satisfaction level.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void calculateTheAverageSatisfactionLevelMenu(){

		Scanner scanner = new Scanner(System.in);

		String nit;

		System.out.println("\nPlease enter the nit of the service company to which you want to calculate the satisfaction level.\n");
		nit = scanner.nextLine();

		System.out.println(holding.calculateLevelOfSatisfaction(nit));
	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to create a Product.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void registerProductMenu(){

		Scanner scanner = new Scanner(System.in);

		String name, id, nit;
		double waterRequired;
		int inventory;

		System.out.println("\nPlease enter the product's name.\n");
		name = scanner.nextLine();

		System.out.println("\nPlease enter the product's id.\n");
		id = scanner.nextLine();
		
		System.out.println("\nPlease enter the product's water required.\n");
		waterRequired = scanner.nextDouble();

		System.out.println("\nPlease enter the product's units in inventory.\n");
		inventory = scanner.nextInt();
		scanner.nextLine();

		System.out.println("\nPlease enter the nit of the manufacturing company to which you want to add the product.\n");
		nit = scanner.nextLine();

		System.out.println(holding.addProduct(name, id, waterRequired, inventory, nit));

	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to calculate the waterXtree service.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void calculateTheWaterXTreeServiceForPharmaceuticalCompanies(){

		Scanner scanner = new Scanner(System.in);

		String nit;

		System.out.println("\nPlease enter the nit of the pharmaceutical company to which you want to calculate the waterXtree service.\n");
		nit = scanner.nextLine();

		System.out.println(holding.calculateTree(nit));
	}

	/**
	*<b>Description:</b> This method allows for displaying the menu to search a employee's extension with employee name.<br>
	*<b>Post:</b> Shows the menu.<br>
	*/

	public void findExtensionWithTheNameOfTheEmployeeMenu(){

		Scanner scanner = new Scanner(System.in);

		int typeOfSearch;
		String name, nit;

		System.out.println("\nPlease enter the company's nit\n");
		nit = scanner.nextLine();

		System.out.println("\nPlease enter the employee's name\n");
		name = scanner.nextLine();
	
		System.out.println("\nPlease select the type of search:\n");
		System.out.println(showConstantTypeOfSearchs() + "\n");
		typeOfSearch = validateInt(1, 5);

		System.out.println(holding.searchExtension(name, typeOfSearch, nit));
	}

	/**
	<b>Description:</b> This method allows showing the Company's TYPES_OF_SEARCHS constant to the user.<br>
	*@return A message with the TYPES_OF_SEARCHS constant.
	*/

	public String showConstantTypeOfSearchs(){

		String msg = "";
		int num = 0;

		for(int i = 0; i < Company.TYPES_OF_SEARCHS.length; i++){

			num = i + 1;
			msg += "\n" + num + "." + Company.TYPES_OF_SEARCHS[i];
		}

		return msg;
	}

	/**
	<b>Description:</b> This method allows showing the Public service company's PUBLIC_SERICES constant to the user.<br>
	*@return A message with the PUBLIC_SERVICES constant.
	*/

	public String showConstantPublicServices(){

		String msg = "";
		int num = 0;

		for(int i = 0; i < PublicServicesCompany.PUBLIC_SERVICES.length; i++){

			num = i + 1;
			msg += "\n" + num + "." + PublicServicesCompany.PUBLIC_SERVICES[i];
		}

		return msg;
	}

	/**
	<b>Description:</b> This method allows showing the SubordinateCompany's TYPE constant to the user.<br>
	*@return A message with the TYPE constant.
	*/

	public String showConstantType(){

		String msg = "";
		int num = 0;

		for(int i = 0; i < SubordinateCompany.TYPES.length; i++){

			num = i + 1;
			msg +=  "\n" + num + "." + SubordinateCompany.TYPES[i];
		}

		return msg;
	}

	/**
	<b>Description:</b> This method allows showing the Company's CLASSES_OF_COMPANIES constant to the user.<br>
	*@return A message with the CLASSES_OF_COMPANIES constant.
	*/

	public String showConstantClassesOfCompanies(){

		String msg = "";
		int num = 0;

		for(int i = 0; i < Company.CLASSES_OF_COMPANIES.length; i++){

			num = i + 1;
			msg += "\n" + num + "." + Company.CLASSES_OF_COMPANIES[i];
		}

		return msg;
	}

	/**
	<b>Description:</b> This method allows showing the pharmaceutical company's MODALITIES constant to the user.<br>
	*@return A message with the MODALITIES constant.
	*/

	public String showConstantModalites(){

		String msg = "";
		int num = 0;

		for(int i = 0; i < PharmaceuticalCompany.MODALITIES.length; i++){

			num = i + 1;
			msg += "\n" + num + "." + PharmaceuticalCompany.MODALITIES[i];
		}

		return msg;
	}

	/**
	*<b>Description:</b> This method allows selecting the modalite using the constant MODALITIES.<br>
	*@param modalitySelection A number that represent the modality selection.
	*@return The modality.
	*/

	public String selectModalitie(int modalitySelection){

		String modality = "";

		modality = PharmaceuticalCompany.MODALITIES[modalitySelection - 1];

		return modality;
	}

	/**
	*<b>Description:</b> This method allows selecting the service using the constant TYPE.<br>
	*@param typeSelection A number that represent the service selection.
	*@return The service.
	*/

	public String selectType(int typeSelection){

		String type = "";

		type = SubordinateCompany.TYPES[typeSelection - 1];

		return type;
	}

	/**
	*<b>Description:</b> This method allows selecting the public service using the constant PUBLIC_SERVICES.<br>
	*@param modalitySelection A number that represent the public service selection.
	*@return The modality.
	*/

	public String selectPublicService(int publicServiceSelection){
		
		String service = "";
		
		service = PublicServicesCompany.PUBLIC_SERVICES[publicServiceSelection - 1];

		return service;
	}


	/**
	*<b>Description:</b> This method allows validating if the number is in the range.<br>
	*@param minimun The minimum number of the range.
	*@param max The max number of the range.
	*@return A number that is in the range. 
	*/

	public int validateInt(int minimum, int max){
		
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		int num = 0;
		
		while(running){
			
			num = scanner.nextInt();
			scanner.nextLine();
			
			if(num >= minimum && num <= max){
				
				running = false;
				
			}
			else{
				
				System.out.print("\nInvalid number, please try again\n");
				
			}
			
		}
		
		return num;
	}

	/**
	*<b>Description:</b> This method allows establishing truth values ​​based on the number entered by the user.<br>
	*@return The truth value. 
	*/

	public boolean validateBoolean(){

		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		boolean answer = true;
		int num;

		while(running){

			num = scanner.nextInt();
			scanner.nextLine();

			if(num == 1){

				running = false;
			}

			else if(num == 2){
				
				answer = false;
				running = false;
			}

			else{

				System.out.print("\nInvalid number, please try again\n");
			}
		}

		return answer;
	}

}