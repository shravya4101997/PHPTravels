package Auto.Phptravels;

import org.testng.annotations.Test;

public class logintest {

	
		@Test
		public static void userLogin() throws Exception  {	

		homepage h=new homepage();
		h.Launch();
		h.login();
		
		login l=new login();
		
		l.loginEmail().sendKeys(h.prop.getProperty("email"));
		l.loginPass().sendKeys(h.prop.getProperty("password"));
		l.loginSubmit();

	}
	}


