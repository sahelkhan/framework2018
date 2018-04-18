import org.openqa.selenium.WebDriver;

public class firstframework {

	public static void main(String[] args) {
		
		Webdriver driver ;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get ("http://facebook.com");
		
		//WHAT IS THE DIFFERENT BETWEEN 
        //TestNG vs junit
		 
		 

	}

}
