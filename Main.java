import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; //to get input from user
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

public class Main {

	// Init App
	static Scanner input = new Scanner(System.in); //Create a Scanner object
	static ArrayList<PrivateChat> all_chats = new ArrayList<PrivateChat>();
	static ArrayList<Contact> phonebook = new ArrayList<Contact>();
	static MediaApp m1 = new MediaApp();
	static boolean exit_loop = false;
	
	
	public static void main (String[] args) {
		
		boolean exit = false;

		// add some contacts to the phonebook (can be deleted)
		Phonebook.addContactFromMain(phonebook, "esther", "1111234");
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
				while (!exit_loop) 
				{
					main_phonebook(phonebook);
				}
				exit_loop = false;
				input.nextLine();
				break;
				
			case "2":	
				while (!exit_loop) 
				{
					main_sms(phonebook, all_chats);
				}
				exit_loop = false;
				break;
				
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
				break;
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
		input.close();
	}

	public static void main_phonebook(ArrayList<Contact> phonebook)
	{
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
				exit_loop = true;
				return;
			default:
				System.out.println("Unavialable");
				break;
			}
		}

	
	
	public static void main_sms(ArrayList<Contact> phonebook, ArrayList<PrivateChat> all_chats) 
	{
		// SMS Init
		PrivateChat chat = new PrivateChat(null);
		String contact_name = new String();
		String curr_message = new String();
		Contact my_contact = new Contact();
		String choice = new String();
		
		System.out.println("SMS:");
		System.out.println("Type the number of one of the following instructions to excute it:");
		System.out.println("1) Send SMS to contact");
		System.out.println("2) Receive SMS from contact");
		System.out.println("3) Delete chat with contact");
		System.out.println("4) Display all messages with specific contact");
		System.out.println("5) Search a specific messege in all chats");
		System.out.println("6) Display all chat messanges");
		System.out.println("7) Back to main menu)");
		
		
		choice = input.nextLine();
		switch (choice) 
		{
		case "1": // Send SMS to contact
			System.out.println("Type contact name: ");
			contact_name = input.nextLine();
			
			my_contact = Phonebook.findContact(phonebook, contact_name);
			
			//Contact doesnt exist
			if (my_contact == null)
			{
				System.out.println("Unavailable contact name");
				break;
			}
			
			//New chat 
			//if (all_chats.contains(my_contact)== false)
			if (my_contact.has_chat_get() == false)
			{
				my_contact.contact_new_chat();
				System.out.println("New Private Chat with " + my_contact.GetName());
				PrivateChat new_chat = new PrivateChat(my_contact);
				System.out.println("Send message to " + my_contact.GetName());
				curr_message = input.nextLine();
				new_chat.addMessage(curr_message, Message.SENT);
				all_chats.add(new_chat);
				break;
			}
			
			//Existing chat
			for (PrivateChat curr_privateChat : all_chats) 
			{
				if (curr_privateChat.getContact().equals(contact_name))
				{
					chat = curr_privateChat;
					break;
				}
			}
			System.out.println("New Message to " + my_contact.GetName());
			curr_message = input.nextLine();
			chat.addMessage(curr_message, Message.SENT);
			break;
		
			
		case "2": // Receive SMS from contact
			System.out.println("Type contact name: ");
			contact_name = input.nextLine();
			my_contact = Phonebook.findContact(phonebook, contact_name);
			
			//Contact doesnt exist
			if (my_contact == null)
			{
				System.out.println("Unavailable contact name");
				break;
			}
			
			//New chat 
			if (my_contact.has_chat_get() == false)
			{
				my_contact.contact_new_chat();
				System.out.println("New Private Chat with " + my_contact.GetName());
				PrivateChat new_chat = new PrivateChat(my_contact);
				System.out.println(my_contact.GetName() + ", send message to user");
				curr_message = input.nextLine();
				new_chat.addMessage(curr_message, Message.RECEIVED);
				all_chats.add(new_chat);
				break;
			}
			
			//Existing chat
			for (PrivateChat curr_privateChat : all_chats) 
			{
				if (curr_privateChat.getContact().equals(contact_name))
				{
					chat = curr_privateChat;
					break;
				}
			}
			System.out.println(my_contact.GetName() + ", New Message to user");
			curr_message = input.nextLine();
			chat.addMessage(curr_message, Message.RECEIVED);
			break;
			
			
		case "3": // Delete chat with contact
			System.out.println("Type contact name: ");
			contact_name = input.nextLine();
			my_contact = Phonebook.findContact(phonebook, contact_name);
			
			//Contact doesnt exist
			if (my_contact == null)
			{
				System.out.println("Unavailable contact name");
				break;
			}
			
			//New chat 
			if (my_contact.has_chat_get() == false)
			{
				System.out.println("No Private Chat with " + contact_name);
				break;
			}
			
			//Existing chat
			for (PrivateChat curr_privateChat : all_chats) 
			{
				if (curr_privateChat.getContact().equals(contact_name))
				{
					chat = curr_privateChat;
					break;
				}
			}
			System.out.println("Deleting Private Char with " + my_contact.GetName());
			my_contact.contact_delete_chat();
			all_chats.remove(chat);
			break;
		
			
		case "4": // Display all messages with specific contact
			System.out.println("Type contact name: ");
			contact_name = input.nextLine();
			my_contact = Phonebook.findContact(phonebook, contact_name);
			
			//Contact doesnt exist
			if (my_contact == null)
			{
				System.out.println("Unavailable contact name");
				break;
			}
			
			//New chat 
			//if (all_chats.contains(my_contact)== false)
			if (my_contact.has_chat_get() == false)
			{
				System.out.println("No available Private Chat with " + my_contact.GetName());
				break;
			}
			
			//Existing chat
			for (PrivateChat curr_privateChat : all_chats) 
			{
				if (curr_privateChat.getContact().equals(contact_name))
				{
					chat = curr_privateChat;
					break;
				}
			}
			System.out.println(chat);
			break;
			
		case "7":
			System.out.println("Going back to main App");
			exit_loop = true;
			return;
			
		default:
			System.out.println("Unavailable");
			break;
		}
    	
	} // end of main_sms function
	
} // end of Main class
