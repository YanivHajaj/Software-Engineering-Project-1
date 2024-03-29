import java.util.ArrayList;
import java.util.Scanner; //to get input from user
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER



public class Main {
	
	public static Scanner input = new Scanner(System.in); //Create a Scanner object
	public static boolean exit_loop = false;	// Create exit flag

	// Init Apps
	public static Phonebook my_phonebook = new Phonebook(); // Init phonebook
	public static MediaApp m1 = new MediaApp(); // Init MediaApp
	public static SMSApp chats = new SMSApp(); // Init SMSApp
	public static Diary my_diary = new Diary(); // Init DiaryApp
	
	
	public static void main (String[] args) {
		
		boolean exit = false;

		
		
		
		
		
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
				input.nextLine(); // clean input buffer
				while (!exit_loop) 
				{
					main_phonebook(my_phonebook.phonebook); // in order to reuse all the previous made functions
				}											// we need to send an ArrayList and not a Phonebook
				exit_loop = false;
				break;
				
			case "2":
				input.nextLine(); // clean input buffer
				while (!exit_loop) 
				{
					main_sms(my_phonebook.phonebook, chats.all_chats);
				}
				exit_loop = false;
				break;
				
			
			case "3":
				input.nextLine(); // clean input buffer
				while (!exit_loop) 
				{
					main_calendar(my_phonebook, my_diary);
				}
				exit_loop = false;
				break;
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
						System.out.println("Invalid input");
						break;
					}
					
				}
				break;
			case "5":
				System.out.println("printing everything from every app:");

				System.out.println("phonebook:");
				System.out.println("Type the number of one of the following instructions to excute it:");
				System.out.println("1) Add contact");
				System.out.println("2) Delete contact");
				System.out.println("3) Display all contacts");
				System.out.println("4) Search contact by name (return ArrayList that contains the occurrences)");
				System.out.println("5) Sort all contacts by name");
				System.out.println("6) Sort all contacts by number");
				System.out.println("7) Reverse the order of the phonebook");
				System.out.println("8) Save phonebook as a text file");
				System.out.println("9) Load contacts from a text file");



				System.out.println("SMS:");
				System.out.println("Type the number of one of the following instructions to excute it:");
				System.out.println("1) Send SMS to contact");
				System.out.println("2) Receive SMS from contact");
				System.out.println("3) Delete chat with contact");
				System.out.println("4) Display all messages with specific contact");
				System.out.println("5) Search for a contact with a specific sentence");
				System.out.println("6) Display all chat messanges");

				
				System.out.println("Calender:");
				System.out.println("Type the number of one of the following instructions to excute it:");
				System.out.println("1) Add an event/meeting");
				System.out.println("2) Delete an event/meeting");
				System.out.println("3) Display all events/meetings from a specific date");
				System.out.println("4) Display all meetings with a specific contact");
				System.out.println("5) search if there is overlapping events/meetings (delete if there is)");
				System.out.println("6) Display all events/meetings");



				System.out.println("Media:");
				System.out.println("Type the number of one of the following instructions to excute it:");
				System.out.println("1) Add a media");
				System.out.println("2) Play a media");
				System.out.println("3) Play all medias");


				System.out.println("Exiting. We will not take a new input");


				exit= true;
				break;
					
			case "6":
				System.out.println("Exiting. We will not take a new input");
				exit= true;
				break;
					
			default:
				System.out.println("Invalid input");
			//	break;


			}
		}
		//input.close();
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
			// System.out.println("7) Delete duplicates");
			System.out.println("7) Reverse the order of the phonebook");
			System.out.println("8) Save phonebook as a text file");
			System.out.println("9) Load contacts from a text file");
			System.out.println("10) Back to main menu");
			String Num1 = input.next();
			switch (Num1) {
			case "1":
				input.nextLine();
				System.out.print("Enter name of the contact: \n");
			    String name = input.nextLine();
				System.out.print("Enter phone number of the contact: \n");
			    String number = input.next();
			    Phonebook.addContactFromUser(phonebook,name, number);
				break;
			case "2":	
				//Phonebook.DeleteContact(phonebook, chats.all_chats, my_diary);
				Phonebook.DeleteContact(phonebook, chats.all_chats, my_diary);
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
//			case "7":
//				Phonebook.deleteDuplicatenew(phonebook);
//				break;
			case "7":
				Phonebook.reverseOrder(phonebook);
				System.out.println("The order was reversed.");
				break;
			case "8":
				Phonebook.saveToTextFile(phonebook);
				break;
			case "9":
				Phonebook.addFromFile(phonebook);
				break;
			case "10":
				System.out.println("Going back to main App");
				exit_loop = true;
				return;
			default:
				System.out.println("Invalid input");
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
		System.out.println("5) Search for a contact with a specific sentence");
		System.out.println("6) Display all chat messanges");
		System.out.println("7) Back to main menu)");
		
		
		choice = input.nextLine();
		switch (choice) 
		{
		case "1": // Send SMS to contact
			System.out.println("Type contact name: ");
			contact_name = input.nextLine();
			System.out.println("Type the new Message: ");
			curr_message = input.nextLine();
			chats.addNewMessege(phonebook,my_phonebook,contact_name,curr_message);
			
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
				System.out.println(my_contact.GetName() + ", send new message to user");
				curr_message = input.nextLine();
				new_chat.addMessage(curr_message, Message.RECEIVED);
				all_chats.add(new_chat);
				break;
			}
			
			//Existing chat
			for (PrivateChat curr_privateChat : all_chats) 
			{
				if (curr_privateChat.getContact().equals(my_contact.GetName()))
				{
					chat = curr_privateChat;
					break;
				}
			}
			System.out.println(my_contact.GetName() + ", send new message to user");
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
				if (curr_privateChat.getContact().equals(my_contact.GetName()))
				{
					chat = curr_privateChat;
					break;
				}
			}
			System.out.println("Deleting Private Chat with " + my_contact.GetName());
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
			if (my_contact.has_chat_get() == false)
			{
				System.out.println("No Private Chat with " + my_contact.GetName());
				break;
			}
			
			//Existing chat
			for (PrivateChat curr_privateChat : all_chats) 
			{
				if (curr_privateChat.getContact().equals(my_contact.GetName()))
				{
					chat = curr_privateChat;
					break;
				}
			}
			System.out.println(chat);
			break;
		case "5": //printing contacts who have chats with a specific sentence
			System.out.println("Type a sentence:");
			String sentence = input.nextLine();
			chats.searchContact(sentence);
			break;
		case "6": //print all messages from all chats	
			chats.displayAll();
			break;
		case "7":
			System.out.println("Going back to main App");
			exit_loop = true;
			return;
			
		default:
			System.out.println("Invalid input");
			break;
		}
    	
	} // end of main_sms function
	
	
	public static void main_calendar(Phonebook phonebook,Diary my_diary) //, Diary my_diary)
	{
		
		System.out.println("Calender:");
		System.out.println("Type the number of one of the following instructions to excute it:");
		System.out.println("1) Add an event/meeting");
		System.out.println("2) Delete an event/meeting");
		System.out.println("3) Display all events/meetings from a specific date");
		System.out.println("4) Display all meetings with a specific contact");
		System.out.println("5) search if there is overlapping events/meetings (delete if there is)");
		System.out.println("6) Display all events/meetings");
		System.out.println("7) Back to main menu");
		
		String Num1 = input.next();
		
		switch (Num1) 
		{
		case "1":
			System.out.println("press 1 to add event, press 2 to add meeting(with contact)");
			String eventOrMeeting = input.next();
			//~~~~~~~~~~~~~~~~~~~~~ he choose 1 now choose event Or Meeting
			switch (eventOrMeeting) 
			{
				case "1":
					my_diary.AddEvent(phonebook);
					break;
				case "2":
					my_diary.AddMeeting(phonebook);
					break;	
	
				default:
					System.out.println("Invalid input return to main");
					break;
			} // end of switch case
			break;
			//~~~~~~~~~~~~~~~~~~~~~ he choose 1 now choose event Or Meeting
//		case "2":
//			System.out.println("Going back to main App");
//			exit_loop = true;
//			break;
			
		case "2":
			my_diary.RemoveDay();
			break;		
			
		case "3":
			System.out.println("~~~~~ all the events in specific day: ~~~~~");
			my_diary.PrintOneDay();
			System.out.println("~~~~~ all the events in specific day: ~~~~~");
			break;	
			
		case "4":
			System.out.println("~~~~~ all the meetings with contact: ~~~~~");
			my_diary.PrintOneContact(phonebook);
			System.out.println("~~~~~ all the meetings with contact: ~~~~~");
			break;	
		
		case "5":
			System.out.println("~~~~~ check for overlap and delete(if exist): ~~~~~");
			my_diary.DeleteCollidingEvents();
			System.out.println("~~~~~ check for overlap and delete(if exist): ~~~~~");
			break;	
			
		case "6":
			System.out.println("~~~~~ all the events/meetings in the Diary: ~~~~~");
			my_diary.PrintDiaryBook();
			System.out.println("~~~~~ all the events/meetings in the Diary: ~~~~~");
			break;		
			
		case "7":
			System.out.println("Going back to main App");
			exit_loop = true;
			break;
		default:
			System.out.println("Invalid input");
			break;
		} // end of switch case
	}// end of main_calendar
	
	
} // end of Main class
