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
		SMSApp methods:
			- searchContact: This function checks if at least one contact with the sentence was found. It prints the contact if it hase the sentence. 
			- displayAll: Print all messages from all chats
		SMSApp.PrivateChat methods:
			- Constructor: It demands to receive a Contact (and nothing else)
			- addMessage:
			- getContact:
			- toString:
			- printSpecificContacts: It prints the name of all the contacts that have the requested string sentence. 
		SMSApp.PrivateChat.Message methods:
			- GetText: Returns the string text messages that was passed from user to user.
			
	- MediaApp: The App contains 2 different types of media which both are taken as inputs by the user.
				The media is stored in a vector collection for more efficient data storage.
				Each media is an abstract class divided in to 2 of the following types: Song,Video.
			Methods:
				addMedia: adds a media of one of two types: video or song. both have time (min:sec) and name.
				playByName:takes name of media, plays it
				playAllMedia:plays all media at once (if done serially then it would take long time)	
				
				
		
	- CalendarApp:
	
		
