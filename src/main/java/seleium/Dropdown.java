package seleium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		List<WebElement> drpdwnlist =dropdown.findElements(By.xpath("//select/option"));
		for(WebElement list:drpdwnlist) {
			System.out.println(list.getText());
		}

	}

}
