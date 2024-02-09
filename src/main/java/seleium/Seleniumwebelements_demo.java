package seleium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwebelements_demo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
//		driver.findElement(By.id("fname")).sendKeys("vinod");
//		
//		driver.findElement(By.id("lname")).sendKeys("thumati");
//        
//		WebElement checkbox=driver.findElement(By.id("male"));
//        checkbox.click();
//        System.out.println(checkbox.isSelected());
//        
//        WebElement text=driver.findElement(By.xpath("//h1[text()='Your Website to practice Automation Testing']"));
//        System.out.println("the text is displayed "+text.isDisplayed());
//        
        WebElement button=driver.findElement(By.xpath("//button[text()=' Submit']"));
        System.out.println("verifying the button "+button.isEnabled());
      
       // WebElement option=driver.findElement(By.xpath("//label[text()='Option 2']"));
        //System.out.println(option.isSelected());
      
//        List<WebElement> tags= driver.findElements(By.tagName("div"));
//        System.out.println(tags.size());
//       
//        List<WebElement> checks= driver.findElements(By.xpath("//input[@id='moption']"));
//        for(WebElement options:checks) {
//        	options.click();
//        	}    
//        driver.findElement(By.tagName("textarea")).clear();
//		driver.findElement(By.tagName("textarea")).sendKeys(" welcome to selenium");
//
//
//        WebElement buttons=driver.findElement(By.xpath("//button[text()=' Submit']"));
//        System.out.println("verifying the submit button "+button.isEnabled());

	}

}
