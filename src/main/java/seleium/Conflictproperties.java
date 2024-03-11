package seleium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conflictproperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties read=new Properties();
		File f1=new File("./src/main/java/seleium/conflict.properties");
		FileInputStream file=new FileInputStream(f1);
		read.load(file);
		String ur=read.getProperty("url");
		String un=read.getProperty("username");
		String ps=read.getProperty("password");
		System.out.println(ur);
		System.out.println(un);
		System.out.println(ps);
		
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(ur);
		Thread.sleep(3000);
		driver.close();
		

	}

}
