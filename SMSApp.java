import java.util.ArrayList;
import java.util.Iterator;

public class SMSApp 
{
	ArrayList<PrivateChat> all_chats; 
	
	public SMSApp() 
	{
		all_chats = new ArrayList<PrivateChat>();
	}
	public void displayAll() { //Print all messages from all chats
		if(all_chats.isEmpty()) {
			System.out.println("There are no chats");
		}
		else { //there are chats to be printed
			Iterator<PrivateChat> it = all_chats.iterator();
			while (it.hasNext()) {
				PrivateChat next = it.next();
				System.out.println(next);
			}
			System.out.print("\n");
		}
	}
	public void searchContact(String sentence) { //this function checks if at least one contact with the sentence was found. 
		boolean foundAtLeastOne=false;
    	for(PrivateChat chat:all_chats) {
    		boolean found=chat.printSpecificContacts(sentence);
    		if (found) {foundAtLeastOne=true;}
		}
    	if (foundAtLeastOne==false) {
    	System.out.print("Sentence not found.");
    	}
    }
}
