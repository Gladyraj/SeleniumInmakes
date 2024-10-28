package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	@Parameters("browser")
	@Test
	private void tc1 (@Optional("chrome") String browserName) {
		
		WebDriver driver;
		if(browserName.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new ChromeDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver =new ChromeDriver();
			
		}
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
			


	}
	
		
		
	


	}
	
		
		
		
		




