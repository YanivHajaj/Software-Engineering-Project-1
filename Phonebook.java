import java.util.ArrayList;

//include Contact;
public class Phonebook {
	
	// print all contacts in the phonebook
	public static void printAllContact(ArrayList<Contact> phonebook) {
		System.out.println("~~~all contacts in the phone book: ~~~");
		for (Contact contact : phonebook) {
			contact.PrintContact();
		}
		System.out.println("~~~all contacts in the phone book: ~~~");
	}
	public static void DeleteContact(ArrayList<Contact> phonebook,String Name) {
        int index=0;
        for (Contact cont : phonebook) {
            if (cont.GetName().compareTo(Name)==0) {
                break;
            }
            index=index+1;
        }
        phonebook.remove(index);
    }
	
	public static void FindContact(ArrayList<Contact> phonebook,String Name) {
		System.out.println("~~~contact with name: "+ Name+" in the phonebook: ~~~"); 
		for (Contact cont : phonebook) {
	            if (cont.GetName().equals(Name)) {
	            	cont.PrintContact();
	            }
	        }
		 System.out.println("~~~contact inside phonebook with name: "+ Name+" : ~~~");
	}
	
	public static void deleteDuplicateNames(ArrayList<Contact> phonebook) {
	    ArrayList<String> uniqueNames = new ArrayList<String>();
	    ArrayList<Contact> contactsToDelete = new ArrayList<Contact>();
	    for (Contact cont : phonebook) {
	        if (uniqueNames.contains(cont.GetName())) {
	            contactsToDelete.add(cont);
	        } else { 
	            uniqueNames.add(cont.GetName());
	        }
	    }
	    for (Contact cont : contactsToDelete) {
	        DeleteContact(phonebook,cont.GetName());
	    }
	}
	
    
	public static void main(String[] args) {
		ArrayList<Contact> phonebook = new ArrayList<Contact>();

		// add some contacts to the phonebook
		Contact contact1 = new Contact();
		contact1.SetName("moahe");
		contact1.SetNumber("111-1234");
		phonebook.add(contact1);
		
		Contact contact2 = new Contact();
		contact2.SetName("samy");
		contact2.SetNumber("222-5678");
		phonebook.add(contact2);
				
		Contact contact3 = new Contact();
		contact3.SetName("avraham");
		contact3.SetNumber("333-1234");
		phonebook.add(contact3);
		
		Contact contact4 = new Contact();
		contact4.SetName("shlomo");
		contact4.SetNumber("444-1111");
		phonebook.add(contact4);
		
		Contact contact5 = new Contact();
		contact5.SetName("shlomo");
		contact5.SetNumber("444-2222");
		phonebook.add(contact5);
		
		Contact contact6 = new Contact();
		contact6.SetName("shlomo");
		contact6.SetNumber("444-3333");
		phonebook.add(contact6);
		
		String cont2Name=contact2.GetName();
		DeleteContact(phonebook,cont2Name); //delete moshe
		FindContact(phonebook,"shlomo");
		deleteDuplicateNames(phonebook);
		printAllContact(phonebook);

	}
	
}