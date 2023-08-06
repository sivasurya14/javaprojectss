package testprogramss;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List <Integer>l1=new ArrayList<Integer>();
		String a = "11,22,33,44";
	    String[] ab = a.split(",");
		for (String ss:ab) {
			int num=Integer.parseInt(ss);
			l1.add(num);
			}
		l1.forEach(tt->{
			if (tt % 2 == 0)
				System.out.print(tt +"-EVEN"+" ");
			else
				System.out.print(tt +"-ODD"+" ");
		
		});
			

	}

}
