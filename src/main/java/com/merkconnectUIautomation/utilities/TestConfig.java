package com.merkconnectUIautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class TestConfig 
{
	
	public static HashMap<String,String> prjProperties =new HashMap<String,String>();
	
	public static HashMap<String,String> getConfigDetails()
	{
		
		 try {
			String userDir = System.getProperty("user.dir");
			 // Create FileInputStream Object 
			 File fle = new File(userDir+"/src/test/resources/configuration/config.properties");
			 FileInputStream fileInput = new FileInputStream(fle);  
			 // Create Properties object  
			 Properties prop = new Properties();  
			 //load properties file  
			
				prop.load(fileInput);
		
			 for (String key : prop.stringPropertyNames()) 
			 {
			      String value = prop.getProperty(key);
			      prjProperties.put(key, value);
			 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} 
		
		return prjProperties;
	}

}
