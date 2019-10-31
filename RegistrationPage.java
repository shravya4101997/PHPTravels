package Auto.Phptravels;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends Launch{
	By submit=By.xpath("//*[@id=\"headersignupform\"]/div[9]/button");
	//By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	By firstname = By.xpath("//input[@placeholder='First Name']");
	By lastname=By.xpath("//input[@placeholder='Last Name']");
	By mobile=By.xpath("//input[@placeholder='Mobile Number']");
	By email=By.xpath("//input[@placeholder='Email']");
	By password=By.xpath("//input[@placeholder='Password']");
	By confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
	
	
	public void Rsubmit() throws InterruptedException{
		
		//driver.findElement(cookies).click();
		driver.findElement(submit).sendKeys(Keys.ENTER);
		
	}
public WebElement firstname() {
	
	return driver.findElement(firstname);
}
public WebElement lastname() {
	return driver.findElement(lastname);
}
public WebElement mobile() {
	return driver.findElement(mobile);
}
public WebElement email() {
	return driver.findElement(email);
}
public WebElement password() {
	return driver.findElement(password);
}
public WebElement confirmpassword() {
	return driver.findElement(confirmpassword);
}
}
