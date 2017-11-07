package Lab;

public class p02_WeeklyEntry {
	
	private p02_Weekday weekday;
	private String notes;
	
	public p02_WeeklyEntry(String weekday, String notes) {
		this.weekday = p02_Weekday.valueOf(p02_Weekday.class, weekday);
		this.notes = notes;
	}
	
	@Override
	public String toString() {		
		return String.format("%s - %s", this.weekday, this.notes);
	}
}
