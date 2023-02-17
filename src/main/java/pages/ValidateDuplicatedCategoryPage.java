package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateDuplicatedCategoryPage {

	WebDriver driver;

	public ValidateDuplicatedCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='categorydata']")
	WebElement addCategoryInput;

	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement addCategoryBtn;
	
	@FindBy(how = How.CSS, using = "a[href='javascript:history.back();']")
	WebElement neverMind;

	public void addDuplicateCategory(String categoryName) {

		addCategoryInput.sendKeys(categoryName);
		addCategoryBtn.click();
	}

	public String verifyDuplicateAdded() {

		return driver.findElement(By.tagName("body")).getText();
		
	}

}
