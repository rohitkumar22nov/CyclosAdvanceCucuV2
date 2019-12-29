package KeyMouseActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommandsKeyMouse {
	
	//WebDriver driver;
	
	
	public  void clickAction(WebElement element)
	{
	  	element.click();
		
		
	//System.out.println(element);
		
	}
	
	
	public void sendKeysAction(WebElement element, String SendKeys)
	{
		
		element.sendKeys(SendKeys);
		
	}
	
	
	public String gettingText(WebElement element)
	
	{

		
		String value = element.getText();
		return value;
	}
	

}

