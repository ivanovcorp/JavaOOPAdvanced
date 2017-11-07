package Lab;

public enum p02_Weekday {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	
	@Override
	public String toString() {		
		String result = super.name().toLowerCase().substring(1);
		return super.name().charAt(0) + result;
	}
}



