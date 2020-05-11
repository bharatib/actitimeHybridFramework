package com.qa.actitimeUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.acttimeBase.DriverScript;

public class Common extends DriverScript{
	public static void highLightElement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border: 2px solid red;')",ele);
	}

}
