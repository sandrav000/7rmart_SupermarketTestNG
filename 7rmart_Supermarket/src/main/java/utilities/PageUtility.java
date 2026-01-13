package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByVisibleTextMethod(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	public void selectByValueMethod(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public void selectByIndexMethod(WebElement element, Integer index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void dragAndDropMethod(WebDriver driver, WebElement source, WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).perform();
	}

	public void rightClickMethod(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void doubleClickMethod(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void mouseHoverMethod(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void clickMethod(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.click(element).perform();
	}

	public void javascriptExecutorsendKeysMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='value';", element);
	}

	public void javascriptExecutorClickMethod(WebDriver driver, WebElement webelementname) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", webelementname);
	}

	public void javaScriptExecutorScrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
	}

	public void javaScriptExecutorScrollUp(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-150)", "");
	}

	public void javaScriptExecutorScrollToBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}

}
