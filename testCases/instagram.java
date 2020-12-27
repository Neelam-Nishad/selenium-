package testCases;

//import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.testng.Assert;

public class instagram {

public static void main (String[] args ) throws InterruptedException {
//System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver/chromedriver.exe");
WebDriver driver = new ChromeDriver ();



driver.get("https://www.instagram.com/");
/*driver.findElement(By.linkText("Log in")).click();
Thread.sleep(5000);*/
driver.findElement(By.name("username")).sendKeys("cdlsiet_");
/*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("cdlsiet_");
Thread.sleep(3000);*/

driver.findElement(By.name("password")).sendKeys("Neelam@8860");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[4]//button[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//button[contains(@class,'HoLwm')]")).click(); //when popup occurs

Thread.sleep(3000);
driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Neelam_kashyap_");

Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),' K A S H Y A P')]")).click();

Thread.sleep(3000);
//driver.findElement(By.xpath("//button[contains(text(),'Follow')]")).click();
if(driver.findElement(By.xpath("//button[contains(text(),'Follow')]")).isDisplayed()) {
	driver.findElement(By.xpath("//button[contains(text(),'Follow')]")).click();
}
else if (driver.findElement(By.xpath("//button[contains(text(),'Following')]")).isDisplayed()) {
driver.findElement(By.xpath("//button[contains(text(),'Following')]")).click();
Thread.sleep(10000);
//Alert alert = driver.switchTo().alert();
//alert.dismiss();

Actions action=new Actions(driver);
WebElement movecursor = driver.findElement(By.xpath("//button[contains(text(),'Unfollow')]"));
action.moveToElement(movecursor).click().perform();

driver.findElement(By.xpath("//button[contains(text(),'Unfollow')]")).click();
Thread.sleep(3000);
}

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");

//Thread.sleep(3000);
//driver.findElement(By.xpath("//span[@class='glyphsSpriteApp_instagram__outline__24__grey_9 u-__7']")).click();





//driver.quit();












}








}