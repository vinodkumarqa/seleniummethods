package seleium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscreenshot_demo4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File image=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./target/capture.png");
		FileUtils.copyFile(image, target);
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
