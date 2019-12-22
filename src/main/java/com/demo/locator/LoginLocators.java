package com.demo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLocators {
 WebDriver driver;
 
 
//constructor
 public LoginLocators (WebDriver driver){
  this.driver = driver;
 }

 //Webelement located
 public By username =By.id("user-message"); 
 public By btm =By.xpath("//button[text()= 'Show Message']");
 
 public WebElement getUsername()
 {
	 return driver.findElement(username);
 }
 
 public WebElement getbtn()
 {
	 return driver.findElement(btm);
 }
 
}
