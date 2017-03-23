package util;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class UtilClass {
	
	String pagename;
	String searchKey;
	
	public String getSearchKey() {
		return this.searchKey;
	}
	
	public String getPageName(){
		return this.pagename;
	}
	
	public ChromeDriver setDriver() throws Exception{
		Properties prop = new Properties();
		InputStream input = null;
		 ChromeDriver driver = null;
		try {
			
			File fl = new File("/Users/kanchan.sharma/Documents/workspace/maven.demo/src/test/java/com/codebind/configuration.properties");
			input = new FileInputStream(fl);
			prop.load(input);
				        pagename=prop.getProperty("pagename");
			             searchKey=prop.getProperty("searchKey");
	                     System.setProperty(prop.getProperty("drivername"),prop.getProperty("path"));
	                     driver = new  ChromeDriver();
              }
		       catch(Exception e){
			   e.printStackTrace();
		      }
		      return driver;
}
}