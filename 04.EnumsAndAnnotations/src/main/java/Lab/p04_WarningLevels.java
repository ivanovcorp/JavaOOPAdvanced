package Lab;

import java.util.Scanner;

public class p04_WarningLevels {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		p04_Logger logger = new p04_Logger(sc.nextLine());
		
		String input = sc.nextLine();
		while (!input.equals("END") ) {
			String[] msgInfo = input.split(": ");
			p04_Message msg = new p04_Message(msgInfo[0], msgInfo[1]);
			logger.addMessage(msg);
			input = sc.nextLine();
		}
		
		for (p04_Message msg : logger) {
			System.out.println(msg.toString());
		}
	}
}
