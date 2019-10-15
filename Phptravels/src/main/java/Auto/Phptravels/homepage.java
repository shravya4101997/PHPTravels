package Auto.Phptravels;


import org.openqa.selenium.By;
public class homepage extends Launch {
	
	By myaccount = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By signup = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
    By login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	By hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By flights=By.xpath("//span[contains(text(),'Flights')]");
	By tours=By.xpath("//div[@id='body-section']//li[3]//a[1]");
	
	
	
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
	






