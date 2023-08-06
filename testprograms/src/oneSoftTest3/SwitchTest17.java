package oneSoftTest3;

public class SwitchTest17 {
	public static void main(String[] args) {

		int mon = 1;
		switch (mon) {
		case 1:
			System.out.println("jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec");
			break;
		case 2:
			System.out.println("feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec");
			break;
		case 3:
			System.out.println("mar,apr,may,jun,jul,aug,sep,oct,nov,dec");
			break;
		case 4:
			System.out.println("apr,may,jun,jul,aug,sep,oct,nov,dec");
			break;
		case 5:
			System.out.println("may,jun,jul,aug,sep,oct,nov,dec");
			break;
		case 6:
			System.out.println("jun,jul,aug,sep,oct,nov,dec");
			break;
		case 7:
			System.out.println("jul,aug,sep,oct,nov,dec");
			break;
		case 8:
			System.out.println("aug,sep,oct,nov,dec");
			break;
		case 9:
			System.out.println("sep,oct,nov,dec");
			break;
		case 10:
			System.out.println("oct,nov,dec");
			break;
		case 11:
			System.out.println("nov,dec");
			break;
		case 12:
			System.out.println("dec");
			break;
			default :
				System.out.println("invalid");
		}

	}
}