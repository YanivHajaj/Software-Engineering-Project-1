import java.util.ArrayList;
import java.util.Iterator;

public class SMSApp 
{
	ArrayList<PrivateChat> all_chats; 
	
	public SMSApp() 
	{
		all_chats = new ArrayList<PrivateChat>();
	}
	public boolean isEmpty() { //return true if data is empty
		if(all_chats.isEmpty())
			return true;
		else
			return false;
	}
	public void displayAll() { 
		if(!all_chats.isEmpty()) {
			Iterator<PrivateChat> it = all_chats.iterator();
			while (it.hasNext()) {
				PrivateChat i = it.next();
				System.out.println(i);
			}
			System.out.print("\n");
		}
		else {
			System.out.println("The Chat list is empty");
		}
	}
	public void printContact(String sentence) { 
		boolean foundAtLeastOne=false;
    	for(PrivateChat chat:all_chats) {
    		boolean found=chat.getMesseges(sentence);
    		if (found) {foundAtLeastOne=true;}
		}
    	if (foundAtLeastOne==false) {
    	System.out.print("Sentence not found.");
    	}
    }
}
