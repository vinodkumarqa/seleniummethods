package seleium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("vinod");

//	    driver.findElement(By.id("email")).sendKeys("vinodthumati116@gmail.com");
	    
//		driver.findElement(By.id("phone")).sendKeys("912345678");
		
//		
//		driver.findElement(By.id("textarea")).sendKeys("hyderabad");
		
//		WebElement checkbox=driver.findElement(By.id("male"));
//        checkbox.click();
//        System.out.println(checkbox.isSelected());
//        
//        WebElement checkboxs=driver.findElement(By.id("friday"));
//        checkboxs.click();
//        System.out.println(checkboxs.isSelected());
//        
//		 List<WebElement> dropdown= driver.findElements(By.xpath("//select[@id='country']"));
//	        for(WebElement options:dropdown) {
//	        	driver.findElement(By.id("country")).sendKeys("India");
//	        	options.click();
//	        	}    
	        
//	        driver.findElement(By.id("datepicker")).sendKeys("12/02/2024");
		
//		List<WebElement> colors= driver.findElements(By.xpath("//select[@id='colors']"));
//        for(WebElement options:colors) {
//        	//driver.findElement(By.id("colors")).sendKeys("Blue");
//        	options.click();
//        	}    
	        
//		WebElement button=driver.findElement(By.xpath("//button[text()=' New Browser Window']"));
//		System.out.println("verifying the button" +button.isEnabled() );

//		driver.findElement(By.xpath("//button[text()=' Alert']")).click();
//
//		Alert al=driver.switchTo().alert();
//		al.accept();
		
		Thread.sleep(5000);
		driver.close();

	}

}
