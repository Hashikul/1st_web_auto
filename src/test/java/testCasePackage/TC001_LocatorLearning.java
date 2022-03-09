package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC001_LocatorLearning extends BaseDriver {
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Bappy");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Sabit");
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(2000);
		
	}

}
