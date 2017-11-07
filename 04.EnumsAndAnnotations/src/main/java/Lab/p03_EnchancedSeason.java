package Lab;

public enum p03_EnchancedSeason {
	SPRING(20), SUMMER(40), AUTUMN(15), WINTER(-20);
	
	private int max;
	
	private p03_EnchancedSeason(int maxTemp) {
		this.max = maxTemp;
	}
	
	public int getMaxTemp() {
		return this.max;
	}
	
	@Override
	public String toString() {	
		String name = super.name().substring(1).toLowerCase();
		return super.name().charAt(0) + name;
	}
	
	public static void main(String[] args) {
		p03_EnchancedSeason season = p03_EnchancedSeason.SPRING;
		
		System.out.println(String.format("The max temperature in %s is %d.", season.toString(), season.getMaxTemp()));
	}
}
