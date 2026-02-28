package com.owl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://owlpathacademy.co.uk/");
		driver.manage().window().maximize();	
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
}
