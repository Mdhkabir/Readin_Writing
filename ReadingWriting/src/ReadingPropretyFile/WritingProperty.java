package ReadingPropretyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WritingProperty {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fios = new FileInputStream(System.getProperty("user.dir")+"\\src\\Object\\Object.properties");
		
		prop.load(fios);
		
 		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("courese"));
		System.out.println(prop.getProperty("coursename"));
		
		System.out.println(System.getProperty("user.dir"));
		
	}

}
