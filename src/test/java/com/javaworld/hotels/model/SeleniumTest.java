package com.javaworld.hotels.model;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class SeleniumTest {
	
	WebDriver driver;
	
@FindBy (xpath="//button[@type=\"submit\"]")
	
	WebElement button_chercher;

@Before

public void setup() throws Exception {

	//Initialisation du driver
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgrisel\\Downloads\\HotelWebbApp-master\\HotelWebbApp-master\\HotelWebapp\\src\\Ressources\\driver\\geckodriver.exe");
	driver = new FirefoxDriver();
    
    //aller sur le site du PROJET
    driver.manage().window().maximize();

}

@After

public void teardown() {
	driver.quit();
}

	
}
