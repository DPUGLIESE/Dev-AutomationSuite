package Main;

import java.util.ArrayList;

import org.browsermob.core.har.Har;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiteData {
	
	//The url that the webdriver loaded
	public String url;
	//The driver object
	public WebDriver driver;
	//The sourcecode of the site
	public String sourceCode;
	//All the elements of the site
	public ArrayList<WebElement> elements;
	//The traffic  while the site was loading
	public Har traffic;

}
