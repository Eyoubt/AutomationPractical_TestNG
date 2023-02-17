package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateAddCategoryPage {

	WebDriver driver;

	public ValidateAddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='categorydata']")
	WebElement addCategoryInput;

	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement addCategoryBtn;

	public void addCategory(String categoryName) {

		addCategoryInput.sendKeys(categoryName);
		addCategoryBtn.click();
	}

	public boolean verifyCategoryAdded(String categoryName) {

		return driver.findElement(By.linkText(categoryName)).isDisplayed();
	}

}
