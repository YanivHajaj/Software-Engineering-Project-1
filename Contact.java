//package pack1;
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER
public class Contact{
	private String _name;
	private String _number;
	private boolean _has_chat;
	
	
	
	// Constructors
	Contact(String name, String number)
	{
		this._name = name;
		this._number = number;
		this._has_chat = false;
	}
	Contact()
	{
		this(null, null);
	}
	
	
	public void SetName(String name){this._name=name;}
	public void SetNumber(String number){
		try {
		    int check = Integer.parseInt(number);
		    this._number=number;
		} catch (NumberFormatException e) {
			System.out.println("An invalid number: '" + number + "' was entered. We set the number to 0000000000.");
			this._number="0000000000";
		}
		if (number.length() >10){
			System.out.println("The number entered is too long. We set the number to 0000000000.");
			this._number="0000000000";
		}
	}	
	public String GetName(){return _name;}
	public String GetNumber(){return _number;};
	public Contact Get(){return this;};
	public void PrintContact(){System.out.println(_name + ": " + _number);}
	public boolean has_chat_get() {return _has_chat;}
	public void contact_new_chat() {this._has_chat = true;}
	public void contact_delete_chat() {this._has_chat = false;}

}
