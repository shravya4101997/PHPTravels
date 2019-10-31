package Auto.Phptravels;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


	public class TestCasesTour 
	{
		   static Logger log=Logger.getLogger("Tour");
		   static By nav1=By.xpath("//div[6]//nav[1]//div[2]");
		    static By nav2= By.xpath("(//div[@class='datepicker--nav-title'])[6]");
		    static By next=By.xpath("(//div[@data-action='next'])[6]");
		    
		    @Test
		    public static void tourSearch() throws Exception {
		    	
		    	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phptravels\\Phptravels\\log.properties");
		        
		        homepage h1= new homepage();
		        h1.Launch();
		        
		        h1.tours();
		        
		        TourSearch t1= new TourSearch();
		        t1.city().click();
		        
		        String city= h1.prop.getProperty("tour_name");
		        h1.driver.findElement(By.xpath("//div[@class='select2-result-label'][contains(text(),'"+city+"')]")).click();
		        
		        //tour type
		        
		        t1.tourType().click();
		        //h1.driver.findElement(By.xpath("//div[@id='tourtype_chosen']//input[@class='chosen-search-input']")).sendKeys("Private");
		        h1.driver.findElement(By.xpath("//li[contains(text(),'"+h1.prop.getProperty("tour_type")+"')]")).click();        
		        
		        
		        //date
		        t1.tourDate().click();
		        
		        h1.driver.findElement(nav1).click();
		        h1.driver.findElement(nav2).click();
		        h1.driver.findElement(next).click();
		        h1.driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-year'][contains(text(),'"+h1.prop.getProperty("tour_year")+"')]")).click();
		        h1.driver.findElement(By.xpath("//div[contains(text(),'"+h1.prop.getProperty("tour_month")+"')]")).click();

		 

		        //date
		                for(int i = 1 ; i<=35 ; i++) {             
		                    String str1 = h1.driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+i+"]")).getText();             
		                    if(str1.equals("1")) {                 
		                        for(int j = i ; j<=35 ; j++) {                     
		                            str1 = h1.driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                         
		                            if(str1.equals(h1.prop.getProperty("tour_date"))) {                         
		                                h1.driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).click();                         
		                                break;
		                                }                 
		                            }             
		                        }
		                    }                     
		        
		        t1.guest().click();
		        t1.searchButton().click();
		        h1.driver.close();
		        log.info("tour");
		        
		    }  
		    }
		  