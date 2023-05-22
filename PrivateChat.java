
import java.util.ArrayList;

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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
