package ui;
import model.*;
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
			System.out.println("2. Quit");
			System.out.println("3.");
			System.out.println("4.");
			System.out.println("5.");
			System.out.println("6.");
			System.out.println("7.");
			System.out.println("8.");
			System.out.println("9.");

			int choiceNum;
			choiceNum = scanner.nextInt();

			switch(choiceNum){

				case 1:

				registerCompanyMenu();
				
				break;

				case 2:

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
		int day, month, year, floors, typeSelection, classCompany;


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
		day = validateInt(1, 31);

		System.out.println("\nPlease enter the company's month of constitution (between 1 and 12).\n");
		month = validateInt(1, 12);

		System.out.println("\nPlease enter the company's year of constitution (until 2019).\n");
		year = validateInt(1, 2019);

		dateOfConstitution = new Date(day, month, year);

		System.out.println("\nPlease select the company's type:\n");
		System.out.println(showConstantType() + "\n");
		typeSelection = scanner.nextInt();
		type = selectType(typeSelection);
		scanner.nextLine();

		System.out.println("\nPlease enter the company's amount of employees.\n");
		amountOfEmployees = scanner.nextLine();

		System.out.println("\nPlease enter the company's legal epresentative.\n");
		legalRepresentative = scanner.nextLine();

		System.out.println("\nPlease enter the company's floors (between 3 and 7).\n");
		floors = validateInt(3, 7);

		System.out.println("\nPlease select the class of company do you want to create:\n");
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

			System.out.println("\nPlease enter the company's sanitary registration.\n");
			sanitaryRegistration = scanner.nextLine();

			System.out.println("\nPlease enter the sanitary registration status.\n");
		}
	}

	/**
	<b>Description: </b> This method allows showing the SubordinateCompany's TYPE constant to the user.<br>
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
	<b>Description: </b> This method allows showing the Company's CLASSES_OF_COMPANIES constant to the user.<br>
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

}