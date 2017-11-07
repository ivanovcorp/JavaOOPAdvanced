package Lab;

import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class p02_WeeklyCalendar {
	
	private List<p02_WeeklyEntry> entries;

	  public p02_WeeklyCalendar() {
		  this.entries = new ArrayList<>(); 
	  }

	  public void addEntry(String weekday, String notes) {
	    this.entries.add(new p02_WeeklyEntry(weekday, notes));
	  }

	  public Iterable<p02_WeeklyEntry> getWeeklySchedule() {
	    Collections.sort(entries, p02_WeeklyEntry.BY_WEEKDAY);
	    return this.entries;
	  }

	
	
	public static void main(String[] args) {
		p02_WeeklyCalendar calendar = new p02_WeeklyCalendar();
		calendar.addEntry("MONDAY", "Meeting with PM");
		calendar.addEntry("MONDAY", "Meeting with Girl");
		calendar.addEntry("WEDNESDAY", "Dev conference");
		calendar.addEntry("FRIDAY", "Rakiq i salata");
		
		
		System.out.println(calendar.getWeeklySchedule());
	}
	
}
