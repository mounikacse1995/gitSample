package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class lisence {
	private WebElement issueDate;
	private WebElement productEdition;
	public lisence(WebDriver driver)
	{
		productEdition=driver.findElement(By.xpath("//nobr[contains(text(),'Product Edition:')]/../../td[2]"));
		issueDate=driver.findElement(By.xpath("//nobr[contains(text(),'Issue Date:')]/../../td[2]"));
	}

public void verifyIssueDate()
{
	String eIssueDate="Aug 04, 2011";
	String aIssueDate = issueDate.getText();
	if(aIssueDate.equals(eIssueDate))
	{
		System.out.println("Verified IssueDate TestCase is Passed");
	}
	else
	{
		System.out.println("Verified IssueDate TestCase is Failed");
	}
}
public void verifyProductEdition()
{
	String eProductEdition="actiTIME v3.1 ( Purchase an upgrade )";
	String aProductEdition = productEdition.getText();
	if(aProductEdition.equals(eProductEdition))
	{
		System.out.println("Verified ProductEdition TestCase is Passed");
	}
	else
	{
		System.out.println("Verified ProductEdition TestCase is Failed");
	}
}
}
