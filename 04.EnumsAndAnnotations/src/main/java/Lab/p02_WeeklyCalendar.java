package Lab;

import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class p02_WeeklyCalendar {
	
	public static Comparator<p02_WeeklyEntry> BY_WEEKDAY = getComparatorByWeekday();
	
	private List<p02_WeeklyEntry> entries;
	
	public p02_WeeklyCalendar() {
		this.entries = new ArrayList<>();
	}
	
	public void addEntry(String weekday, String notes) {
		p02_WeeklyEntry entry = new p02_WeeklyEntry(weekday, notes);
		this.entries.add(entry);
	}
	
	public Iterable<p02_WeeklyEntry> getWeeklySchedule() {
		
		
	}
	
	private static Comparator<p02_WeeklyEntry> getComparatorByWeekday() {
		return (e1, e2 -> Integer.compare(e1.wekday, e2.weekday));
	}
	
	
	public static void main(String[] args) {
		p02_WeeklyCalendar calendar = new p02_WeeklyCalendar();
		calendar.addEntry("MONDAY", "Meeting with PM");
		calendar.addEntry("MONDAY", "Meeting with Girl");
		calendar.addEntry("WEDNESDAY", "Dev conference");
		calendar.addEntry("FRIDAY", "Rakiq i salata");
		
		
		for (p02_WeeklyEntry entry : calendar) {
			System.out.println(entry.toString());
		}
	}
	
}
