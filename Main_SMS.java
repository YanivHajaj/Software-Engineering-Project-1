import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; //to get input from user
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

public class Main_SMS {
	public static void main_sms() {
		
		// add switch case for options
		
		
		//debug tests
		Scanner message_input = new Scanner(System.in); //Create a Scanner object

		Contact samy = new Contact("Samy", "0585896777");
		PrivateChat chat1 = new PrivateChat(samy);
		chat1.addMessage(new Message("Hello Wrold", Message.SENT)); 
		chat1.addMessage("Hello Mars", Message.RECEIVED);
    	System.out.println("Send a message to: " + chat1._contact.GetName()); 
		chat1.addMessage(message_input.nextLine(), Message.RECEIVED);
	
	}
}
