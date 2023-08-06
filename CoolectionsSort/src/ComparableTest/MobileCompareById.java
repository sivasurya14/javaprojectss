package ComparableTest;

import java.util.Comparator;

public class MobileCompareById implements Comparator <Mobile>{
	
  public int compare(Mobile s1, Mobile s2 ) {
	  return  s1.getPrice().compareTo(s2.getPrice());
	 
 }

}
