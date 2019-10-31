package Auto.Phptravels;


	import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	public class testcase2 {
		 static Logger log=Logger.getLogger("hotel");
		
		static By nav1_in=By.xpath("//div[1]//nav[1]//div[2]");
	    static By nav2_in=By.xpath("(//div[@class='datepicker--nav-title'])[1]");
	    static By next_in=By.xpath("(//div[@data-action='next'])[1]");
	    
	    static By nav1_out=By.xpath("//div[@id='datepickers-container']//div[2]//nav[1]//div[2]");
	    static By nav2_out=By.xpath("(//div[@class='datepicker--nav-title'])[2]");
	    static By next_out=By.xpath("(//div[@data-action='next'])[2]");

	 

	    //Hotel search
	    @Test
	    public static void hotelSearch() throws Exception {
	    	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phptravels\\Phptravels\\log.properties");
	    
	        homepage h1= new homepage();
	        h1.Launch();
	        
	        h1.hotel();
	        
	        HotelSearch h2= new HotelSearch();
	        
	        //hotel or city name
	        h2.searchButton().sendKeys(h1.prop.getProperty("location"));
	        h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("location")+"')]")).click();
	        
	        
	        //check in
	        h2.checkIn().click();
	        h1.driver.findElement(nav1_in).click();
	        h1.driver.findElement(nav2_in).click();
	        h1.driver.findElement(next_in).click();
	        h1.driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-year'][contains(text(),'"+h1.prop.getProperty("check_in_year")+"')]")).click();
	        h1.driver.findElement(By.xpath("//div[contains(text(),'"+h1.prop.getProperty("check_in_month")+"')]")).click();
	        h1.driver.findElement(By.xpath("//div[1]//div[1]//div[2]//div[contains(text(),'"+h1.prop.getProperty("check_in_date")+"')]")).click();
	        
	        
	        //check out
	        
	        h1.driver.findElement(nav1_out).click();
	        
	        h1.driver.findElement(By.xpath("//div[@class='datepicker--months datepicker--body active']//div[@class='datepicker--cell datepicker--cell-month'][contains(text(),'"+h1.prop.getProperty("check_out_month")+"')]")).click();
	        h1.driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[contains(text(),'"+h1.prop.getProperty("check_out_date")+"')]")).click();
	        h2.adults().click();
	        h2.child().click();
	        h2.hotelSearchButton().click();
	        Thread.sleep(10000);
	        h1.driver.close();
	        log.info("hotel");
	        
	    }		}
		
	



