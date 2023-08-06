package dayTwoJava8;

import java.util.Arrays;
import java.util.List;

public class UseMEthodRef {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("ball", "sun", "laptop");
		
	    MethodRefExample ms = new MethodRefExample();
	    FindGreaterString fw =ms::findGreaterString;
        fw.findGreaterString(list);
	    
//		FindGreaterString ms = new MethodRefExample()::findGreaterString;
//		ms.findGreaterString(list);
	}

}
