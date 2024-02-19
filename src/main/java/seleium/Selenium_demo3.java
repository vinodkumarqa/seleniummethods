package seleium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://trytestingthis.netlify.app/");
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
      //WebElement dropdown=driver.findElement(By.id("option"));
	  //Select sel=new Select(dropdown);
	  //sel.selectByVisibleText("Option 2");
	  //sel.selectByIndex(1);
	  //sel.selectByValue("option 1");
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("ferrari");
		
	    List<WebElement>autosuggestions=driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));
	    System.out.println(autosuggestions.size());
	    
	    for(WebElement options:autosuggestions) {
	    	System.out.println(options.getText());
	    	
	    	if(options.getText().contains("logo")) {
	    		options.click();
	    	}
	    	
	    }
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		


	}

}
