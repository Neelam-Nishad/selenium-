package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("shanayakirmo@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("123445");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")).click();
		Thread.sleep(3000);
		
		
		/*String usernameval = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText().trim();
		Assert.assertEquals(usernameval.contains("The email address or phone number that you've entered doesn't match any account. Sign up for an account."), true);
		Thread.sleep(10000);*/
		//driver.findElement(By.id("email")).clear();
		//Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("shanayakirmoliya@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Neelam@8860");
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}
}
