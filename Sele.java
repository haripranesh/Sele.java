package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sele {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("Test Selenium");;
		driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();;
		driver.findElement(By.xpath("//*[@id=\"u_0_11\"]")).click();;
		
		Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));

		sel1.selectByIndex(4);
		//driver.quit();

	}

}
