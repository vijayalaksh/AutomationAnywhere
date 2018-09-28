package Project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReading {
static String  sPtah ="./Object_Repositry/Pro.properties.txt";
	public static void main(String[] args) 
	{
		ReadProperty();

	}
	//reading property values from property file
	public static void ReadProperty()
	{
		try 
		{
			FileInputStream oFile = new FileInputStream(sPtah);
			Properties oPro = new Properties();
			try 
			{
				
				oPro.load(oFile);
				String sValue = oPro.getProperty("Url");
				System.out.println(sValue);
			} 
			catch (IOException e) 
			{				
				e.printStackTrace();
			}
			
		} 
		catch (FileNotFoundException e) 
		{			
			e.printStackTrace();
		}
	}

}
