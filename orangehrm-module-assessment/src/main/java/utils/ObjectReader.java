package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ObjectReader {
	//static object declaration only for this class
	private static Properties pro;

	// Method to read object properties from file
	public static Properties readObject() throws IOException {
		if (pro == null) {
			pro = new Properties();
			try {
				
				FileInputStream reader = new FileInputStream(System.getProperty("user.dir")
						+ "\\src\\main\\resources\\objectrepository\\object.properties");
				pro.load(reader);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pro;

	}

	

}