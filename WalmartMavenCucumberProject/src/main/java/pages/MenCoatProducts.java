package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenCoatProducts {
	private WebDriver dr;

	MenCoatProducts(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "(//a[@href='/ip/Men-s-Denim-Jacket/55767215'])[1]")
	WebElement clickOnWranglerJacket;

	public WranglerJacketPage clickOnWranglerJacket() {
		clickOnWranglerJacket.click();
		return new WranglerJacketPage(dr);
	}

}
