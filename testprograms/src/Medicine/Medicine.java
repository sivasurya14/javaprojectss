package Medicine;

import java.util.Arrays;

public class Medicine {
  int price;
  Brands brand [];
 Stores stores;
   String type;
   
   Medicine (){
	   
   }
public Medicine(int price, Brands[] brand, Stores stores, String type) {
	super();
	this.price = price;
	this.brand = brand;
	this.stores = stores;
	this.type = type;
}


String getPrice() {
	
	if(price>200)
	return "BRANDED";
	else 
		return "generic mediceines";
	
}

@Override
public String toString() {
	return "Medicine [price=" + price + ", brand=" + Arrays.toString(brand) + ", stores=" + stores + ", type=" + type
			+ "]";
}
   
   
  
  
  
}
