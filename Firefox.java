package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Firefox\\Driver");
	WebDriver dr=new ChromeDriver();
	dr.get("https://letcode.in/signup");
	dr.manage().window().maximize();
	
	

}
	
}
