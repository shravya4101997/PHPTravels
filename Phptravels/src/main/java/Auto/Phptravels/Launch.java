package Auto.Phptravels;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	/*
 WebDriver driver;
public LaunchBrowser(WebDriver driver) { By firstname = By.xpath("//*[@id=\"headersignupform\"]/div[3]/input");
	this.driver=driver;
}*/
 public static WebDriver driver;
 public static Properties prop = new Properties();
 
 public void Launch() throws Exception {
 FileInputStream fis= new FileInputStream("C:\\Users\\Online Test\\git\\Phptravels\\Phptravels\\src\\main\\java\\Files\\base.properties");
	prop.load(fis);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Online Test\\Desktop\\shastri\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get(prop.getProperty("url"));
	driver.manage().deleteAllCookies();
	

}

}

