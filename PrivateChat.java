
import java.util.ArrayList;
import java.util.Iterator;

public class PrivateChat 
{
	Contact _contact;
	ArrayList<Message> _chat;
	
	//Constructors
	PrivateChat(Contact contact) // be careful, changes on the Contact will also change the chat (intended this way)
	{
		this._contact = contact;
		this._chat = new ArrayList<Message>();
	}
	
	public void addMessage(Message message)
	{
		this._chat.add(message);
	}
	

	public void addMessage(String message, boolean initator)
	{
		this._chat.add(new Message(message, initator));
	}
	
	public String getContact()
	{
		return this._contact.GetName();
	}
	
	@Override
	public String toString() { // prints all the message from the contact
		String str = "Contact: ";
		str += this.getContact() + "\n";
		
		for (Iterator iterator = _chat.iterator(); iterator.hasNext();) 
		{
			str += iterator.next().toString();
		}
		return str;
	}
	
	public boolean getMesseges(String sentence){
		boolean found =false;
		for(Message msg:_chat) {
    		if (msg.GetText().contains(sentence)) {
    			System.out.println(_contact.GetName());
    			found =true;
    			break;
			}
		}
		return found;
	}
}
