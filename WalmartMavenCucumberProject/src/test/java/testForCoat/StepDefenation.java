package testForCoat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CoatProducts;
import pages.HomePage;
import pages.MenCoatProducts;
import pages.WranglerJacketPage;

public class StepDefenation extends BaseTest {
	HomePage homePage;
	CoatProducts coatProducts;
	MenCoatProducts menCoatProducts;
	WranglerJacketPage wranglerJacketPage;
	
	@Given("^open a browser$")
	public void open_a_browser() throws Throwable {
		openBrowser();
	}

	@Given("^go to walmart\\.com$")
	public void go_to_walmart_com() throws Throwable {
		
	}

	@When("^user type coat in search button$")
	public void user_type_coat_in_search_button() throws Throwable {
		Thread.sleep(2000);
		homePage= new HomePage(dr);
		coatProducts=homePage.typeOnSearch();
	}

	

	@When("^select man filter$")
	public void select_man_filter() throws Throwable {
		Thread.sleep(2000);
		menCoatProducts=coatProducts.clickOnMenFilter();
	}

	@When("^click on wrangler jacket$")
	public void click_on_wrangler_jacket() throws Throwable {
		Thread.sleep(2000);
		wranglerJacketPage=menCoatProducts.clickOnWranglerJacket();
	}

	@When("^choose light blue color and medium size$")
	public void choose_light_blue_color_and_medium_size() throws Throwable {
		Thread.sleep(2000);
		wranglerJacketPage.clickOnLightBlueColor();
		wranglerJacketPage.clickOnMediumSize();
	}

	@When("^click add to cart$")
	public void click_add_to_cart() throws Throwable {
		wranglerJacketPage.clickOnAddToCart();
	}

	@When("^click on the continue shopping button$")
	public void click_on_the_continue_shopping_button() throws Throwable {

	}

	@Then("^click on home page again$")
	public void click_on_home_page_again() throws Throwable {
		System.out.println("fhdjohoi");
	}

}
