package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Shared;

public class WranglerJacketPage {
	private WebDriver dr;

	WranglerJacketPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "(//div[@class='option-overlay'])[2]")
	WebElement lightBlueColor;
	@FindBy(xpath = "(//div[@class='option-overlay'])[4]")
	WebElement mediumSize;
	@FindBy(xpath = "(//button[@data-automation-id='button'])[2]")
	WebElement addToCartButton;

	public void clickOnLightBlueColor() {
		lightBlueColor.click();
	}

	public void clickOnMediumSize() {
		Shared.clickElement(addToCartButton);
	}

	public void clickOnAddToCart() {
		addToCartButton.click();
	}
	
}
