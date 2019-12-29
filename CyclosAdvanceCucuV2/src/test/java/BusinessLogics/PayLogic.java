package BusinessLogics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Base.Base;
import com.ObjectRepository.PayUserOR;


import cucumber.api.DataTable;

public class PayLogic {
	
WebDriver driver = Base.driver;
	
	public void LogicPayUser(DataTable dt)
	{
		
		System.out.println("Driver = " + driver); // Just used to check the value of driver, as earlier it was giving null (null point error)
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PayUserOR PayOR = new PayUserOR(driver);
		
		List<Map <String, String>> data = dt.asMaps(String.class, String.class);
		
		for(int i=0; i<data.size(); i++)
		{
			String QuickUser = data.get(i).get("User");
			String AmountPay = data.get(i).get("Amount");
			
			PayOR.payUser(QuickUser, AmountPay);
		}
		
	}
	
	
	
	public void logicOutline(String User, String Amount)
	
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PayUserOR PayOR = new PayUserOR(driver);
		PayOR.payUser(User, Amount);
	
	}
	
	
	public void csvDataReading(String path) throws IOException
	{
		
		System.out.println("path is: "+ "" + path);
		
			BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";

	        try {

	            br = new BufferedReader(new FileReader(path));
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] data = line.split(cvsSplitBy);

	               String User = data[0];
	               String Amount = data[1];
	              System.out.println("User [User = " + data[0] + " , Amount=" + data[1] + "]");
	              //  System.out.println("User [code= " + data[0]);
	              
	              System.out.println(User);
	              System.out.println(Amount);
	                 
	              driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	              PayUserOR payuser = new PayUserOR(driver);
	              
	              payuser.payUser(User, Amount);
     

	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

			
			

		
	}
	
	
}
