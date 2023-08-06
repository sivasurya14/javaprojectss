package Medicine;

public class Stores {
   int id ; 
   String name;
   String Address;
public Stores(int id, String name, String address) {
	this.id = id;
	this.name = name;
	Address = address;
}
@Override
public String toString() {
	return "Store [id=" + id + ", name=" + name + ", Address=" + Address + "]";
}
   
}
