package generics;

import org.openqa.selenium.WebDriver;

public class PUtils {
	public static void verifyPage(WebDriver driver,String eTitle)
	{
		String aTitle=driver.getTitle();
		if(eTitle.equals(aTitle))
		{
			System.out.println("The title page is displayed"+eTitle);
		}
		else
		{
			System.out.println("The title page is not displayed"+aTitle);
		}
	}

}
