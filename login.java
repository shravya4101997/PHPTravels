package Auto.Phptravels;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	public class login extends Launch {
		By loginEmail=By.xpath("//input[@placeholder='Email']");
		By loginPass=By.xpath("//input[@placeholder='Password']");
		By loginSubmit=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
		//By cookies=By.xpath("//button[@id='cookyGotItBtn']");
		public WebElement loginEmail() {
			return driver.findElement(loginEmail);
		}
		

		public WebElement loginPass() {
			return driver.findElement(loginPass);
		}
		
		
		  public void loginSubmit() throws InterruptedException{
				
			 // driver.findElement(cookies).click();
				driver.findElement(loginSubmit).click();
			}
			
		
		
		

	}

	

	