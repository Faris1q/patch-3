package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class EcommmCommenPage { 
	
	public EcommmCommenPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
		
		

		
		@FindBy (linkText = "Welcome!")
		public WebElement welcomeLink;
		
		@FindBy (xpath = "//button[text()='Login']")
		public WebElement loginButton;
		
		@FindBy (xpath = "//button[text()='Sign Up']")
		public WebElement signUpButton; 

}
