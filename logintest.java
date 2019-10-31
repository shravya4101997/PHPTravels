package Auto.Phptravels;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class logintest 	extends Launch {

	static Logger log=Logger.getLogger("loginTest");
		@Test
		public static void userLogin() throws Exception  {	
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phptravels\\Phptravels\\log.properties");
		homepage h=new homepage();
		h.Launch();
		h.login();
		
		login l=new login();
		
		l.loginEmail().sendKeys(h.prop.getProperty("email"));
		l.loginPass().sendKeys(h.prop.getProperty("password"));
		l.loginSubmit();
        String title=driver.getTitle();
        log.info(title);
    
       
       Assert.assertEquals(title,"Login" );
    

   
	}
	}


