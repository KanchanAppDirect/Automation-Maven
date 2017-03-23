package com.codebind;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import util.UtilClass;


public class AppTest {
	@Test
	public void test() throws Exception {
		try{
	    UtilClass util=new UtilClass();
        ChromeDriver driver=util.setDriver();
	    driver.get(util.getPageName());
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys(util.getSearchKey()); 
	
	   }
		catch(Exception e){
			e.printStackTrace(); 
		}

}
}

