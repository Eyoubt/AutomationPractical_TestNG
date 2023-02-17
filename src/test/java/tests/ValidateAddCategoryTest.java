package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ValidateAddCategoryPage;
import testComponents.BaseTest;

public class ValidateAddCategoryTest extends BaseTest {

	ValidateAddCategoryPage validateAddCategoryPage;

	@Test
	public void validateAddCategory() {
		validateAddCategoryPage = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		validateAddCategoryPage.addCategory("TestNGByEyoub");
		Assert.assertTrue(validateAddCategoryPage.verifyCategoryAdded("TestNGByEyoub"));
	}

}
