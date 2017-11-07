package Lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p04_Logger implements Iterable<p04_Message> {
	private List<p04_Message> messages;
	private p04_Importance logLevel;
	
	public p04_Logger(String logLevel) {
		this.messages = new ArrayList<>();
		this.logLevel = p04_Importance.valueOf(p04_Importance.class, logLevel.toUpperCase());
	}
	
	public void addMessage(p04_Message message) {
		System.out.println(message.getLevel().compareTo(this.logLevel.name()));
		if (message.getLevel().compareTo(this.logLevel.name()) >= 0) {
			this.messages.add(message);
		}
	}

	@Override
	public Iterator<p04_Message> iterator() {
		return new MessageIterator();
	}
	
	private final class MessageIterator implements Iterator<p04_Message> {
		
		private int index;
		
		public MessageIterator() {
			this.index = 0;
		}

		@Override
		public boolean hasNext() {
			return this.index < messages.size();
		}

		@Override
		public p04_Message next() {
			return messages.get(index++);
		}
	}
}
