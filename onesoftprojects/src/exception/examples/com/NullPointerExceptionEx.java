/**
 * 
 */
package exception.examples.com;

/**
 * @author ELCOT
 *
 */
public class NullPointerExceptionEx {

	public static void main(String[] args) {

		String name = null;
        try { 
		char ch =name.charAt(2);
        } catch(Exception e) {
        	
        	System.out.println(e);
        }
//System.out.println(name.charAt(2));
         System.out.println("Rest of the code ");
         
	}

}
