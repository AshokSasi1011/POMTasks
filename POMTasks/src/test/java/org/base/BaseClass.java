package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {	
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	// driver basic set up
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}	
	public static void launchUrl(String url) {
		driver.get(url);
	}	
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}	
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public static void printTitle() {
		String t = driver.getTitle();
		System.out.println(t);
	}
	public static void quitBrowser() {
		driver.quit();		
	}
	

	
	// WebElements selenium methods
	public static void passCredentials(WebElement element, String value) {
		element.sendKeys(value);
	}	
	public static void click(WebElement element) {
		element.click();
	}			
	public static void printText(WebElement element) {
		String s = element.getText();
		System.out.println(s);
	}
	public static void printValue(WebElement element) {
		String s = element.getAttribute("value");
		System.out.println(s);
	}
	
	
	//Actions class methods
	
	public static void scrollDown(int val){		
		a = new Actions(driver);
		for (int i = 0; i < val; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		}
	}
	public static void scrollUp(int val){
		a = new Actions(driver);
		for (int i = 0; i < val; i++) {
			a.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
		}
	}	
	public static void mouseOverTo(WebElement element) {	
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}	
	public static void scrollTo(WebElement element) {
		a = new Actions(driver);
		a.scrollToElement(element).perform();
	}
	public static void rightClick(WebElement element) {
		a.contextClick(element).perform();
	}	
	
	//Robot class methods
	public static void downKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void enterKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//Select class
	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	//Window Handles
	public static void goToWindow(int ind) {
		Set <String> windowHandles = driver.getWindowHandles();
		List <String> l = new ArrayList();
		l.addAll(windowHandles);
		driver.switchTo().window(l.get(ind));
	}
	
}
