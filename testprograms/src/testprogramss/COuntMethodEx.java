package testprogramss;

public class COuntMethodEx {
	int a=10;
    void display(String name) {
    	int a=10;
	 int count=0;
	 for(int i=0 ; i<name.length() ;i++) {
		 if(name.charAt(i) != ' ')
		 count++;		 
	 }
	 System.out.println("the value of the string is "+count);

}
}