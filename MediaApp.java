import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class MediaApp {
	//all media is in a vector array so we can extend it to more media later dynamically
	Vector<Media> mediaArray = new Vector<>();
	
	//function is used later to check if time is of min:sec format private so no outside access
	private boolean validateTime(String time) {
		String[] parts = time.split(":");
	    if (parts.length != 2) {
	        return false;
	    }

	    try {
	        int minutes = Integer.parseInt(parts[0]);
	        int seconds = Integer.parseInt(parts[1]);

	        // Check range of min and sec
	        if (seconds >= 60 || minutes < 0 || seconds < 0) {
	            return false;
	        }
	    } catch (NumberFormatException e) {
	        return false;
	    }

	    return true;
	}
	
	//playing all the medias from the vector MediArray
	public void playAllMedia() {
		for (int i = 0; i < mediaArray.size(); i++) {
			System.out.println(mediaArray.get(i));
		}
	}
	
	//play a specific media after asking for name.  
	public void playByName() {
		System.out.print("enter media name to play \n");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int flag = 0;
		//search one by one in vector of media
		for (int i = 0; i < mediaArray.size(); i++) {
			if(mediaArray.get(i).getName().compareTo(name)==0) {
				System.out.println(mediaArray.get(i));
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("not found");
		}
	}
	
	//another use for play by name but with name as an argument. 
	public void playByName(String name) {
		int flag = 0;
		//search one by one in vector of media
		for (int i = 0; i < mediaArray.size(); i++) {
			if(mediaArray.get(i).getName().compareTo(name)==0) {
				System.out.println(mediaArray.get(i));
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("not found");
		}
	}
	
	//get strings from the user, name and time and create a new media. 
	public void addMedia() {
		Scanner input = new Scanner(System.in);
		System.out.print("enter 1 for song 2 for Video \n");
		//create audio or video depends on users choice
		try {
			int Num2 = input.nextInt();
			
			if(Num2 == 1) {
				//Audio case
				String name;
				String time;
				System.out.print("enter name\n");
				name = input.next();
				System.out.print("enter time (min:seconds)\n");
				time = input.next();
				if (validateTime(time)) {//check if valid format
					Audio a1 = new Audio(name, time);
					mediaArray.add(a1);
                } else {
                    System.out.println("Invalid format");
                }
				
				
			}	else if(Num2 == 2) {
				//Video case
				String name;
				String time;
				System.out.print("enter name \n");
				name = input.next();
				System.out.print("enter time \n");
				time = input.next();
				if (validateTime(time)) {//check if valid format
					Video a1 = new Video(name, time);
					mediaArray.add(a1);
                } else {
                    System.out.println("Invalid format");
                    return;
                }
				
				
			}	else {
				//bye bye case
				System.out.print("input not correct try again\n");
				
			}
			
		}
		
		catch(InputMismatchException e){
			System.out.print("input not correct try again\n");
		}
	}
	
	public void addMedia(Media m1) {
		if (validateTime(m1.time)) {//check if valid format
			mediaArray.add(m1);
        } else {
            System.out.println("Invalid format");
        }

	}
	
	public void Testfunc() {
		System.out.print(mediaArray);
		
	}
	//void addMedia(){}
}
