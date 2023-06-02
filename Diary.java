//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Diary {
    // can be 3 events in date 3/27 at 14:00 16:00 23:00 they will be at diary one after the other as three day
    private ArrayList<Day> diary;
    private LocalDateTime startDate; // the start of the month (default we start from 1 january 2023)

    public Diary() { // default constructor
        diary = new ArrayList<Day>(); // creation of ArrayList: DiaryBook
        // scan date
        startDate = LocalDateTime.of(2023, 1, 1, 0, 0); // init to 01/01/2023
    }

    // getters & setters

    public ArrayList<Day> getDiaryBook() {
        return diary;
    }

    public void setDiary(ArrayList<Day> diary) {
        this.diary = diary;
    }


	

	
	////functions:
    public void AddMeetingFromMain(Phonebook phonebook,String name,int day,int hour,int minutes,int duration) {
        // scan contact
        //int foundFlag = 0;
        Contact contact = Phonebook.findContact(phonebook.phonebook, name);
        LocalDateTime date = LocalDateTime.of(startDate.getYear(), startDate.getMonthValue(), day, hour, minutes);
        // create new meeting
        Meeting new_meet = new Meeting(date, duration, contact);
        diary.add(new_meet);
        //s.close();
    }
    
    
 // 1- add a meeting
    public void AddMeeting(Phonebook phonebook) {
        // scan contact
        //int foundFlag = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Write name of meeting contact:");
        String name = s.next();
        Contact contact = Phonebook.findContact(phonebook.phonebook, name);
        	if(contact==null)
        	{
        		System.out.println("no such contact return to main");
        		return;
        	}
        // scan date
        int day;
        do {
            System.out.println("Write day of new meeting (between 1-30):");
            day = s.nextInt();
        } while (day < 1 || day > 30);
        
        int hour;
        do {
            System.out.println("Write hour of new meeting: (between 0-23)");
            hour = s.nextInt();
        } while (hour < 0 || hour > 23);
        
        int minutes;
        do {
            System.out.println("Write minutes of new meeting: (between 0-59)");
            minutes = s.nextInt();
        } while (minutes < 0 || minutes > 59);
        
       
        LocalDateTime date = LocalDateTime.of(startDate.getYear(), startDate.getMonthValue(), day, hour, minutes);

        // scan duration   
        int duration;
        do {
            System.out.println("Write duration of new meeting: (between 1-60 minutes)");
            duration = s.nextInt();
        } while (duration < 1 || duration > 60);
        
        // create new meeting
        Meeting new_meet = new Meeting(date, duration, contact);
        diary.add(new_meet);
        
        //s.close();
    }

		
 // Add new event from main (for check only)
    public void AddEventFromMain(Phonebook phonebook, String description, int day, int hour, int minutes, int duration) {
        LocalDateTime date = LocalDateTime.of(startDate.getYear(), startDate.getMonthValue(), day, hour, minutes);
        Event new_event = new Event(date, duration, description);
        diary.add(new_event);
    }

    // Add new event
    public void AddEvent(Phonebook phonebook) {
        //int foundFlag = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Write description of event:");
        String description = s.nextLine();

        // scan date
        int day;
        do {
            System.out.println("Write day of new Event (between 1-30):");
            day = s.nextInt();
        } while (day < 1 || day > 30);
        
        int hour;
        do {
            System.out.println("Write hour of new Event: (between 0-23)");
            hour = s.nextInt();
        } while (hour < 0 || hour > 23);
        
        int minutes;
        do {
            System.out.println("Write minutes of new Event: (between 0-59)");
            minutes = s.nextInt();
        } while (minutes < 0 || minutes > 59);
        LocalDateTime date = LocalDateTime.of(startDate.getYear(), startDate.getMonthValue(), day, hour, minutes);

        // scan duration   
        int duration;
        do {
            System.out.println("Write duration of new Event: (between 1-60)");
            duration = s.nextInt();
        } while (duration < 1 || duration > 60);

        Event new_event = new Event(date, duration, description);
        diary.add(new_event);
        
        //s.close();
    }


		
 // Add immediate meeting
    public void AddImmediateDay(Day day) {
        if (!startDate.toLocalDate().isEqual(day.getDate().toLocalDate()) || day.getDate().getDayOfMonth() > 30) {
            System.out.println("Adding Failed - you are not in the diary's range");
            return;
        }

        diary.add(day);
    }

    // Remove day
    public void RemoveDay() {
        // scan day
        Scanner s = new Scanner(System.in);
        // scan date
        int day;
        do {
            System.out.println("Write day of new meeting (between 1-30):");
            day = s.nextInt();
        } while (day < 1 || day > 30);
        
        int hour;
        do {
            System.out.println("Write hour of new meeting: (between 0-23)");
            hour = s.nextInt();
        } while (hour < 0 || hour > 23);
        
        int minutes;
        do {
            System.out.println("Write minutes of new meeting: (between 0-59)");
            minutes = s.nextInt();
        } while (minutes < 0 || minutes > 59);
        LocalDateTime date = LocalDateTime.of(startDate.getYear(), startDate.getMonthValue(), day, hour, minutes);

        // search date in diary
        boolean found = false;
        for (int i = 0; i < diary.size(); i++) {
            if (date.isEqual(diary.get(i).getDate())) {
                found = true;
                diary.remove(i);
                System.out.println("The date was successfully deleted");
                break;
            }
        }

        if (!found) {
            System.out.println("No such event/meeting!");
        }
        
        
        //s.close();
    }

		
	//3
    public void PrintOneDay() {
        sort_by_date(); // sort diary

        Scanner s = new Scanner(System.in);
        System.out.println("Write day of date:");
        int day = s.nextInt();
        int month = 1; // default
        int year = 2023; // default

        LocalDateTime startDateTime = LocalDateTime.of(year, month, day, 0, 0);
        LocalDateTime endDateTime = LocalDateTime.of(year, month, day, 23, 59);

        int foundCount = 0;
        for (Day dayEntry : diary) {
            LocalDateTime entryDateTime = dayEntry.getDate();
            if (entryDateTime.isAfter(startDateTime) && entryDateTime.isBefore(endDateTime)) {
                foundCount++;
                dayEntry.printDay();
            }
        }

        if (foundCount == 0) {
            System.out.println("No such day in the diary!\n");
        }
        
        //s.close();
    }


	//4
    public void PrintOneContact(Phonebook phonebook) {
        sort_by_date(); // sort diary

        Scanner s = new Scanner(System.in);
        System.out.println("Write name of meeting contact:");
        String name = s.next();
        Contact contact = Phonebook.findContact(phonebook.phonebook, name); // we found the contact (if exists)

        // search contact in diary
        if (contact != null) {
            int flag1 = 0; // assume it wasn't found
            for (int i = 0; i < diary.size(); i++) { // a loop to find the contact
                if (diary.get(i) instanceof Meeting) {
                    Meeting m = (Meeting) diary.get(i);
                    if (m.getContact().equals(contact)) {
                        flag1 = 1; // raise flag if contact is found
                        m.printDay();
                    }
                }
            }

            if (flag1 == 0) {
                System.out.println("No meetings found for the contact.");
            }
        } else {
            System.out.println("Contact not found.");
        }
        
        //s.close();
    }

		
	//5
    public void DeleteCollidingEvents() {
        sort_by_date(); // sort diary

        for (int i = 0; i < diary.size(); i++) { // first loop
            // end of meeting/event:
            int year = diary.get(i).getDate().getYear();
            int month = diary.get(i).getDate().getMonthValue();
            int day = diary.get(i).getDate().getDayOfMonth();
            int minutes = diary.get(i).getDate().getMinute() + diary.get(i).getDuration();
            int hour=0;//check if the duration plus minutes exeed the 60 min
            if(minutes>60)
            {
                hour = diary.get(i).getDate().getHour()+1;
                minutes=minutes-60;
                if(hour>23)
                {
                	day=day+1;
                	hour=0;
                }
            }
            else
            {
            	hour = diary.get(i).getDate().getHour();
            }
            
            LocalDateTime endDate = LocalDateTime.of(year, month, day, hour, minutes);

            for (int j = i + 1; j < diary.size(); j++) { // for what comes after
                LocalDateTime thisDate = diary.get(j).getDate();
                boolean isAfter = endDate.isAfter(thisDate); // if starts during meeting
                if (isAfter) { // if starts during meeting
                	System.out.println("--- found and delete event: ---");
                	diary.get(j).printDay();
                    diary.remove(diary.get(j)); // remove
                    j = j - 1;
                }
            }
        }
    }



	// 6 print content:
	public  void PrintDiaryBook(){ // a loop to go all over the array-list and print the Days
			System.out.println("^^^^^^^^^^Diary Book^^^^^^^^^^:");
			for (int i=0; i<diary.size(); i++) {
				diary.get(i).printDay();
			}
		}
		
	//sort
	//sort diary by date
		public void sort_by_date() {
			Collections.sort(diary, Day.ContDayComparator );
		}

		public void RemoveContact(String contact) {
		    if (contact != null) {
		        //int flag1 = 0; // assume it wasn't found
		        for (int i = 0; i < diary.size(); i++) { // a loop to find the contact
		            if (diary.get(i) instanceof Meeting) {
		                Meeting m = (Meeting) diary.get(i);
		                String s = m.getContact().GetName();
		                if (s.equals(contact)) {
		                    diary.remove(diary.get(i)); // remove
		                    i = i - 1;
		                }
		            }
		        }
		    }
		}

		


}
