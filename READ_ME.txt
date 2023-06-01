//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

READ ME:

	This project makes some apps for a simple phone:
	
	
	- Phonebook: This is where you can manage your contacts,
				 it contains an ArrayList of Contacts(name, phone).
		Phonebook methods:
			- Constructor :
			- addContactFromMain : 
			- addContactFromUser :
			- DeleteContact :
			- printAllContact :
			- findNameOccurrences :
			- findContact : This was changed to return the first contact with the searched name (this was a needed change for the sms app)
			- deleteDuplicatenew :
			- reverseOrder :
			- sortListByName :
			- sortListByNumber :
			- saveToTextFile :
			- addFromFile : 
	
	
	- SMSApp: This is where you can manage your sms app, 
			  it contains an ArrayList of PrivateChat, 
			  which contains a Contact and an ArrayList of Messages(message, initator).
			  To make things more interesting, we also add the option to receive a message from an existing Contact
		SMSApp.PrivateChat methods:
			- Constructor: It demands to receive a Contact (and nothing else)
			- addMessage:
			- getContact:
			- toString:
			- printSpecificContacts: It prints the name of all the contacts that have the requested sentence. 
			
	- MediaApp:
	
	- CalendarApp:
	
		
