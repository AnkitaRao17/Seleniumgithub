package com.demo.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 public static WebDriver driver =null;
 

  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "E:\\New folder\\java software\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

  }


  public void afterMethod() {
	 driver.close();
  }

}
