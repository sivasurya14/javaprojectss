package serializationExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) {
		try  
		{    
		//Creating the object    
		Employee emp =new Employee(1187345,"Andrew");    
		//Creating stream and writing the object    
		FileOutputStream fout=new FileOutputStream("nhk");    
		ObjectOutputStream out=new ObjectOutputStream(fout);    
		out.writeObject(emp);    
		out.flush();    
		//closing the stream    
		out.close();    
		System.out.println("Data has been read from the file.");    
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}    
		}    	
	}

