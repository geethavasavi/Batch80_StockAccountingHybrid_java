package utilites;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertyFileUtil {
	
	public static String getvalueforkey(String key) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\ojt geetha\\StockAccountingHybridFramework\\PropertiesFile\\Environment.properties");
		Properties configproperties=new Properties();
		configproperties.load(fis);
		configproperties.get(key);
		return configproperties.getProperty(key);
		
		
		
		
		
	}
}

	
	
	
	


