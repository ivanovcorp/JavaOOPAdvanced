package Lab;

import java.util.Comparator;

public class p02_WeeklyEntry {
	public final static Comparator<p02_WeeklyEntry> BY_WEEKDAY = getCompByDay();

	private p02_Weekday weekday; 
	private String notes;

	public p02_WeeklyEntry(String weekday, String notes) {
		this.weekday = Enum.valueOf(p02_Weekday.class, weekday.toUpperCase());
	    this.notes = notes;
	}

	@Override
	public String toString() { 
		return String.format("%s - %s", this.weekday, this.notes);
	}

	private static Comparator<p02_WeeklyEntry> getCompByDay() {
	    return (e1, e2) -> e1.weekday.compareTo(e2.weekday);
	}

}
