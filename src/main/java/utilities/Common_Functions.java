package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Common_Functions {
	
	static Properties testdata;
	static Properties locator;
	static File configFile;
	static FileInputStream fileStream;
	
	//load property file
	
	public static void loadproperties() throws IOException{
	
		
		testdata= new Properties();
		configFile= new File(System.getProperty("user.dir")+"/src/main/java/config/TestData.properties");
		fileStream= new FileInputStream(configFile);
		testdata.load(fileStream);
	}
	
	
	//load locator file
	
		public static void loadlocator() throws IOException{
		
			
			locator= new Properties();
			configFile= new File(System.getProperty("user.dir")+"/src/main/java/config/Locators.properties");
			fileStream= new FileInputStream(configFile);
			locator.load(fileStream);
		}
		
	
	//method will get value
	
	public static String getdataval(String keylocval) throws IOException{
		
		loadproperties();
		String path= testdata.getProperty(keylocval);
		return path;
		
	}
	
	//method will get value for locator
	
		public static String getlocval(String keylocval) throws IOException{
			
			loadlocator();
			String path= locator.getProperty(keylocval);
			return path;
			
		}

}
