package stringbuilderstringbuffer;

public class StringBuilderEX {
public static void main(String[] args) {
    StringBuilder builder=new StringBuilder("String");  
    builder.append("builder");  
    System.out.println(builder);  
    
   // System.out.println("String reverse method:"+builder.reverse());
    
    
    System.out.println(builder.deleteCharAt(2));
    
    System.out.println(builder.length());
    System.out.println(builder.capacity());
    System.out.println(builder.codePointBefore(1));
    System.out.println(builder.replace(0, 4, "a"));
  
} 
}
