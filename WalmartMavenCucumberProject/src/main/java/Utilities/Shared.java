package Utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Shared {

	public static void clickElement(WebElement e) {
		waitForElement(e).click();
	}

	public static void mouseHover(WebDriver dr, WebElement e) {
		Actions a = new Actions(dr);
		a.moveToElement(e).build().perform();

	}

	public static WebElement waitForElement(WebElement e) {
		ExpectedConditions.visibilityOf(e);
		return e;
	}

	public static void searchElements(WebElement e, String type) {
		waitForElement(e).sendKeys(type, Keys.ENTER);
	}

}
