package arrayofOBJ;

public class UseNovel {
	public static void main(String[] args) {
		Novel[] sd = new Novel[5];
		sd[0] = new Novel(1, "author9", "title", 230, 100);
		sd[1] = new Novel(1, "author", "title", 230, 100);
		sd[2] = new Novel(1, "author", "title", 230, 100);
		sd[3] = new Novel(1, "author", "title", 230, 100);
		sd[4] = new Novel(1, "author", "title", 231, 100);
		
		System.out.println(sd[0]);
		int temp = 0;
		boolean istrue = false;
		int count = 0;
		int length = sd.length;
		for(Novel val :sd) {
			temp += val.getPrice();
		}
		System.out.println("Total amount is "+temp);
	   	for (Novel ss : sd) {		
	   if (ss.getAuthor().equalsIgnoreCase(sd[0].author)|ss.getAuthor().matches(".*[0-9].*")){
		count++;
		}
		}		
		if(count == length)	
			System.out.println("same author");
		else
			System.out.println("different author");
		for (Novel ss :sd) {
			System.out.println(ss);
			
		}
	}
}