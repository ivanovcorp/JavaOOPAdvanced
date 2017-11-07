package Lab;

public class p04_Message {
	private p04_Importance importance;
	private String message;
	
	public p04_Message(String importance, String message) {
		this.setLevel(importance);
		this.message = message;
	}
	
	public void setLevel(String importance) {
		String level = importance.toUpperCase();
		if (!level.equals("HIGH") && !level.equals("LOW")
				&& !level.equals("NORMAL") && !level.equals("MEDIUM")) {
			throw new IllegalArgumentException("The importance of log message could be only:"
					+ " LOW, NORMAL, MEDIUM or HIGH!");
		}
		
		this.importance = p04_Importance.valueOf(p04_Importance.class, level);
	}
	
	public String getLevel() {
		return this.importance.name();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s", this.importance.name(), this.message);
	}
}
