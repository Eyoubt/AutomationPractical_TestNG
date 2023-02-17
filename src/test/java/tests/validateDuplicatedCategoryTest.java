package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ValidateDuplicatedCategoryPage;
import testComponents.BaseTest;

public class validateDuplicatedCategoryTest extends BaseTest {

	String catName = "TestNGByEyoub";

	@Test
	public void addDuplicateCategory() {

		ValidateDuplicatedCategoryPage validateDuplicatedCategoryPage = PageFactory.initElements(driver,
				ValidateDuplicatedCategoryPage.class);
		validateDuplicatedCategoryPage.addDuplicateCategory(catName);

		Assert.assertEquals(validateDuplicatedCategoryPage.verifyDuplicateAdded(),
				"The category you want to add already exists:" + catName);
		
	}

}
