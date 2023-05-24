import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class MediaApp {
	//arr media = [media_songs, media_video]
	//Media a1 = new Audio("abc", "7");
	
	Vector<Media> mediaArray = new Vector<>();
	public void playAllMedia() {
		for (int i = 0; i < mediaArray.size(); i++) {
			System.out.println(mediaArray.get(i));
		}
	}
	public void playByName() {
		System.out.print("enter media name to play");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int flag = 0;
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
	public void addMedia() {
		Scanner input = new Scanner(System.in);
		System.out.print("enter 1 for song 2 for Video");
		int Num2 = input.nextInt();
		//System.out.println(Num2);
		//System.out.println(Num2.getClass());
		//System.out.println("1".getClass());
		
		if(Num2 == 1) {
			//Audio case
			String name;
			String time;
			System.out.print("enter name");
			name = input.next();
			System.out.print("enter time");
			time = input.next();
		
			Audio a1 = new Audio(name, time);
			mediaArray.add(a1);
			
		}	else if(Num2 == 2) {
			//Video case
			//Audio case
			String name;
			String time;
			System.out.print("enter name");
			name = input.next();
			System.out.print("enter time");
			time = input.next();
		
			Video a1 = new Video(name, time);
			mediaArray.add(a1);
			
		}	else {
			//bye bye case
			
		}
		
	}
	public void Testfunc() {
		System.out.print(mediaArray);
		
	}
	//void addMedia(){}
}
