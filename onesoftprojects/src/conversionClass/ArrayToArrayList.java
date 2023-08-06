package conversionClass;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {

		String[] brand = { "vivo", "redmi", "samsung" };
		List<String> brandlist = Arrays.asList(brand);
		System.out.println("");
		System.out.println(brandlist);
		String[] brandarray = new String[brandlist.size()];
		brandarray = brandlist.toArray(new String[brandlist.size()]);
         for (String s : brandarray) {
        	 System.out.println(s);
         }

	}

}
