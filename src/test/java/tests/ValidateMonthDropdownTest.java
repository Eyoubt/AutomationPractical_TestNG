package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ValidateMonthDropdownPage;
import testComponents.BaseTest;

public class ValidateMonthDropdownTest extends BaseTest {

	@Test
	public void validateMonthDropdownTest() throws InterruptedException {
		ValidateMonthDropdownPage validateMonthDropdownPage = PageFactory.initElements(driver,
				ValidateMonthDropdownPage.class);

		Assert.assertTrue(validateMonthDropdownPage.monthDropdown(), "Month not found");

	}
}
