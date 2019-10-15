package Auto.Phptravels;


import org.testng.annotations.Test;

public class TestCase extends homepage {
	
	
	@Test
	public static void userRegistration() throws Exception  {
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
		r.Rsubmit();
		
	}
	
	

}

