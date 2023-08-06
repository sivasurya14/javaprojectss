package ComparableTest;

import java.util.Comparator;

public class CompareByModel implements Comparator<Mobile> {
	public int compare(Mobile s1 ,Mobile s2) {
		
		return s1.getModel().compareTo(s2.getModel());
		
		
	}

	
	
}
