package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Shared;

public class HomePage {
	protected WebDriver dr;

	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//input[@id='global-search-input']")
	WebElement typeOnSearch;
	@FindBy(xpath = "//button[@data-tl-id='GlobalHeaderSearchbar-submit']")
	WebElement clickOnSearch;

	public CoatProducts typeOnSearch() {
		Shared.searchElements(typeOnSearch, "coat");
		return new CoatProducts(dr);
	}

}
