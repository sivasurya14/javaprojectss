package agecalculator;

import java.util.Random;
import java.util.Scanner;

public class StonepaperScissor {
	public static void main(String[] args) {
		String computer[] = { "stone", "papper", "scissor" };
		Random rand = new Random();
		int randomchoices = rand.nextInt(computer.length);

		System.out.println("Welcome to the Game enter stone ,papper, scissors ");

		Scanner scan = new Scanner(System.in);

		String player = scan.nextLine();

		if (player.equals(computer[randomchoices]))
			System.out.println("Tie");

		else if (player == "rock" && computer[randomchoices] == "papper") {

			System.out.println("you loose " + computer + " covers" + player);

		} else if (player == "rock" && computer[randomchoices] == "scissor") {

			System.out.println("you win " + player + " covers" + computer);
		} else if (player == "papper" && computer[randomchoices] == "scissor") {

			System.out.println("you loose " + computer + " covers" + player);
		} else if (player == "papper" && computer[randomchoices] == "stone") {

			System.out.println("you loose " + computer + " covers" + player);
		} else if (player == "stone" && computer[randomchoices] == "papper") {

			
			System.out.println("you loose " + computer + " covers" + player);
		}
	}
}