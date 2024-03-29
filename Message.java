
public class Message 
{
	public static final boolean SENT = true;
	public static final boolean RECEIVED = false;

	String _message;
	boolean _initiator;
	
	Message()
	{
		this("No Message", SENT);
	}
	Message(String message, boolean initiator)
	{
		this._message = message;
		this._initiator = initiator;
	}
	public String GetText(){return _message;}
	
	@Override
	public String toString() 
	{
		String str = "";
		if (this._initiator)
		{
			str += "Sent: ";
		}
		else
		{
			str += "Received: ";
		}
		return str + this._message + "\n";
	}
}
