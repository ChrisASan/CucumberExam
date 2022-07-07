package pages;

import org.junit.Assert;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodoPage {

	WebDriver driver;

	public TodoPage(WebDriver driver) {
		this.driver = driver;
	}

//	Element Library 
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']")
	WebElement SKYBLUE_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement SKYWHITE_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']")
	WebElement SKYBLUE_BACKGROUND_COLOR;
	@FindBy(how = How.CSS, using = "body[style='background-color: white;']")
	WebElement WHITE_BACKGROUND_COLOR;

//	Method Library

	public void validateSkyBlueBackgroundButton() {
		if (SKYBLUE_BUTTON_ELEMENT.isDisplayed()) {
			System.out.println("This skyblue button exist");
		} else {
			System.out.println("This skyblue button doesnt exist");
		}
		 
	}

	public void skyBlueBackgroundButton() {
		SKYBLUE_BUTTON_ELEMENT.click();
	}

	public void validateSkyBlueBackground() {
		Assert.assertTrue(SKYWHITE_BUTTON_ELEMENT.isDisplayed());
		if (SKYWHITE_BUTTON_ELEMENT.isDisplayed()) {
			System.out.println("This is skyblue background");
		} else {
			System.out.println("This is NOT skyblue background");
		}
	
}
	
	public void validateSkywhiteBackgroundButton() {
		if (SKYBLUE_BUTTON_ELEMENT.isDisplayed()) {
			System.out.println("This skywhite button exist");
		} else {
			System.out.println("This skywhite button doesnt exist");
		}
		
	}
	
	public void skywhiteBackgroundButton() {
		SKYWHITE_BUTTON_ELEMENT.click();
	}
	
	public void validateSkywhiteBackground() {
		Assert.assertTrue(SKYWHITE_BUTTON_ELEMENT.isDisplayed());
		if (SKYWHITE_BUTTON_ELEMENT.isDisplayed()) {
			System.out.println("This is skywhite background");
		} else {
			System.out.println("This is NOT skywhite background");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}