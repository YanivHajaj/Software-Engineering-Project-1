import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; //to get input from user
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

public class Main_SMS {
	public static void main_sms() { // needs to receive Phonebook
		
		// add switch case for options:
		
			// if user is admin -> can access all functionalities
		
			// else if user has its contact -> can send messages to user 
		
			// else -> exit
		
		
		//debug tests
		Scanner input = new Scanner(System.in); //Create a Scanner object

		Contact samy = new Contact("Samy", "0585896777");
		PrivateChat chat1 = new PrivateChat(samy);
		chat1.addMessage(new Message("Hello Wrold", Message.SENT)); 
		chat1.addMessage("Hello Mars", Message.RECEIVED);
    	System.out.println("Send a message to: " + chat1.getContact()); 
		chat1.addMessage(input.nextLine(), Message.RECEIVED);
    	System.out.println(chat1); 
    	
    	
    	
    	ArrayList<PrivateChat> all_chats = new ArrayList<PrivateChat>();
    	boolean exit = false;
    	while (!exit) {
    		System.out.println("Type the number of one of the following instructions to excute it:");
    		System.out.println("1) Adding another chat with a person from your contacts");
    		System.out.println("2) Delete all chat messages with a specific person.");
    		System.out.println("3) Display all contacts");
    		System.out.println("4) Find all messages with a certein sentence");
    		System.out.println("5) Print messages from all chats");
    		System.out.println("6) Exit the SMS program");
    		String Num = input.next();
    		
    		switch (Num) {
    		case "1":
        		System.out.println("Enter the contact name:");
        		String name = input.nextLine();
    			//all_chats.add(new PrivateChat(Phonebook.getContact(name))
    			break;
    		case "2":	
    			deleteChat(allChats);
    			break;
    		case "3":
    			displayChat(allChats);
    			break;
    		case "4":
    			findSentence(allChats);	
    			break;
    		case "5":
    			displayAllChats(allChats);
    			System.out.println("Exiting. We will not take a new input");
    			exit= true;
    			break;
    		default:
    			System.out.println("Unavialable");
    			break;
	
	}
}
