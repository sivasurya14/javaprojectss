package ComparableTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mobile1 {
	public static void main(String[] args) {
		List<Mobile> li = new ArrayList<>();
		Mobile c = new Mobile(25000, "vivo ", "blue");
		li.add(new Mobile(15000, "nokia", "red"));
		li.add(new Mobile(22000, "mi", "red"));
		li.add(new Mobile(13300, "oppo", "blue"));
		li.add(new Mobile(14000, "samsung", "white"));
		li.add(c);
		
		System.out.println(li);
		li.forEach(a->System.out.println(a));
       System.out.println("#####Compare by price ####");
          Collections.sort(li,new MobileCompareById());	
         for(Mobile st :li) {
        	 System.out.println(st.getPrice()+" "+st.getModel()+" "+st.getModel());
         }
          
          
         li.forEach(a->System.out.println(a));
         System.out.println("##### Compare by model ");
         Collections.sort(li, new CompareByModel());
         li.forEach(b->System.out.println(b));
          
		
		
	}
      
	
}
