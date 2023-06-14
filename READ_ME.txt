//GROUP 13: SAMY, SHAIEL, YANIV, ILYA, ORI, TOMER

READ ME:

	This project makes some apps for a simple phone:
	
	
	- Phonebook: This is where you can manage your contacts,
				 it contains an ArrayList of Contacts(name, phone).
		Phonebook methods:
			- Constructor :
			- addContactFromMain : 
			- addContactFromUser :
			- DeleteContact : Deletes the Contact and all the chat with it
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
			- addMessage: adds message to chat
			- getContact: find contact of the chat
			- toString: return the string equivalent of the chat
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
				
				
		
	- CalendarApp (Diary):	
		The Diary class represents a calendar or diary functionality. It manages a collection of events and meetings, stored in an ArrayList of Day objects.
		The diary keeps track of dates and allows the user to add, remove, and display events and meetings.	
		Constructor:
		Diary(): Initializes a new instance of the Diary class. It creates an empty ArrayList to store the diary entries and sets the start date to January 1, 2023, by default.
		Attributes:
			ArrayList that holds the days of the diary, day can be either events or meetings.
			startDate: A LocalDateTime object representing the start date of the diary. By default, it is set to January 1, 2023.
		Methods:				
			AddMeeting(Phonebook phonebook) //Allows the user to add a meeting, enter the name of the meeting contact date, time, and duration,to add the meeting to the diary.		
			AddMeetingFromMain(Phonebook phonebook, String name, int day, int hour, int minutes, int duration) //same as above (for our check)
			AddEvent(Phonebook phonebook)// similar to AddMeeting ,Adds an event to the diary
			AddEventFromMain(Phonebook phonebook, String description, int day, int hour, int minutes, int duration) //same as above (for our check)			
			PrintOneDay() //Allows the user to print all the events and meetings for a specific day.
			PrintOneContact(Phonebook phonebook) //Allows the user to print all the meetings for a specific contact.
			DeleteCollidingEvents()//Removes any events or meetings that collide with each other in the diary. 
			PrintDiaryBook() // Prints all the events and meetings in the diary.
			
			*note that The Day class is an abstract class that serves as a base class for both Event and Meeting. 
			It contains common properties and methods related to a day, such as date and duration.