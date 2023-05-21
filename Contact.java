
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

public class Contact{
	private String name;
	private String number;
	
	public void SetName(String name){this.name=name;}
	public void SetNumber(String number){this.number=number;}
	public String GetName(){return name;}
	public String GetNumber(){return number;};
	public void PrintContact(){System.out.println(name + ": " + number);}

}