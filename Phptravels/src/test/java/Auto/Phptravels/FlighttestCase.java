package Auto.Phptravels;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FlighttestCase {
	
	static By month= By.xpath("//div[16]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");
	
	
	@Test
	public static void flightSearch() throws Exception{
		
		
		homepage h1= new homepage();
		h1.Launch();
		h1.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		h1.flights();
		
		
		FlightSearch f1= new FlightSearch();
		f1.fromClick().click();
		
		//String str1 = h1.prop.getProperty("fromLocation");
		//System.out.println(str1);
		
		f1.from().sendKeys(h1.prop.getProperty("fromLocation"));
		h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("fromLocation")+"')]")).click();
		f1.toClick().click();
		f1.to().sendKeys(h1.prop.getProperty("toCity"));
		Thread.sleep(5000);
		h1.driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
		//h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("toCity")+"')]")).click();
		f1.departureDate().click();
		
		String str = h1.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(h1.prop.getProperty("departureMonthYear"))) {
			h1.driver.findElement(next).click();
			str= h1.driver.findElement(month).getText();
		}
		
		checkInDate(h1.prop.getProperty("departureDate"));
		
		f1.guestClick().click();
		f1.adults().click();
		f1.adults().sendKeys(h1.prop.getProperty("fAdults"));
		int aval = Integer.parseInt(h1.prop.getProperty("fAdults"));
		h1.driver.findElement(By.xpath("//select[@id='madult']//option[@value='"+aval+"']")).click();
		
		f1.child().click();
		f1.child().sendKeys(h1.prop.getProperty("fChild"));
		int cval = Integer.parseInt(h1.prop.getProperty("fChild"));
		h1.driver.findElement(By.xpath("//select[@id='mchildren']//option[@value='"+cval+"']")).click();
		
		f1.infantb().click();
		f1.infantb().sendKeys(h1.prop.getProperty("fInfant"));
		int ival= Integer.parseInt(h1.prop.getProperty("fInfant"));
		h1.driver.findElement(By.xpath("//select[@id='minfant']//option[@value='"+ival+"']")).click();
		f1.done().click();
		Thread.sleep(1000);
		//h1.driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		f1.searchButton().click();
		Thread.sleep(10000);
		h1.driver.close();
	}

	public static void checkInDate(String date){
		
		String d;
		homepage h1= new homepage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	}	

}

