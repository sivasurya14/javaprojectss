package thiskeyworduses;

public class Thiskeyword2 {

	Thiskeyword2(){
		//we can call parametrized constructor from default constructor using this key word 
	    //this(10);
		System.out.println("this is method ");
	}

	Thiskeyword2(int x) {
		// this key wor used to invoke the current class class constructor 
	       this();
		System.out.println(x);

	}

}
