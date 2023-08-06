package trickyQuestionsINjava;

   abstract class AbstractExample  implements InterfaceExample {
	   
	  public void intermethod() {
		   System.out.println("interface method is implemented by abstract class : ");
	   }			
	    void display() {
	    	System.out.println("this is non abstract method in abstract class ");
	    }
	    abstract void show();
      		}