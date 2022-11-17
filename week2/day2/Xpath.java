package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
	}

	
	
	//input[@id='username']
	//input[@id='password']
	//input[@class='decorativeSubmit']
	//a[contains(text(),'CRM')]
	//a[contains(text(),'Leads')]
	//a[contains(text(),'Create')]
	//input[contains(@class,'inputBox')]
	//input[contains(@id,'createLeadForm_firstName')]
	//input[contains(@id,'createLeadForm_lastName')]
	//input[contains(@class,'small')]
}
