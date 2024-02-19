package seleium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscrolling_demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//WebElement name=driver.findElement(By.name("fname"));
		
		//js.executeScript("arguments[0].value='vinod';", name);
		
		//WebElement button=driver.findElement(By.xpath("//button[text()=' Your Sample Alert Button!']"));
		//js.executeScript("arguments[0].click();", button);
		
		WebElement scroll=driver.findElement(By.xpath("//a[text()='here']"));
		//js.executeScript("arguments[0].scrollIntoView(true);", scroll);
//		js.executeScript("window.scrollBy(0,2000)");
//		js.executeScript("window.scrollBy(0,1000)");
//		js.executeScript("window.scrollBy(0,1500)");
//		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		Point location=scroll.getLocation();
		js.executeScript("window.scrollBy"+location);




	}

}
