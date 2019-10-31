package Auto.Phptravels;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends homepage {
	
     static Logger log=Logger.getLogger("TestCase");
	@Test
	public static void userRegistration() throws Exception  {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phptravels\\Phptravels\\log.properties");
		homepage h=new homepage();
		
		h.Launch();
		h.signup();
		
		RegistrationPage r = new RegistrationPage();
		r.firstname().sendKeys(h.prop.getProperty("firstname"));
		r.lastname().sendKeys(h.prop.getProperty("lastname"));
		r.mobile().sendKeys(h.prop.getProperty("mobile"));
		r.email().sendKeys(h.prop.getProperty("email"));
		r.password().sendKeys(h.prop.getProperty("password"));
		r.confirmpassword().sendKeys(h.prop.getProperty("confirmpassword"));
		Thread.sleep(5000);
		//h.driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		r.Rsubmit();
		String title=driver.getTitle();
        log.info(title);
       
       Assert.assertEquals(title,"Register");
   	
	}
	
	

}

