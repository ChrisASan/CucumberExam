package step;


import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.TodoPage;

public class TodoStepDefinition extends BasePage {
	
	TodoPage todoPage;
	
	@Before
	public void beforeRun() {
		initDriver();
		todoPage = PageFactory.initElements(driver, TodoPage.class);
		
	}
	
	@Given("^Set SkyBlue Background button exists$")
	public void button_exists(){
		todoPage.validateSkyBlueBackgroundButton();
		
	}
	
	@Given("^Set skywhite Background button exists$")
	public void set_skywhite_button_exists(){
		todoPage.validateSkywhiteBackground();
	}
	
	@When("^I click on the skyblue button$")
	public void i_click_on_the_skyblue_button() {
	    todoPage.skyBlueBackgroundButton();
	   
	}
	
	@When("^I click on the skywhite button$")
	public void i_click_on_the_skywhite_button() {
	   todoPage.skywhiteBackgroundButton();
		}
	

	@Then("^the background color will change to skyblue$")
	public void the_background_color_will_change_to_skyblue() {
	    todoPage.validateSkyBlueBackground();
	}

	@Then("^the background color will change to skywhite$")
	public void the_background_color_will_change_to_skywhite() {
		todoPage.validateSkywhiteBackground();
		}
	
	
	@After
	public void tearDDown() {
				tearDown();
}
	
}
