package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Utility {
	private static Properties prop; //Initialize the properties object
	public String name;

	public Utility(){
					
		Configfile(); 
		}


	//This function is reading the user Email/Password from the Config file
	public static void Configfile()
	{
		
		String path=System.getProperty("user.dir");
		
		File file = new File(path+"\\src\\main\\java\\config.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}
	
	// This function is getting the user credential and country names from the config.propeties file.
	public static String Getvalue(String key){
		return (String) prop.get(key);
		
		
	}
}


