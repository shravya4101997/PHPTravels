package Auto.Phptravels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

	public class FlightSearch extends Launch
	{

		    By from= By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
		    By to= By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
		    By departuredate= By.xpath("//input[@id='FlightsDateStart']");
		    By adults= By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[3]//button[1]");
		    By child= By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]");
		    By infant= By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[3]//button[1]");
		    By oneway= By.xpath("//div[@class='tab-content shad RTL_shad search-form']//div[1]//div[1]//div[1]//ins[1]");
		    By search= By.xpath("//div[contains(@class,'col-xs-12 col-md-1')]//button[contains(@class,'btn-primary btn btn-block')][contains(text(),'Search')]");
		    
		
	
		
		WebElement from(){
			return driver.findElement(from);
		}
		
		WebElement to() {
			return driver.findElement(to);
		}
		
		WebElement departureDate() {
			return driver.findElement(departuredate);
		}
		
		
		
		WebElement adults() {
			return driver.findElement(adults);
		}
		
		WebElement child() {
			return driver.findElement(child);
		}
		
		WebElement infantb() {
			return driver.findElement(infant);
		}
		
		
		WebElement oneWay() {
			return driver.findElement(oneway);
		}
		
		WebElement searchButton() {
			return driver.findElement(search);
		}
		
		

	}



