package Auto.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelSearch extends Launch {

	  By search_city_click= By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	    By search_city= By.xpath("//div[@id='s2id_autogen1']//a[@class='select2-choice']");
	    By check_in= By.id("checkin");
	    By check_out= By.id("checkout");
	    By adults= By.xpath("(//button[contains(text(),'+')])[1]");
	    By child= By.xpath("(//button[contains(text(),'+')])[2]");
	    By search= By.xpath("(//button[contains(text(),'Search')])[1]");
	    
	    
	    public WebElement searchButton() {
	        driver.findElement(search_city_click).click();
	        return driver.findElement(search_city);
	    }
	    
	    public WebElement checkIn() {
	        return driver.findElement(check_in);
	    }
	    
	    public WebElement checkOut() {
	        return driver.findElement(check_out);
	    }
	    
	    public WebElement adults(){
	        return driver.findElement(adults);
	    }
	    
	    public WebElement child() {
	        return driver.findElement(child);
	    }
	    
	    public WebElement hotelSearchButton(){
	        return driver.findElement(search);
	    }
}