package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoatProducts {
	protected WebDriver dr;

	CoatProducts(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//a[@href='?query=coat&cat_id=5438_133197&grid=true']")
	WebElement clickOnMenFilter;

	public MenCoatProducts clickOnMenFilter() {
		clickOnMenFilter.click();
		return new MenCoatProducts(dr);
	}

}
