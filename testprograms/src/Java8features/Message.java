package Java8features;

public class Message {
	Message(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Messagable ms = Message::new;
		ms.getMessage("hi this is constructor reference ");
	}
}
