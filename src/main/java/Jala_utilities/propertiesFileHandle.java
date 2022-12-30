package Jala_utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public  class  propertiesFileHandle {
	
	public static Properties prFileHandle(String filePath) throws IOException {
		
		File f=new File(filePath);
		FileInputStream fs=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fs);
		return pr;
		
		
	}
	

}
