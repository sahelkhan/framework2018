
public class myFirstTest extends config {

	public static void main(String[] args) {
		//do all the configure
		//int driver
		//setup browser
		//company url
		//
		
		
		@Beforetest
		public void initDrivers() {
		Webdriver driver ;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get ("http://facebook.com");
		

	}

}
