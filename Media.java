//an abstract class which contains name and time, 
//two new classes - video and audio will extends from it   
public abstract class Media {
	protected String name;
	protected String time;
	
	// Constructors
		
	public Media(String name,String time) {
		setName(name);
		setTime(time);
	}
	
	public final void setName(String _name) {
		this.name = _name;
		
	}
	public final void setTime(String _time) {
		this.time = _time;
		
	}
	public final String getTime() {
		return time;
		
	}
	public final String getName() {
		return name;
		
	}
	
	
	@Override
	public String toString() {
		return name + " is now playing for " + time + " time";
		
	}
	
}
