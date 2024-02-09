package seleium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumalerts_waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=' Your Sample Alert Button!']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();

		Alert al=driver.switchTo().alert();
		//al.accept();

		al.dismiss();
	}

}
