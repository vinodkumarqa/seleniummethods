package seleium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumactions_demo4 {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));
//		Actions ac=new Actions(driver);
//		ac.moveToElement(login).build().perform();
//		
		
		
//		WebElement target=driver.findElement(By.id("drag1"));
//		WebElement destination=driver.findElement(By.id("div1"));
//		Actions ac=new Actions(driver);
//		ac.dragAndDrop(target, destination).build().perform();
//		
//		
		
//		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-click me']"));
//		Actions ac=new Actions(driver);
//		ac.doubleClick(doubleclick).build().perform();
		
		
		
	    WebElement rightclick=driver.findElement(By.xpath("//label[text()='Select your favorite color:']"));
	    Actions ac=new Actions(driver);
	    ac.contextClick().build().perform();
		
		

//		
//		Thread.sleep(3000);
//		driver.close();

	}

}
