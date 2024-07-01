package objectRepo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ObjectReader {
	// declare the obj for properties
	Properties pro;
	//create a constructor for the things which we need to initialized when the object of the class is creates
	public ObjectReader() throws IOException {
		//store the path into the variable
		String path="C:\\Users\\271501\\eclipse-workspace\\com.ust.automationframework\\ObjectRepository\\object.properties";
		// To read the file create the object of fileReader class and pass the variable as a parameter
		FileReader reader=new FileReader(path);
		pro=new Properties();
		pro.load(reader);
	}
	public String get_BaseUrl() {
		return pro.getProperty("baseUrl");
		
	}
	public String get_ExWelcomeTxt() {
		return pro.getProperty("exWelcomeTxt");
		
	}

}
