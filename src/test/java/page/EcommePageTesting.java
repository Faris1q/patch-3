package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class EcommePageTesting {
	
	 public EcommePageTesting() {
			PageFactory.initElements(Driver.getDriver(), this);
		} 
		 @FindBy (xpath = "//h2[text()='Sign Up']")
			public WebElement signupText;
			
			@FindBy (xpath = "//label[text()='Email Address']")
			public WebElement emailFieldLabel;
			
			@FindBy (name = "email")
			public WebElement emailField;
			
			@FindBy (xpath = "//label[text()='First Name']")
			public WebElement firstNameLabel;
			
			@FindBy (name = "firstName")
			public WebElement firstNameField;
			
			@FindBy (xpath = "//label[text()='Last Name']")
			public WebElement lastNameLabel;
			
			@FindBy (name = "lastName")
			public WebElement lastNameField;
			
			@FindBy (xpath = "//label[text()='Password']")
			public WebElement passwordLabel;
			
			@FindBy (name = "password")
			public WebElement passwordField; 
			@FindBy (xpath = "//span[text()='The email may not be greater than 125 characters.']")
			public WebElement emailGreaterEreor;
			@FindBy (xpath = "//span[text()='Sign Up']")
			public WebElement signUpBtn; 
			
			@FindBy (xpath = "//span[text()='Please enter a valid email address.']")
			public WebElement emailFMessage; 
			@FindBy (xpath = "//span[contains(text(),'The firstName may not be greater than 50 character')]")
			public WebElement FirstnamereqChar; 
			@FindBy (xpath = "//span[text()='The firstName format is invalid.']")
			public WebElement firstnameformat; 
			@FindBy (xpath = "//span[contains(text(),'The lastName may not be greater than 50 characters')]")
			public WebElement lastnameChar;
			@FindBy (xpath = "//span[normalize-space()='The lastName format is invalid.']")
			public WebElement lastNameFormat;
			

	}

