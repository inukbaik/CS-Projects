package Assignment_6;

import java.io.IOException;
import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner (System.in);
		String name = null;
		int id = 0;
		String campus = null;
		String email = null;
		int accessCode;
		String title = null;
		String author = null;
		int status = 0;
		int isbn = 0;
		
		Librarians li = new Librarians(name, id, campus, email);
		Administrators ad = new Administrators(name, id, campus, email);
		Clients cl = new Clients(name, id, campus, email);
		
		CDs cd = new CDs(title, isbn, author, status);
		DVDs dvd = new DVDs(title, isbn, author, status);
		Books book = new Books(title, isbn, author, status);
		
		//Administrators admin = new Administrators("John", 1234, "Suny","john@gmail.com",1234);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println();
		System.out.println("WELCOME TO THE LIBRARY");
		System.out.println();
		System.out.println("If you are a Client, \t\tplease press 1");
		System.out.println("If you have a Adiministrator, \tplease press 2");
		System.out.println("If you have a Librarian, \tplease press 3");
		System.out.println("------------------------------------------------------------------");
		int choice1 = input.nextInt();
		switch(choice1) {
		case 1:
			System.out.println("------------------------------------------------------------------");
			System.out.println("If you have an ID, \t\tplease press 1");
			System.out.println("If you don't have an ID \tplease press 2");
			System.out.println("------------------------------------------------------------------");
			int choice2 = input.nextInt();
			switch(choice2) {
			case 1:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Enter your ID");
				System.out.println("------------------------------------------------------------------");
				int choice3 = input.nextInt();
				if(cl.logIn(choice3) == true) {
					System.out.println("------------------------------------------------------------------");
					System.out.println("Press 1 \t to find media");
					System.out.println("Press 2 \t to return media");
					System.out.println("Press 3 \t if you lost media");
					System.out.println("Press 4 \t to check out media");
					System.out.println("------------------------------------------------------------------");
					int choice4 = input.nextInt();
					switch(choice4) {
					case 1:
						System.out.println("------------------------------------------------------------------");
						System.out.println("Press 1 \t to find CDs");
						System.out.println("Press 2 \t to find DVDs");
						System.out.println("Press 3 \t to find Books");
						System.out.println("------------------------------------------------------------------");
						int choice5 = input.nextInt();
						switch(choice5) {
						case 1:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Press 1 \t to find by Title");
							System.out.println("Press 2 \t to find by ISBN");
							System.out.println("Press 3 \t to find by Author");
							System.out.println("------------------------------------------------------------------");
							int choice6 = input.nextInt();
							switch(choice6) {
							case 1:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the Title");
								System.out.println("------------------------------------------------------------------");
								String titleCase = input.next();
								cd.findMediaTitle(titleCase);
								break;
							case 2:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the ISBN");
								System.out.println("------------------------------------------------------------------");
								int isbnCase = input.nextInt();
								cd.findMediaIsbn(isbnCase);
								break;
							case 3:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the Author");
								System.out.println("------------------------------------------------------------------");
								String authorCase = input.next();
								cd.findMediaAuthor(authorCase);
								break;
							default:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Press 1 to 3");
								System.out.println("------------------------------------------------------------------");
								break;
							}
							break;
						case 2:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Press 1 \t to find by Title");
							System.out.println("Press 2 \t to find by ISBN");
							System.out.println("Press 3 \t to find by Author");
							System.out.println("------------------------------------------------------------------");
							int choice7 = input.nextInt();
							switch(choice7) {
							case 1:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the Title");
								System.out.println("------------------------------------------------------------------");
								String titleCase = input.next();
								dvd.findMediaTitle(titleCase);
								break;
							case 2:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the ISBN");
								System.out.println("------------------------------------------------------------------");
								int isbnCase = input.nextInt();
								dvd.findMediaIsbn(isbnCase);
								break;
							case 3:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the Author");
								System.out.println("------------------------------------------------------------------");
								String authorCase = input.next();
								dvd.findMediaAuthor(authorCase);
								break;
							default:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Press 1 to 3");
								System.out.println("------------------------------------------------------------------");
								break;
							}
							break;
						case 3:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Press 1 \t to find by Title");
							System.out.println("Press 2 \t to find by ISBN");
							System.out.println("Press 3 \t to find by Author");
							System.out.println("------------------------------------------------------------------");
							int choice8 = input.nextInt();
							switch(choice8) {
							case 1:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the Title");
								System.out.println("------------------------------------------------------------------");
								String titleCase = input.next();
								book.findMediaTitle(titleCase);
								break;
							case 2:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the ISBN");
								System.out.println("------------------------------------------------------------------");
								int isbnCase = input.nextInt();
								book.findMediaIsbn(isbnCase);
								break;
							case 3:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Enter the Author");
								System.out.println("------------------------------------------------------------------");
								String authorCase = input.next();
								book.findMediaAuthor(authorCase);
								break;
							default:
								System.out.println("------------------------------------------------------------------");
								System.out.println("Press 1 to 3");
								System.out.println("------------------------------------------------------------------");
								break;
							}
							break;
						default:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Press 1 to 3");
							System.out.println("------------------------------------------------------------------");
							break;
						}
						break;
					case 2: 
						System.out.println("------------------------------------------------------------------");
						System.out.println("Press 1 \t to return CDs");
						System.out.println("Press 2 \t to return DVDs");
						System.out.println("Press 3 \t to return Books");
						System.out.println("------------------------------------------------------------------");
						int choice9 = input.nextInt();
						switch(choice9) {
						case 1:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of the CD");
							System.out.println("------------------------------------------------------------------");
							int isbnReturnCd = input.nextInt();
							cd.returnMedia(isbnReturnCd);
							break;
						case 2:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of the DVD");
							System.out.println("------------------------------------------------------------------");
							int isbnReturnDvd = input.nextInt();
							dvd.returnMedia(isbnReturnDvd);
							break;
						case 3:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of the CD");
							System.out.println("------------------------------------------------------------------");
							int isbnReturnBook = input.nextInt();
							book.returnMedia(isbnReturnBook);
							break;
						default:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Press 1 to 3");
							System.out.println("------------------------------------------------------------------");
							break;
						}
						break;
					case 3:
						System.out.println("------------------------------------------------------------------");
						System.out.println("Press 1 \t if you lost CDs");
						System.out.println("Press 2 \t if you lost DVDs");
						System.out.println("Press 3 \t if you lost Books");
						System.out.println("------------------------------------------------------------------");
						int choice10 = input.nextInt();
						switch(choice10) {
						case 1:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of the CD");
							System.out.println("------------------------------------------------------------------");
							int isbnRemoveCd = input.nextInt();
							cd.removeMedia(isbnRemoveCd);
							break;
						case 2:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of the DVD");
							System.out.println("------------------------------------------------------------------");
							int isbnRemoveDvd = input.nextInt();
							dvd.removeMedia(isbnRemoveDvd);
							break;
						case 3:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of the Book");
							System.out.println("------------------------------------------------------------------");
							int isbnRemoveBook = input.nextInt();
							book.removeMedia(isbnRemoveBook);
							break;
						default:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Press 1 to 3");
							System.out.println("------------------------------------------------------------------");
							break;
						}
						break;
					case 4:
						System.out.println("------------------------------------------------------------------");
						System.out.println("Press 1 \to check out CDs");
						System.out.println("Press 2 \to check out DVDs");
						System.out.println("Press 3 \to check out Books");
						System.out.println("------------------------------------------------------------------");
						int choice11 = input.nextInt();
						switch(choice11) {
						case 1:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of CD");
							System.out.println("------------------------------------------------------------------");
							int isbnCheckCd = input.nextInt();
							cd.checkOutMedia(isbnCheckCd);
							break;
						case 2:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of DVD");
							System.out.println("------------------------------------------------------------------");
							int isbnCheckDvd = input.nextInt();
							dvd.checkOutMedia(isbnCheckDvd);
							break;
						case 3:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Enter the ISBN of Book");
							System.out.println("------------------------------------------------------------------");
							int isbnCheckBook = input.nextInt();
							cd.checkOutMedia(isbnCheckBook);
							break;
						default:
							System.out.println("------------------------------------------------------------------");
							System.out.println("Press 1 to 3");
							System.out.println("------------------------------------------------------------------");
							break;
						}
						break;
					default : 
						System.out.println("------------------------------------------------------------------");
						System.out.println("Press 1 to 4");
						System.out.println("------------------------------------------------------------------");
						break;
					}
				}else {
					System.out.println("------------------------------------------------------------------");
					System.out.println("Invalid ID");
					System.out.println("------------------------------------------------------------------");
				}
				break;
			case 2:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Sign In");
				System.out.println("Enter your Name");
				String nameClient = input.next();
				System.out.println("Enter your ID");
				int idClient = input.nextInt();
				System.out.println("Enter your Campus");
				String campusClient = input.next();
				System.out.println("Enter your Email");
				String emailClient = input.next();
				cl.addClients(nameClient, idClient, campusClient, emailClient);
				System.out.println("You are added to our LMS");
				System.out.println("------------------------------------------------------------------");
				break;
			default:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Press 1 to 2");
				System.out.println("------------------------------------------------------------------");
				break;
			}
			break;
		case 2:
			System.out.println("------------------------------------------------------------------");
			System.out.println("If you have an ID, \t\tplease press 1");
			System.out.println("If you don't have an ID \tplease press 2");
			System.out.println("------------------------------------------------------------------");
			int choice4 = input.nextInt();
			switch(choice4) {
			case 1:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Enter your ID");
				System.out.println("------------------------------------------------------------------");
				int choice3 = input.nextInt();
				if(cl.logIn(choice3) == true) {
					System.out.println("------------------------------------------------------------------");
					System.out.println("Enter the access code");
					System.out.println("------------------------------------------------------------------");
					int accessCode1 = input.nextInt();
					if(accessCode1 == 1000) {
						System.out.println("------------------------------------------------------------------");
					System.out.println("Enter the client's ID to send a message");
					System.out.println("------------------------------------------------------------------");
					int clientId = input.nextInt();
					cl.messageLate(clientId);
					}else {
						System.out.println("------------------------------------------------------------------");
						System.out.println("Access Denied");
						System.out.println("------------------------------------------------------------------");
					}
				}else {
					System.out.println("------------------------------------------------------------------");
					System.out.println("Invalid ID");
					System.out.println("------------------------------------------------------------------");
				}
				break;
			case 2:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Sign In");
				System.out.println("Enter your Name");
				String nameClient = input.next();
				System.out.println("Enter your ID");
				int idClient = input.nextInt();
				System.out.println("Enter your Campus");
				String campusClient = input.next();
				System.out.println("Enter your Email");
				String emailClient = input.next();
				ad.addAdmin(nameClient, idClient, campusClient, emailClient);
				System.out.println("You are added to our LMS");
				System.out.println("------------------------------------------------------------------");
				break;
			default:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Press 1 to 2");
				System.out.println("------------------------------------------------------------------");
				break;
			}
			break;
		case 3:
			System.out.println("------------------------------------------------------------------");
			System.out.println("If you have an ID, \t\tplease press 1");
			System.out.println("If you don't have an ID \tplease press 2");
			System.out.println("------------------------------------------------------------------");
			int choice5 = input.nextInt();
			switch(choice5) {
			case 1:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Enter your ID");
				System.out.println("------------------------------------------------------------------");
				int choice3 = input.nextInt();
				if(cl.logIn(choice3) == true) {
					System.out.println("------------------------------------------------------------------");
					System.out.println("Enter the access Code");
					System.out.println("------------------------------------------------------------------");
					int accessCode2 = input.nextInt();
					if(accessCode2 == 3333) {
						System.out.println("------------------------------------------------------------------");
					System.out.println("Enter what to add in a Need List");
					System.out.println("------------------------------------------------------------------");
					String needList = input.next();
					li.addWants(needList);
					}else {
						System.out.println("------------------------------------------------------------------");
						System.out.println("Access Denied");
						System.out.println("------------------------------------------------------------------");
					}
				}else {
					System.out.println("------------------------------------------------------------------");
					System.out.println("Invalid ID");
					System.out.println("------------------------------------------------------------------");
				}
				break;
			case 2:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Sign In");
				System.out.println("Enter your Name");
				String nameClient = input.next();
				System.out.println("Enter your ID");
				int idClient = input.nextInt();
				System.out.println("Enter your Campus");
				String campusClient = input.next();
				System.out.println("Enter your Email");
				String emailClient = input.next();
				li.addLib(nameClient, idClient, campusClient, emailClient);
				System.out.println("You are added to our LMS");
				System.out.println("------------------------------------------------------------------");
				break;
			default:
				System.out.println("------------------------------------------------------------------");
				System.out.println("Press 1 to 2");
				System.out.println("------------------------------------------------------------------");
				break;
			}
		break;
		default:
			System.out.println("------------------------------------------------------------------");
			System.out.println("Choose from 1 to 3");
			System.out.println("------------------------------------------------------------------");
		}
	}
}
