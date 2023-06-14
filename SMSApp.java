import java.util.ArrayList;
import java.util.Iterator;

public class SMSApp 
{
	ArrayList<PrivateChat> all_chats; 
	PrivateChat chat = new PrivateChat(null);
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
	
	
	
	public void addNewMessege(ArrayList<Contact> phonebook,Phonebook Phonebook, String contact_name, String curr_message) {
		Contact my_contact = Phonebook.findContact(phonebook, contact_name);
		//Contact doesnt exist
		if (my_contact == null)
		{
			System.out.println("Unavailable contact name");
			//break;
			return;
		}
		
		//New chat 
		//if (all_chats.contains(my_contact)== false)
		if (my_contact.has_chat_get() == false)
		{
			my_contact = Phonebook.findContact(phonebook, contact_name);
			my_contact.contact_new_chat();
			System.out.println("New Private Chat with " + my_contact.GetName());
			PrivateChat new_chat = new PrivateChat(my_contact);
			System.out.println("New Message to " + my_contact.GetName());
			new_chat.addMessage(curr_message, Message.SENT);
			all_chats.add(new_chat);
			//break;
			return;
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
		chat.addMessage(curr_message, Message.SENT);
	}
}
