package com.Adactin_Project_batch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		// Browser_Launch

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		// return driver;

		return driver;

	}

	// getUrl

	public static void getUrl(String Url) {

		driver.get(Url);

	}

	// navigateTo

	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	// currentUrl

	public static void getcurrentUrl() {

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);
	}

	// back

	public static void naviagteBack() {

		driver.navigate().back();
	}

	// forward

	public static void navigateForward() {

		driver.navigate().forward();

	}

	// refresh

	public static void navigateRefresh() {

		driver.navigate().refresh();

	}

	// close

	public static void close() {

		driver.close();

	}

	// quit

	public static void quit() {

		driver.quit();

	}

	// getTitle

	public static void getTitle() {

		String title2 = driver.getTitle();

		System.out.println(title2);
	}

	// getText

	public static void getText(WebElement element) {

		String text = element.getText();

		System.out.println(text);

	}

	// checkBox

	public static void checkBox(WebElement element) {

		element.click();
	}

	// is Enabled

	public static void isEnabled(WebElement element) {

		boolean enabled = element.isEnabled();

		System.out.println(enabled);
	}

	// isDisplayed

	public static void isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		System.out.println(displayed);
	}

	// is Selected

	public static void isSelected(WebElement element) {

		boolean selected = element.isSelected();

		System.out.println(selected);
	}

	// sendKeys

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	// click

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	// Radio

	public static void radioButton(WebElement element) {
		element.click();
	}

	// clear

	public static void clear(WebElement element) {

		element.clear();

	}

	// getAttributes

	public static void getAttributes(WebElement element, String value, String options) {

		if (value.equalsIgnoreCase("value")) {

			String attribute = element.getAttribute(options);

			System.out.println(attribute);

		} else if (value.equalsIgnoreCase("name")) {

			String attribute = element.getAttribute(options);

			System.out.println(attribute);
		}
	}

	// wait

	public static void wait(int w) {

		driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);

	}

	// explicit wait

	public static void explicitWait1(WebElement element, int w) {

		WebDriverWait wait = new WebDriverWait(driver, w);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// singleDropDown
	// public static Select dropdown(WebElement element,int key,Object value) {
	// Select s=new Select(element);
	// switch (key) {
	// case 1:
//		System.out.println("case1");
//		s.selectByVisibleText((String)value);
//		break;
	// case 2:
//		System.out.println("case2");
//		s.selectByValue((String)value);
//		break;
	// case 3:
//		System.out.println("case3");
//		s.selectByIndex((int)value);
//		break;
	// }
	// return s;

	// }

	// is Multiple

	public static void isMultiple(WebElement element) {

		Select s = new Select(element);

		boolean multiple = s.isMultiple();

		System.out.println(multiple);

	}

	/*
	 * // multiple dropDown
	 * 
	 * //public static List<WebElement> getAllOptions(WebElement element, String
	 * size) {
	 * 
	 * public static void getAllOptions(WebElement element,String size)
	 * 
	 * Select s = new Select(element);
	 * 
	 * //List<WebElement> options = s.getOptions();
	 * 
	 * //java.util.List<WebElement> options = s.getOptions();
	 * 
	 * System.out.println("***** LIST OF OPTIONS *******");
	 * 
	 * for (WebElement geto : options) {
	 * 
	 * String text = geto.getText();
	 * 
	 * System.out.println(text); } int size1 = options.size();
	 * 
	 * System.out.println("size1 :" + size1);
	 * 
	 * return options; }
	 */

	// GetAllSelectedOptions

	public static void getAllSelected(WebElement element, String options, String value) {

		Select s = new Select(element);

		if (options.equalsIgnoreCase("index")) {

			int parseInt = Integer.parseInt(value);

			s.selectByIndex(parseInt);
		}
		/*
		 * List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		 * 
		 * System.out.println("**** ALL SELECTED ******");
		 * 
		 * for (WebElement selected : allSelectedOptions) {
		 * 
		 * String text1 = selected.getText();
		 * 
		 * System.out.println(text1); }
		 */
	}

	// getFirstselected

	public static void getFirstSelected(WebElement element) {

		Select s = new Select(element);

		System.out.println("****** FIRST SELECTED ********");

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		System.out.println(firstSelectedOption.getText());

	}

	// Drop down

	public static void dropDown(WebElement element, String options, String value) {

		Select s = new Select(element);

		if (options.equalsIgnoreCase("value")) {

			s.selectByValue(value);

		} else if (options.equalsIgnoreCase("text")) {

			s.selectByVisibleText(value);

		} else if (options.equalsIgnoreCase("index")) {

			int parseInt = Integer.parseInt(value);

			s.selectByIndex(parseInt);

		}
	}

	// screenshot

	public static void takeSnap(String folder) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(folder);

		FileUtils.copyFile(source, destination);
	}

	// Actions

	public static void mouseOver(WebElement element, String act) {

		Actions a = new Actions(driver);

		if (act.equalsIgnoreCase("move")) {

			a.moveToElement(element).build().perform();

		} else if (act.equalsIgnoreCase("click")) {

			a.click(element).build().perform();

		} else if (act.equalsIgnoreCase("rightclick")) {

			a.contextClick().build().perform();
		}
	}

	// Alert

	public static void alert(String alt) {

		Alert alert = driver.switchTo().alert();

		if (alt.equalsIgnoreCase("accept")) {

			alert.accept();

		} else if (alt.equalsIgnoreCase("dismiss")) {

			alert.dismiss();

		} else if (alt.equalsIgnoreCase("text")) {

			String text = alert.getText();

			System.out.println(text);
		}
	}

	// robot

	public static void robot(WebElement element, String type) throws AWTException {

		Robot r = new Robot();
		{
			if (type.equalsIgnoreCase("down")) {

				r.keyPress(KeyEvent.VK_DOWN);

				r.keyRelease(KeyEvent.VK_DOWN);

			} else if (type.equalsIgnoreCase("enter")) {

				r.keyPress(KeyEvent.VK_ENTER);

				r.keyRelease(KeyEvent.VK_ENTER);

			}
		}

	}

	// windowsHandles

	public static Set<String> windowsHandles() {

		String windowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String all : windowHandles) {

			String title = driver.switchTo().window(all).getTitle();

			System.out.println(title);
		}

		return windowHandles;

	}

	// frames

	public static void frames(WebElement element) {

		driver.switchTo().frame(element);

	}

	// Main Frame

	public static void mainFrame() {

		driver.switchTo().defaultContent();

	}

	// scroll

	public static void scroll(WebElement element, String option) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (option.equalsIgnoreCase("view")) {

			js.executeScript("arguments[0].scrollIntoView()", element);

		} else if (option.equalsIgnoreCase("pixel")) {

			js.executeScript("window.scrollBy(0,1000)");
		}

	}

	// Windows handles1

	public static void windowHandles(String type, String destination) {

		if (type.equalsIgnoreCase("singleWindow")) {

			String windowHandle = driver.getWindowHandle();

			System.out.println(windowHandle);

		} else if (type.equalsIgnoreCase("multiwindow")) {

			Set<String> windowHandles = driver.getWindowHandles();

			for (String all : windowHandles) {

				System.out.println(all);

				String title = driver.switchTo().window(all).getTitle();

				System.out.println(title);

			}
			String actualTitle = destination;

			for (String all : windowHandles) {
				if (driver.switchTo().window(all).getTitle().equalsIgnoreCase(destination)) {
					break;

				}
			}
		}
	}
}
