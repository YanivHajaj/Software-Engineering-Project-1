package pack1;
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER
public class Contact{
	private String name;
	private String number;
	
	public void SetName(String name){this.name=name;}
	public void SetNumber(String number){
		try {
		    int check = Integer.parseInt(number);
		    this.number=number;
		} catch (NumberFormatException e) {
			System.out.println("An invalid number: '" + number + "' was entered. We set the number to 0000000000.");
			this.number="0000000000";
		}
	}	
	public String GetName(){return name;}
	public String GetNumber(){return number;};
	public Contact Get(){return this;};
	public void PrintContact(){System.out.println(name + ": " + number);}

}
