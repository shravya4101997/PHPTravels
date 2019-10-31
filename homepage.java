package Auto.Phptravels;


import org.openqa.selenium.By;
public class homepage extends Launch {
	
	By myaccount = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By signup = By.xpath("//a[@class='dropdown-item tr']");
    By login=By.xpath("//a[@class='dropdown-item active tr']");
	By hotel=By.xpath("//a[contains(@class,'text-center hotels active')]");
	By flights=By.xpath("//a[contains(text(),'Flights')]");
	By tours=By.xpath("//a[contains(@class,'text-center tours')]");
	

	
	public void signup() {
		driver.findElement(myaccount).click();
		driver.findElement(signup).click();
		
	}
	public void login() {
		driver.findElement(myaccount).click();
		driver.findElement(login).click();
		
		
	}

	public void hotel() {
		driver.findElement(hotel).click();
		
		
	}
	public void flights() {
		driver.findElement(flights).click();
		
		
	}
	public void tours() {
		driver.findElement(tours).click();
		
		
	}
	
		
	}
	






