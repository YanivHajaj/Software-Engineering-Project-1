
public class TestMobilePhone {
	public static void main(String[] args) {
		Main testPhone = new Main();
	// add some contacts to the phonebook (can be deleted)
		testPhone.my_phonebook.printAllContact(testPhone.my_phonebook.phonebook);
		testPhone.my_phonebook.addContactFromMain(testPhone.my_phonebook.phonebook, "moshe", "1111234");
		testPhone.my_phonebook.addContactFromMain(testPhone.my_phonebook.phonebook, "david", "2225678");
		testPhone.my_phonebook.addContactFromMain(testPhone.my_phonebook.phonebook, "shlomo", "4443333");
		testPhone.my_phonebook.addContactFromMain(testPhone.my_phonebook.phonebook, "avraham", "3331234");
			
			
			// add some Event/Meeting to the Diary (can be deleted)
		testPhone.my_diary.AddEventFromMain(testPhone.my_phonebook, "event num 1", 2, 20, 30, 0);
		testPhone.my_diary.AddEventFromMain(testPhone.my_phonebook, "event num 3", 2, 3, 30, 0);
		testPhone.my_diary.AddEventFromMain(testPhone.my_phonebook, "event num 4", 2, 4, 30, 0);
		testPhone.my_diary.AddEventFromMain(testPhone.my_phonebook, "event num 5", 2, 5, 30, 0);		
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "David",5,7,56,57);
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "Shlomo",8,7,56,57);
			//my_diary.AddMeetingFromMain(my_phonebook, "David",2,2,65,57);//Error day 8
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "David",2,2,32,57);		
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "David",3,4,35,56);
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "Shlomo",4,5,33,53);
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "David",1,1,48,27);
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "David",1,1,53,53);
		testPhone.my_diary.AddMeetingFromMain(testPhone.my_phonebook, "David",1,1,53,57);
		
		//phone book test
		//testPhone.main_sms(testPhone.my_phonebook.phonebook, testPhone.chats.all_chats);
		//testPhone.my_phonebook.addContactFromUser(testPhone.my_phonebook.phonebook);
		testPhone.my_phonebook.addContactFromUser(testPhone.my_phonebook.phonebook,"Batman", "0586667777");
		System.out.print("\n");
		testPhone.my_phonebook.addContactFromUser(testPhone.my_phonebook.phonebook,"Superman", "0586667777");
		System.out.print("\n");
		testPhone.my_phonebook.addContactFromUser(testPhone.my_phonebook.phonebook,"Batman", "0581117777");
		System.out.print("\n");
		testPhone.my_phonebook.addContactFromUser(testPhone.my_phonebook.phonebook,"Flash", "058199997777777");
		System.out.print("\n");
		testPhone.my_phonebook.DeleteContact(testPhone.my_phonebook.phonebook, testPhone.chats.all_chats, testPhone.my_diary);
		System.out.print("\n");
		testPhone.my_phonebook.DeleteContact(testPhone.my_phonebook.phonebook, testPhone.chats.all_chats, testPhone.my_diary);
		System.out.print("\n");
		
		testPhone.my_phonebook.printAllContact(testPhone.my_phonebook.phonebook);
		System.out.print("\n");
		testPhone.my_phonebook.findNameOccurrences(testPhone.my_phonebook.phonebook);
		System.out.print("\n");
		testPhone.my_phonebook.sortListByName(testPhone.my_phonebook.phonebook);
		testPhone.my_phonebook.printAllContact(testPhone.my_phonebook.phonebook);
		System.out.print("\n");
		testPhone.my_phonebook.sortListByNumber(testPhone.my_phonebook.phonebook);
		testPhone.my_phonebook.printAllContact(testPhone.my_phonebook.phonebook);
		System.out.print("\n");
		testPhone.my_phonebook.reverseOrder(testPhone.my_phonebook.phonebook);
		testPhone.my_phonebook.printAllContact(testPhone.my_phonebook.phonebook);
		System.out.print("\n");
		testPhone.my_phonebook.saveToTextFile(testPhone.my_phonebook.phonebook);
		System.out.print("\n");
		testPhone.my_phonebook.addFromFile(testPhone.my_phonebook.phonebook);
		System.out.print("\n");

		//SMS test
		//Contact my_contact = testPhone.my_phonebook.findContact(testPhone.my_phonebook.phonebook, "Batman");
		System.out.print("<<<<<<<<<<<<<<<<<Testing SMS>>>>>>>>>>>>>>>>>");
		System.out.print("<<<<<<<<<<<<<<<<<Testing SMS>>>>>>>>>>>>>>>>>");
		//Testing case 1:
		System.out.print("\n");
		testPhone.chats.addNewMessege(testPhone.my_phonebook.phonebook,testPhone.my_phonebook,"Batman","You are my hero!");
		System.out.print("\n");
		testPhone.chats.addNewMessege(testPhone.my_phonebook.phonebook,testPhone.my_phonebook,"Robin","You are batman's son?");
		System.out.print("\n");
		testPhone.chats.addNewMessege(testPhone.my_phonebook.phonebook,testPhone.my_phonebook,"Batman","Thanks for saving me");
		System.out.print("\n");
		testPhone.chats.addNewMessege(testPhone.my_phonebook.phonebook,testPhone.my_phonebook,"Superman","You give me hope.");
		System.out.print("\n");



		//Testing case 3:
		PrivateChat cont2del = null;
		for (PrivateChat curr_privateChat : testPhone.chats.all_chats)
			{
				if (curr_privateChat.getContact().equals("Batman"))
				{
					cont2del = curr_privateChat;
					break;
				}
			}
		testPhone.chats.all_chats.remove(cont2del);
		System.out.print("\n");
		



		//Testing case 4:
		System.out.print("\n");
		PrivateChat chat2print = null;
		for (PrivateChat curr_privateChat : testPhone.chats.all_chats)
			{
				if (curr_privateChat.getContact().equals("Superman"))
				{
					chat2print = curr_privateChat;
					break;
				}
			}
		System.out.println(chat2print);
		System.out.print("\n");



		//Testing case 5:
		System.out.print("The word 'You' was used in the chats with: ");
		System.out.print("\n");
		testPhone.chats.searchContact("You");
		System.out.print("\n");
		System.out.print("The word 'give' was used in the chats with: ");
		System.out.print("\n");
		//Testing case 6:
		testPhone.chats.searchContact("give");
		System.out.print("\n");
		testPhone.chats.displayAll();
		
		
		//Media tests
		System.out.println("<<<<<<<<<<<<<<<<<Testing Media>>>>>>>>>>>>>>>>>");
		//MediaApp m1 = new MediaApp(); // Init MediaApp

		Video v1 = new Video("movie1","5:30");
		Audio a1 = new Audio("song1","1:20");
		Audio a2 = new Audio("song2","10:15");

		testPhone.m1.addMedia(v1);
		testPhone.m1.addMedia(a1);
		testPhone.m1.addMedia(a2);
		testPhone.m1.playByName("song1");
		testPhone.m1.playAllMedia();

		//Fill here more tests
		
	}
}
