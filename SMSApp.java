import java.util.ArrayList;
import java.util.Iterator;

public class SMSApp 
{
	ArrayList<PrivateChat> all_chats; 
	
	public SMSApp() 
	{
		all_chats = new ArrayList<PrivateChat>();
	}
	public boolean isEmpty() { 
		if(all_chats.isEmpty())
			return true;
		else
			return false;
	}
	public void displayAll() { 
		if(!all_chats.isEmpty()) {
			Iterator<PrivateChat> it = all_chats.iterator();
			while (it.hasNext()) {
				PrivateChat next = it.next();
				System.out.println(next);
			}
			System.out.print("\n");
		}
		else {System.out.println("There are no chats");}
	}
	public void printContact(String sentence) { 
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
