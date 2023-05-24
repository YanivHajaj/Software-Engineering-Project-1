import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; //to get input from user
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

public class Main {

	
	static Scanner input = new Scanner(System.in); //Create a Scanner object
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Contact> phonebook = new ArrayList<Contact>();
		MediaApp m1 = new MediaApp();
		boolean exit = false;

		// add some contacts to the phonebook (can be deleted)
		Phonebook.addContactFromMain(phonebook, "moahe", "1111234");
		Phonebook.addContactFromMain(phonebook, "david", "2225678");
		Phonebook.addContactFromMain(phonebook, "shlomo", "4443333");
		Phonebook.addContactFromMain(phonebook, "avraham", "3331234");
		Phonebook.addContactFromMain(phonebook, "shlomo", "4441111");
		Phonebook.addContactFromMain(phonebook, "shlomo", "4442222");
		Phonebook.addContactFromMain(phonebook, "shlomo", "4443333");
		Phonebook.addContactFromMain(phonebook, "shlomo", "4443333"); 
		Phonebook.addContactFromMain(phonebook, "shlomo", "4443333");

		
		while (!exit) {
			boolean exitPhonebook = false;
			System.out.println("Type the number of one of the following instructions to excute it:");
			System.out.println("1) Phonebook app");
			System.out.println("2) SMS app");
			System.out.println("3) Calender app");
			System.out.println("4) Media");
			System.out.println("5) Print everything");
			System.out.println("6) Exit the program");
			String Num = input.next();
			switch (Num) {
			case "1":
				while (!exitPhonebook) {
					System.out.println("phonebook:");
					System.out.println("Type the number of one of the following instructions to excute it:");
					System.out.println("1) Add contact");
					System.out.println("2) Delete contact");
					System.out.println("3) Display all contacts");
					System.out.println("4) Search contact by name (return ArrayList that contains the occurrences)");
					System.out.println("5) Sort all contacts by name");
					System.out.println("6) Sort all contacts by number");
					System.out.println("7) Delete duplicates");
					System.out.println("8) Reverse the order of the phonebook");
					System.out.println("9) Save phonebook as a text file");
					System.out.println("10) Load contacts from a text file");
					System.out.println("11) Back to main menu");
					String Num1 = input.next();
					switch (Num1) {
					case "1":
						Phonebook.addContactFromUser(phonebook);
						break;
					case "2":	
						Phonebook.DeleteContact(phonebook);
						break;
					case "3":
						Phonebook.printAllContact(phonebook);
						break;
					case "4":
						Phonebook.findNameOccurrences(phonebook);	
						break;
					case "5":
						Phonebook.sortListByName(phonebook);
						break;
					case "6":
						Phonebook.sortListByNumber(phonebook);
						break;
					case "7":
						Phonebook.deleteDuplicatenew(phonebook);
						break;
					case "8":
						Phonebook.reverseOrder(phonebook);
						System.out.println("The order was reversed.");
						break;
					case "9":
						Phonebook.saveToTextFile(phonebook);
						break;
					case "10":
						Phonebook.addFromFile(phonebook);
						break;
					case "11":
						System.out.println("Going back to main App");
						exitPhonebook= true;
						break;
					default:
						System.out.println("Unavialable");
						break;
					}
				}
				
			case "2":	
				while (!exitPhonebook) {

					System.out.println("SMS:");
					System.out.println("Type the number of one of the following instructions to excute it:");
					System.out.println("1) send SMS to contact");
					System.out.println("2) Delete chat with contact");
					System.out.println("3) Display all messages with specific contact");
					System.out.println("4) Search a specific messege in all chats");
					System.out.println("5) Display all chat messanges");
					System.out.println("6) Back to main menu)");
				
					String Num1 = input.next();
					switch (Num1) {
					case "1":
						Phonebook.addContactFromUser(phonebook);
						break;
					
					case "6":
						System.out.println("Going back to main App");
						exitPhonebook= true;
						break;
					default:
						System.out.println("Unavialable");
						break;
					}
				}
				
			case "3":
				while (!exitPhonebook) {

					System.out.println("Calender:");
					System.out.println("Type the number of one of the following instructions to excute it:");
					System.out.println("1) Add an event");
					System.out.println("2) Delete an event");
					System.out.println("3) Display all events from a specific date");
					System.out.println("4) Display all events with a specific contact");
					System.out.println("5) search if there is overlapping events (delete if there is)");
					System.out.println("6) Display all events");
					System.out.println("7) Back to main menu)");
					String Num1 = input.next();
					switch (Num1) {
					case "1":
						Phonebook.addContactFromUser(phonebook);
						break;
					
					case "7":
						System.out.println("Going back to main App");
						exitPhonebook= true;
						break;
					default:
						System.out.println("Unavialable");
						break;
				}
			}
				
			case "4":
				while (!exitPhonebook) {
					
					System.out.println("Media:");
					System.out.println("Type the number of one of the following instructions to excute it:");
					System.out.println("1) Add a media");
					System.out.println("2) Play a media");
					System.out.println("3) Play all medias");
					System.out.println("4) Back to main menu)");
					//exitPhonebook= false;
					String Num1 = input.next();
					switch (Num1) {
					case "1":
						m1.addMedia();
						break;
						//continue;
					case "2":
						m1.playByName();
						break;
						//continue;
					case "3":
						m1.playAllMedia();
						break;
						//continue;
					case "4":
						System.out.println("Going back to main App");
						exitPhonebook= true;
						break;
						//continue;
					default:
						System.out.println("Unavialable");
						break;
					}
					
				}
				break;
			case "5":
				System.out.println("printing everything from every app:");
				exit= true;
				break;
					
			case "6":
				System.out.println("Exiting. We will not take a new input");
				exit= true;
				break;
					
			default:
				System.out.println("Unavialable");
			//	break;


			}
		}
	}

	
	
	public static void main_sms(ArrayList<Contact> phonebook) 
	{
		
		// add switch case for options:
		
			// if user is admin -> can access all functionalities
		
			// else if user has its contact -> can send messages to user 
		
			// else -> exit
		
		
		//debug tests
		Scanner input = new Scanner(System.in); //Create a Scanner object

		Contact tomer = new Contact("Tomer", "0555555557");
		PrivateChat chat1 = new PrivateChat(tomer);
		chat1.addMessage(new Message("Hello Wrold", Message.SENT)); 
		chat1.addMessage("Hello Mars", Message.RECEIVED);
    	System.out.println(chat1.getContact() + " send a message to User : "); 
		chat1.addMessage(input.nextLine(), Message.RECEIVED);
    	System.out.println(chat1); 
    	
    	
    	
    	ArrayList<PrivateChat> all_chats = new ArrayList<PrivateChat>();
    	boolean exit = false;
    	while (!exit) 
    	{
    		System.out.println("Type the number of one of the following instructions to excute it:");
    		System.out.println("1) Adding another chat with a person from your contacts");
    		System.out.println("2) Delete all chat messages with a specific person.");
    		System.out.println("3) Display all contacts");
    		System.out.println("4) Find all messages with a certein sentence");
    		System.out.println("5) Print messages from all chats");
    		System.out.println("6) Exit the SMS program");
    		String Num = input.next();
    		
//    		switch (Num) {
//    		case "1":
//        		System.out.println("Enter the contact name:");
//        		String name = input.nextLine();
//    			//all_chats.add(new PrivateChat(Phonebook.getContact(name))
//    			break;
//    		case "2":	
//    			deleteChat(allChats);
//    			break;
//    		case "3":
//    			displayChat(allChats);
//    			break;
//    		case "4":
//    			findSentence(allChats);	
//    			break;
//    		case "5":
//    			displayAllChats(allChats);
//    			System.out.println("Exiting. We will not take a new input");
//    			exit= true;
//    			break;
//    		default:
//    			System.out.println("Unavialable");
//    			break;
    	}
    	input.close();
    	
	} // end of main_sms function
} // end of Main class
