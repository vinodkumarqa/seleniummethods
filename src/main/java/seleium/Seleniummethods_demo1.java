package seleium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniummethods_demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.facebook.com");
		driver.get("http://Empirehome.myprojectsonline.co.in");
		//driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		//driver.close();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		//driver.findElement(By.name("emailid")).sendKeys("vinod");
	    driver.findElements(By.name("vinod"));

		Thread.sleep(5000);
		driver.close();
		
		}

}
