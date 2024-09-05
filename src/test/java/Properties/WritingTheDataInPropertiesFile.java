package Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingTheDataInPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		Properties Pobj=new Properties();
		
		//store the values in properties file
				Pobj.setProperty("name","Akshatha");
				Pobj.setProperty("Qualification","BSc");
				Pobj.setProperty("Mobile","94896212");
		
		String filepath=System.getProperty("user.dir")+"\\Testdata\\Write.properties";
		
		FileOutputStream file=new FileOutputStream(filepath);
		
		
		
		Pobj.store(file,"sample data in properties file");
		file.close();
		
	}

}
