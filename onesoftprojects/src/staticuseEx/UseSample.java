package staticuseEx;

public class UseSample {
public static void main(String[] args) {	
	Sample s1 = new Sample();
	Sample s2 = new Sample();
	Sample.disply();	
	System.out.println(Sample.a);
}
static {
	System.out.println("");
}
}
