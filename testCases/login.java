package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

public static void main (String[] args ) {
System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
WebDriver driver = new ChromeDriver ();

driver.get("http://newtours.demoaut.com/");
driver.findElement(By.name("userName")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("test123");

driver.findElement(By.name("login")).click();


driver.quit();	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}