package Auto.Phptravels;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;


	public class TestCasesTour 
	{

		static By month= By.xpath("//div[11]//div[1]//tr[1]//th[2]");
		static By next=By.xpath("//div[11]//div[1]//tr[1]//th[3]");
		static By guests= By.xpath("//select[@id='adults']");
		static By tourType= By.xpath("//select[@id='tourtype']");

		@Test
		public static void tourSearch() throws Exception {
			
			homepage h1= new homepage();
			h1.Launch();
			h1.driver.get(h1.prop.getProperty("url"));
			h1.tours();
			
			TourSearch t1= new TourSearch();
			t1.city().click();
			
			String city= h1.prop.getProperty("tourName");
			h1.driver.findElement(By.xpath("//div[@class='select2-result-label'][contains(text(),'"+city+"')]")).click();
			
			//date
			t1.tourDate().click();
			String str = h1.driver.findElement(month).getText();
			
			while(!str.equalsIgnoreCase(h1.prop.getProperty("tourMonthYear"))) {
				h1.driver.findElement(next).click();
				str= h1.driver.findElement(month).getText();
			}
			
			tourDate(h1.prop.getProperty("tourDate"));
			
			//no. of guests
			Select guest= new Select(h1.driver.findElement(guests));
			guest.selectByVisibleText(h1.prop.getProperty("tGuests"));
			
			//tour type
			Select tr= new Select(h1.driver.findElement(tourType));
			tr.selectByValue("187");
			
			t1.searchButton().click();
			Thread.sleep(10000);
			h1.driver.close();
		}
		
	public static void tourDate(String date){
			
			String d;
			homepage h1= new homepage();
			for(int i=1; i<=6;i++){
				for(int j=1; j<=7; j++){
					 d = h1.driver.findElement(By.xpath("//div[11]//tr["+i+"]//td["+j+"]")).getText();
					 if(d.equals("1")) {
						 for(int k=i; k<6; k++) {
							 for(int l=j; l<7; l++) {
								 d = h1.driver.findElement(By.xpath("//div[11]//tr["+k+"]//td["+l+"]")).getText();
								 if(d.equals(date))
										h1.driver.findElement(By.xpath("//div[11]//tr["+k+"]//td["+l+"]")).click();
							 }
						 }
				}
			}
		 }

       }
	}