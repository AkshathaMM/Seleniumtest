package Properties;
		import java.io.FileInputStream;
		import java.io.IOException;
		import java.util.Properties;

		public class ReadingThePropertiesFile {
		    public static void main(String[] args) throws IOException 
		    {
		        // Create an object for properties file
		        Properties propertiesObj = new Properties();

		        // Location of the file (adjust the path accordingly if needed)
		        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Testdata\\config.properties");

		        // Load the properties file using the object
		        propertiesObj.load(file);


		        // Reading the data from properties file
		        String url = propertiesObj.getProperty("Cire");
		        String UN = propertiesObj.getProperty("Username");
		        String PW = propertiesObj.getProperty("Password");
		        String Murl = propertiesObj.getProperty("MyPC");

		        // Print the values
		       // System.out.println(url+" "+UN+" "+PW+" "+Murl);
		        
		        System.out.println("URL: " + url);
		        System.out.println("Username: " + UN);
		        System.out.println("Password: " + PW);
		        System.out.println("MyPC: " + Murl);
		    }
		}

