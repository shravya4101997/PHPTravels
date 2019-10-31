package Auto.Phptravels;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Auto.Phptravels.FlightSearch;
import Auto.Phptravels.homepage;

public class FlighttestCase extends Launch {
	static Logger log=Logger.getLogger("flight");
    static By nav1= By.xpath("//div[7]//nav[1]//div[2]");
    static By nav2= By.xpath("(//div[@class='datepicker--nav-title'])[7]");
    static By next=By.xpath("(//div[@data-action='next'])[7]");
    
    @Test
    public static void fightSearch() throws Exception{
    	
    	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phptravels\\Phptravels\\log.properties");
        homepage h1= new homepage();
        h1.Launch();
        h1.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        h1.flights();
        
        FlightSearch f1= new FlightSearch();
        f1.from().click();
        f1.from().sendKeys(h1.prop.getProperty("from_location"));
        h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("from_location")+"')]")).click();
        f1.to().click();
        f1.to().sendKeys(h1.prop.getProperty("to_city"));
        h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("to_city")+"')]")).click();
        f1.departureDate().click();
        h1.driver.findElement(nav1).click();
        h1.driver.findElement(nav2).click();
        h1.driver.findElement(next).click();
        h1.driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-year'][contains(text(),'"+h1.prop.getProperty("departure_year")+"')]")).click();
        h1.driver.findElement(By.xpath("//div[contains(text(),'"+h1.prop.getProperty("departure_month")+"')]")).click();
        
        //date
        for(int i = 1 ; i<=35 ; i++) {             
            String str1 = h1.driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();             
            if(str1.equals("1")) {                 
                for(int j = i ; j<=35 ; j++) {                     
                    str1 = h1.driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                         
                    if(str1.equals(h1.prop.getProperty("departure_date"))) {                         
                        h1.driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                         
                        break;
                        }                 
                    }             
                }
            }                         
        f1.adults().click();
        f1.child().click();        
        f1.infantb().click();
        //Thread.sleep(1000);
        //h1.driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
        f1.searchButton().click();
        Thread.sleep(10000);
        h1.driver.close();
        
        log.info("flight");
    
       
       
    
      	
    }

   }

 

    