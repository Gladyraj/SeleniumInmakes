package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sam.BaseClass;

public class ScLogin {
	
	
	
	public ScLogin() {
		
	}
	
	@FindBy(xpath = "//input[@name='form_fields[name]']")
     private WebElement name;

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}





	@FindBy(xpath = "//input[@id='form-field-field_ea2bfcd']")
	private WebElement email;

}
