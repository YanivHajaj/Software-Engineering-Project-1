
//import java.util.Date;
import java.time.LocalDateTime;

//inherits from day
public class Event extends Day {
		private String description;

		
		// Constructors
		public Event(LocalDateTime date, int duration, String descr) {
			super(date, duration);
			this.description = descr;
		}
		
		//default constructor 
		public Event() {
			super();
			this.description = null;
		}
		
		//copy constructor
		public Event(Event e) {
			super(e.getDate(), e.getDuration());
			this.description = e.getDescription();
		}
		
		// Getters & Setters
		public String getDescription() {
			return this.description;
		}
		
		
		public void setDescription(String s) {
			this.description = s;
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
		
		
		public void printEvent() {
			super.printDay();
			System.out.println(" " + this.getDescription() + "\n");
			
		}
		
		public void printDay() {
			super.printDay();
			System.out.println("description: " + this.getDescription()+ "\n \n");
		}
		
		

}
