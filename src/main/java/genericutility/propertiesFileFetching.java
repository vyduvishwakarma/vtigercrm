package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertiesFileFetching {
	
	public void LoadingdDataFromPropertiesFile(String key) throws Throwable {

	FileInputStream fisp=new FileInputStream("\\src\\test\\resources\\commondata.properties");
	
	Properties p=new Properties();
	
	p.load(fisp);
	String data=p.getProperty(key);
	
	System.out.println(data);
	
	
	
}
}