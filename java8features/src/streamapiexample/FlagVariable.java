package streamapiexample;

import java.io.File;
import java.io.FileOutputStream;

public class FlagVariable {
	public static void main(String[] args) {
 
		try {
		int a =10;
		int b = 0;
		int c=a/b;
		}
		catch (Exception e) { System.err.println("error occured");
		}
		int aa[] = { 1, 2, 3,5, 6, 7 };
		boolean istrue = true;
		int flag = 0;
		for (int i = 0; i < aa.length; i++) {
			if(aa[i]==4)
			istrue = false;
			flag = 1;
		}

		if (flag == 1)
			System.out.println("found");
		else 
			System.out.println("not found");
		File file = new File("sample.txt");
		
	
		
		
		
	}
	
	
	
}
