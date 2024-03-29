
import java.time.LocalDateTime;
//inherits from day
public class Meeting extends Day {
		private Contact contact;//the contact i want to meet

		// Constructors
		public Meeting(LocalDateTime date, int duration, Contact con) {
			super(date, duration);
			this.contact = con;
		}
		
		//default constructor 
		public Meeting() {
			super();
			this.contact = new Contact();
		}
		
		//copy constructor
		public Meeting(Meeting m) {
			super(m.getDate(), m.getDuration());
			this.contact = m.getContact();
		}
		
		// Getters & Setters
		public Contact getContact() {
			return this.contact;
		}
		
		public void setContact(Contact c) {
			this.contact = c;
		}
		
		public LocalDateTime getDate() {
			return super.getDate();
		}
		
		public void setDate(LocalDateTime d) {
			super.setDate(d);
		}
		
		public int getDuration() {
			return super.getDuration();
		}
		
		public void setDuration(int d) {
			super.setDuration(d); 
		}

		//printings:
	/*	public void printMeeting() {
			super.printDay();
			System.out.println(" " + this.getContact());
			
		}*/
		
		public void printDay() {
			super.printDay();
			System.out.println("contact:");
			this.getContact().PrintContact();
			System.out.println("\n");

			
		}
		
		

}
