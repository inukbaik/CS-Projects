package Assignment_6;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String name;
		int logInId;
		String campus;
		String email;
		int accessCode;
		Administrators admin = new Administrators("John", 1234, "Suny","john@gmail.com",1234);
		System.out.println("ENTER YOUR INFORMATION");
		System.out.println("Name");
		name = input.next();
		System.out.println("Log in ID");
		logInId = input.nextInt();
		System.out.println("Campus");
		campus = input.next();
		System.out.println("Email");
		email = input.next();
		System.out.println("AccessCode if you are administrator. If not, put 0");
		accessCode = input.nextInt();
		if(accessCode == (int)admin.getAccessCode()) {
			System.out.println(name + " " + logInId+ " " + email + " " + campus + " " + accessCode);
			System.out.println("Press 1 to add media");
			System.out.println("Press 2 to delete media");
			int choiceAdmin = input.nextInt(); 
			switch(choiceAdmin) {
			case 1:
				imposeFee();
				break;
			
			case 2:
				SendMessage();
				break;
			default:
				System.out.println("Choose from 1 to 2");
				break;
				
		}
			
		}
		if(accessCode == 0) {
			System.out.println("Press 1 if you are librarian");
			System.out.println("Press 2 if you are a client");
			int choice1 = input.nextInt();
		if (choice1 == 1) {
			System.out.println("Press 1 to add new media");
			System.out.println("Press 2 to issue media to client");
			System.out.println("Press 3 to update catalogue");
			System.out.println("Press 4 to update media");
			System.out.println("Press 5 to search media");
			System.out.println("Press 6 to view issue history");
			int choice2 = input.nextInt();
			
			switch(choice2) {
			case 1:
				addNewMedia();
				break;
			
			case 2:
				deleteM();
				break;
			default:
				System.out.println("Choose from 1 to 2");
				break;
				
		}
		}
		if(accessCode == 2) {
			System.out.println("Library Management System");
			System.out.println("Press 1 to Find Media");
			System.out.println("Press 2 to Check out Media");
			System.out.println("Press 3 to Return a Media");
			System.out.println("Press 4 if you Lost a Media");
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				findMedia();
				break;
			case 2:
				checkOutMedia();
				break;
			case 3:
				returnMedia();
				break;
			case 4:
				lostMedia();
			default:
				System.out.println("Choose from 1 to 4");
				break;
			}
		}
		}
		
		}
	

	private static void imposeFee() {
		// TODO Auto-generated method stub
		
	}


	private static void SendMessage() {
		// TODO Auto-generated method stub
		
	}


	private static void checkOutMedia() {
		// TODO Auto-generated method stub
		
	}


	private static void deleteMedia() {
		

		
	}

	private static void addMedia() {
		// TODO Auto-generated method stub
		
	}

	private static void lostMedia() {
		// TODO Auto-generated method stub
		
	}

	private static void returnMedia() {
		// TODO Auto-generated method stub
		
	}

	private static void issueMedia() {
		// TODO Auto-generated method stub
		
	}

	private static void findMedia() {
		// TODO Auto-generated method stub
		
	}
}
