//package pack1;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; //to get input from user
//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

public class Phonebook {
	
	//easier to check (similar to 1 but add from main)
	public static void addContactFromMain(ArrayList<Contact> phonebook, String name, String number) {
	    Contact newContact = new Contact();
	    newContact.SetName(name);
	    newContact.SetNumber(number);
	    phonebook.add(newContact);
	}
	
	//1)
	public static void addContactFromUser(ArrayList<Contact> phonebook) {
	    
	    System.out.print("Enter name of the contact: \n");
	    String name = input.nextLine();
	     System.out.print("Enter phone number of the contact: \n");
	    String number = input.nextLine();
	    Contact newContact = new Contact();
	    newContact.SetName(name);
	    newContact.SetNumber(number);	    
	    phonebook.add(newContact);
	}
	
	
	//2)
	public static void DeleteContact(ArrayList<Contact> phonebook) {
	  System.out.print("Enter name of the contact you wnat to delte: ");
	  String Name = input.nextLine();
	  int index=0;
	  try {
      for (Contact cont : phonebook) {
          if (cont.GetName().compareTo(Name)==0) {
              break;
          }
          index=index+1;
      }
      phonebook.remove(index);
	  }
	  catch (IndexOutOfBoundsException e) {
		  System.out.println("We weren't able to remove the contact because it wasn't on your phoneook.");
	  }
  }
	
	// 3) print all contacts in the phonebook
		public static void printAllContact(ArrayList<Contact> phonebook) {
			System.out.println("~~~all contacts in the phone book: ~~~");
			for (Contact contact : phonebook) {
				contact.PrintContact();
			}
			System.out.println("~~~all contacts in the phone book done ~~~");
		}
	
	//4)
	public static ArrayList<Contact> findNameOccurrences(ArrayList<Contact> phonebook) {
	    ArrayList<Contact> AllOccurrences = new ArrayList<Contact>();
	    System.out.print("Enter a name to search:  ");
	    String name = input.nextLine();  
	    for (Contact contact : phonebook) {
	        if (contact.GetName().equals(name)) {
	        	 AllOccurrences.add(contact);
	        	 contact.PrintContact(); //we weren't sure if you wanted to return simply the occurences or the information to the user
	        	 //if we wants only to return and not print to the user we can simply take out the contact.PrintContact(); line
	        }
	    }
	    return AllOccurrences;
	}
	
	
	//delete duplicates (7)
	//if there is more than one copy leave only one
	public static void deleteDuplicatenew(ArrayList<Contact> phonebook) {
			for (int i = 0; i<phonebook.size(); i++) {//overall n loops
				for (int j=0; j<phonebook.size(); j++) { //in each loop going n checks
					if (i!=j) {
						if (phonebook.get(j).GetName().compareTo(phonebook.get(i).GetName()) == 0) {//and we have the same name
							if (phonebook.get(j).GetNumber().compareTo(phonebook.get(i).GetNumber()) == 0) {//and we have the same number
									phonebook.remove(i);
									
								}
							}
						}
					}
				}	
			}


		
	
	
	static Scanner input = new Scanner(System.in); //Create a Scanner object
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Contact> phonebook = new ArrayList<Contact>();
		 
		boolean exit = false;

		
		// add some contacts to the phonebook (can be deleted)
		addContactFromMain(phonebook, "moahe", "1111234");
		addContactFromMain(phonebook, "david", "2225678");
		addContactFromMain(phonebook, "shlomo", "4443333");
		addContactFromMain(phonebook, "avraham", "3331234");
		addContactFromMain(phonebook, "shlomo", "4441111");
		addContactFromMain(phonebook, "shlomo", "4442222");
		addContactFromMain(phonebook, "shlomo", "4443333");
		addContactFromMain(phonebook, "shlomo", "4443333"); 
		addContactFromMain(phonebook, "shlomo", "4443333");
		
		while (!exit) {
			System.out.println("Type the number of one of the following instructions to excute it:");
			System.out.println("1) Add contact");
			System.out.println("2) Delete contact");
			System.out.println("3) Display all contacts");
			System.out.println("4) Search contact by name (return ArrayList that contains the occurrences)");
			System.out.println("5) Sort all contacts by name");
			System.out.println("6) Sort all contacts by number");
			System.out.println("7) Delete duplicates");
			System.out.println("8) Reverse the order of the phonebook");
			System.out.println("9) Save phonebook as a text file");
			System.out.println("10) Load contacts from a text file");
			System.out.println("11) Exit the program");
			String Num = input.next();
			switch (Num) {
			case "1":
				addContactFromUser(phonebook);
				break;
			case "2":	
				DeleteContact(phonebook);
				break;
			case "3":
				printAllContact(phonebook);
				break;
			case "4":
				findNameOccurrences(phonebook);	
				break;
			case "5":
				sortListByName(phonebook);
				break;
			case "6":
				sortListByNumber(phonebook);
				break;
			case "7":
				deleteDuplicatenew(phonebook);
				break;
			case "8":
				reverseOrder(phonebook);
				System.out.println("The order was reversed.");
				break;
			case "9":
				saveToTextFile(phonebook);
				break;
			case "10":
				addFromFile(phonebook);
				break;
			case "11":
				System.out.println("Exiting. We will not take a new input");
				exit= true;
				break;
			default:
				System.out.println("Unavialable");
				break;
			}
		}
	}
	
	//reverse the order (8)
	public static void reverseOrder(ArrayList<Contact> phonebook) {   
        if (phonebook == null ) {
        	System.out.println("Couldn't reverse the order - there are no contacts in list"); 
        	return;
        }
        else if ( phonebook.size() <= 1){
        	return;
        }
        else {
        Contact personInList = phonebook.remove(0); //remove the first contact in the list
        reverseOrder(phonebook);// call the function again
        phonebook.add(personInList);//add the removed elements in reverse order
        }
	}
	
	
//sort 5 (by name from small to big)
	public static void sortListByName(ArrayList<Contact> phonebook) {
		int n = phonebook.size();
		Contact temp;
		//using bubble sort
		for (int i = 0; i<n; i++) {//overall n loops
			for (int j=1; j<(n-i); j++) { //in each loop going n-i-1 checks
				 if (phonebook.get(j-1).GetName().compareTo(phonebook.get(j).GetName()) > 0) {
					 //if the element to the left is bigger than the element to the right switch them
					 temp = phonebook.get(j-1);
					 phonebook.set((j-1),phonebook.get(j));
					 phonebook.set(j,temp);
				 }
			}
		}
	}
	
	//sort 6 (by number from big to small)
	public static void sortListByNumber(ArrayList<Contact> phonebook) {
		int n = phonebook.size();
		Contact temp;
		for (int i = 0; i<n; i++) {
			for (int j=1; j<(n-i); j++) {
				 if (phonebook.get(j).GetNumber().compareTo(phonebook.get(j-1).GetNumber()) > 0) {
					 temp = phonebook.get(j-1);
					 phonebook.set((j-1),phonebook.get(j));
					 phonebook.set(j,temp);
				 }
			}
		}
	}
	
	//nine 
	public static void saveToTextFile(ArrayList<Contact> phonebook) {
			
			String filename ;
			System.out.println("Enter file name for all contacts to be saves: ");
			filename = input.next();
			filename = filename + ".txt";
			
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
				for (int i = 0; i < phonebook.size(); i++) {
					writer.write(phonebook.get(i).GetName()+ ": " + phonebook.get(i).GetNumber()+"\n");
				}
				
				//writer.write("writing to file");
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
	
	
	
	//ten
	public static void addFromFile(ArrayList<Contact> phonebook) {
			String filename;
			System.out.println("Enter file name for contacts to be loaded from: ");
			filename = input.next();
			filename = filename +".txt";
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				String line;
				Contact bufferContact;
				
				while((line = reader.readLine())!=null) {
					//read a contact and insert to a new contact instance
					bufferContact = new Contact();
					String[] data = line.split(": "); 
					bufferContact.SetName(data[0]);
					bufferContact.SetNumber(data[1]);
					//now the buffercontact is set and ready to be entered to the arraylist
					phonebook.add(bufferContact);
					
				}
				
				reader.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}