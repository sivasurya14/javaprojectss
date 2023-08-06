package dayTwoJava8;

import java.util.List;

public class MethodRefExample  {
	
	public  void findGreaterString(List<String> values) {
		
		for(String val :values) {
			if(val.length()>4) {
				System.out.println(val);
			}
		}
	}
}
