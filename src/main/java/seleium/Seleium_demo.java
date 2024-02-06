package seleium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleium_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.get("http://www.twitter.com");
        driver.get("http://www.instagram.com");
        driver.get("http://www.whatsapp.com");
        driver.get("http://www.gmail.com");
        //driver.close();
	}

}
