package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL 
		driver.get(" https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// click on cookies 
		driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
		// Step 6: Click on Create New Account button	
	driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();
	// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("xxxx");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("yyyy");
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("0101010101");
		// Step 10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("password321");
		// Step 11: Handle all the three drop downs
		WebElement elementDay = driver.findElement(By.id("day"));
		Select dd = new Select(elementDay);
		dd.selectByValue("16");
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select dd1 = new Select(elementMonth);
		dd1.selectByValue("5");
		WebElement elementYear = driver.findElement(By.id("year"));
		Select dd2 = new Select(elementYear);
		dd2.selectByValue("1982");
		// Step 12: Select the radio button "Female" 
		  //          ( A normal click will do for this step) }*/
		driver.findElement(By.linkText("Female")).click();
	}}

