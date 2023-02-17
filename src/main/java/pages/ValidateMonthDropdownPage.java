package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ValidateMonthDropdownPage {

	WebDriver driver;

	public ValidateMonthDropdownPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "select[name='due_month']")
	WebElement dueMonth;

	public boolean monthDropdown() {

		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		boolean match = true;

		Select sel = new Select(dueMonth);

		List<WebElement> monthsElement = sel.getOptions();

		for (int i = 1; i < monthsElement.size(); i++) {
			String monthText = monthsElement.get(i).getText();
			String monthList = months[i - 1];
			if (monthText.equals(monthList)) {
				System.out.println(monthText);
				match = true;
			} else {
				match = false;
				break;
			}

		}

		return match;

	}
}
