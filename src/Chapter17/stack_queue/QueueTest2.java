package Chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {

		Queue<Message> messageQueue=new LinkedList<Message>();
		//offer : ÀÔ·Â
		messageQueue.offer(new Message("sendMail", "È«±æµ¿"));
		messageQueue.offer(new Message("sendSMS", "±èÀ¯½Å"));
		messageQueue.offer(new Message("sendKatalk", "ÀÌ¼ø½Å"));
		
		//poll : Ãâ·Â
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to+"´Ô¿¡°Ô ¸ŞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS" :
				System.out.println(message.to+"´Ô¿¡°Ô SMSÀ» º¸³À´Ï´Ù.");
				break;
			case "sendKatalk" :
				System.out.println(message.to+"´Ô¿¡°Ô Ä«ÅåÀ» º¸³À´Ï´Ù.");
				break;
			}
		}
	}

}
