import java.util.Scanner;

public class GitTest2 {
		static int coke = 25;
		static int peppsi = 35;
		static int soda = 45;
		void coke(int scan) {
			int temp = 0, temp2 = 0, temp3 = 0;
			while (true) {
				System.out.print(" you chooose coke : enter the amount ");
				Scanner scan1 = new Scanner(System.in);
				int amnt = scan1.nextInt();
				if (amnt >= 25) {
					temp3 = amnt - 25;
					System.out.println("take it " + temp3 + " is your balance ");
					System.out.println("thank you !!!");
					break;
				} else if (amnt < 25) {
					temp = temp + amnt;
					temp2 = 25 - temp;
					if (temp >= 25) {
						temp2 = temp - 25;
						System.out.println("take it  your balance amount is " + temp2);
						System.out.println("thank you !!!");
						break;
					} else
						System.out.println("invalid amount " + temp2 + " more amount need.!!!");
				}
			}
		}

		void peppsi(int scan) {
			int temp = 0, temp2 = 0, temp3 = 0;
			while (true) {
				System.out.print(" you choose peppsi : enter the amount ");
				Scanner scan1 = new Scanner(System.in);
				int amnt = scan1.nextInt();
				if (amnt >= 35) {
					temp3 = amnt - 35;
					System.out.println("take peppsi " + temp3 + " is your balance ");
					System.out.println("thank you !!! ");
					break;
				} else if (amnt < 35) {
					temp = temp + amnt;
					temp2 = 35 - temp;
					if (temp >= 35) {
						temp2 = temp - 35;
						System.out.println("take peppsi   your balance amount is " + temp2);
						System.out.println("thank you !!!!");
						break;
					} else
						System.out.println("invalid amount " + temp2 + " more amount need.!!!");
				}
			}
		}
		void soda(int scan) {
			int temp = 0, temp2 = 0, temp3 = 0;
			while (true) {
				System.out.print(" you choose soda : enter the amount ");
				Scanner scan1 = new Scanner(System.in);
				int amnt = scan1.nextInt();
				if (amnt >= 45) {
					temp3 = amnt - 45;
					System.out.println("take soda " + temp3 + " is your balance ");
					System.out.println("thankyou !!!");
					break;
				} else if (amnt < 45) {
					temp = temp + amnt;
					temp2 = 45 - temp;
					if (temp >= 45) {
						temp2 = 45 - temp;
						System.out.println("take soda your balance amount is " + temp2);
						System.out.println("thank you !!!");
						break;
					} else
						System.out.println("invalid amount " + temp2 + " more amount need.!!!");
				}
			}
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter what you want coke is 25RS | peppsi is 35RS |soda is 45RS");
			System.out.println("this machine only accept 5,10,20,100");
			System.out.print("press 1 for coke|press 2 for peppsi|press 3 for soda  enter here >>>");
			int sc1 = scan.nextInt();
			GitTest2 co = new GitTest2();
			if (sc1 == 1)
				co.coke(sc1);
			if (sc1 == 2)
				co.peppsi(sc1);
			if (sc1 == 3)
				co.soda(sc1);
		}
	}

	
	
	
	
	
	


