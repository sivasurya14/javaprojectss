package Medicine;

public class UseMedicine {
	
	public static void main(String[] args) {
    Brands b = new Brands("xyz", "2mg", 250, "albendozole");
    Brands b1 = new Brands("abs", "1mg", 350, "paracetomol");
    Brands b2 = new Brands("sdg", "10mg", 450, "loopermeide");
		Stores s = new Stores(14, "appolo","chennai" );
		Stores s1 = new Stores(15, "medicare","chennai" );
		Stores s2 = new Stores(16, "medplus","chennai" );
		Brands brand [] = new Brands[3];
		brand[0]=b;
		brand[1]=b1;
		brand[2]=b2;
		Medicine m = new Medicine(11, brand, s,"tablet");
		Medicine m1 = new Medicine(11, brand, s1,"tablet");
		Medicine m2 = new Medicine(11, brand, s2,"tablet");
		
	  System.out.println(m);
	  Medicine g = new Medicine();
	  String get =g.getPrice();
	  System.out.println(get);
		
		
		
	}


	}

