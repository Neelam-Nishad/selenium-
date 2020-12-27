package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobject.loginpage;

 

public class register {

public static void main (String[] args ) {
System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
WebDriver driver = new ChromeDriver ();
loginpage register =  PageFactory.initElements(driver, loginpage.class);
driver.get("http://newtours.demoaut.com/");


register.linkRegister.click();
register.txtFirstname.sendKeys("Neelam");
register.txtlastname.sendKeys("kashyap");
register.txtPhone.sendKeys("876543322234");
register.txtEmail.sendKeys("nishadneelam@gamil.com");

Select ddCountry = new Select (register.ddCountry);
ddCountry.selectByVisibleText("INDIA");

// driver.quit();	
}

}