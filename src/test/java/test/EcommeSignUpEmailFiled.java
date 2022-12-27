package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.EcommePageTesting;
import page.EcommmCommenPage;
import utils.Driver;
import utils.TestDataReader;

public class EcommeSignUpEmailFiled {
	public void SignUpWithEmailtest() {  
		  Driver.getDriver().get(TestDataReader.getProperty("appurl"));
		  EcommmCommenPage Epage = new EcommmCommenPage();
		  EcommePageTesting page = new EcommePageTesting();  
		  Epage.welcomeLink.click();
		  Epage.signUpButton.click();
		  page.emailField.sendKeys(TestDataReader.getProperty("emailChar"));  
		  page.firstNameField.sendKeys("Faris");
		  page.lastNameField.sendKeys("Mohammed");
		  page.passwordField.sendKeys("Hello World");
		 page.signUpBtn.click();
		  Assert.assertEquals(page.emailGreaterEreor.getText(),"The email may not be greater than 125 characters."); 
	}
}