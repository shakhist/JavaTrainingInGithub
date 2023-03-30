package Trng_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Fileinputstream
		//2,Prperties class
		//3.load file
		//4.getproperties
		try {
			FileInputStream file=new FileInputStream("src\\Trng_Java\\Obj.properties");
			
			Properties p=new Properties();
			p.load(file);
			String s=p.getProperty("url");
			System.out.println(s);
			System.out.println(p.getProperty("name"));
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
