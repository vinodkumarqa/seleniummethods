package seleium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumwaits_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,15);
		//driver.findElement(By.id("alert")).click();
		//wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.id("populate-text")).click();
		WebElement text=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.isDisplayed());
		
//		driver.findElement(By.id("display-other-button")).click();
//		WebElement buttons=driver.findElement(By.id("hidden"));
//		wait.until(ExpectedConditions.elementToBeClickable(buttons));
//        System.out.println("verifying the hidden button "+buttons.isEnabled());
		
		
//		driver.findElement(By.id("enable-button")).click();
//		WebElement button=driver.findElement(By.id("disable"));
//		wait.until(ExpectedConditions.elementToBeClickable(button));
//        System.out.println("verifying the disable button "+button.isEnabled());
//        
//        WebElement checkbox=driver.findElement(By.id("checkbox"));
//        wait.until(ExpectedConditions.elementToBeClickable(checkbox));
//        checkbox.click();
//        System.out.println(checkbox.isSelected());
//		
//		driver.findElement(By.id("checkbox")).click();
//		WebElement checkbox=driver.findElement(By.id("ch"));
//		wait.until(ExpectedConditions.elementToBeSelected(checkbox));
//		System.out.println(checkbox.isSelected()+" "+ "checkbox is selected");
        driver.close();

	}

}
