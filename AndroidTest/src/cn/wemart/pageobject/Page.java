package cn.wemart.pageobject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

/**
 * 
 * @author sean
 *
 */

public class Page {
	protected WebDriver driver;
	
	public Page(WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * 
	 * @param driver
	 * @param key
	 * @return 返回页面元素是否存在
	 */
	public boolean waitToDisplayed(WebDriver driver,final By key,String Element){
		boolean waitDisplayed = false;
		try{
			waitDisplayed = new WebDriverWait(driver, 5).until(new ExpectedCondition<Boolean>()
				{
                    public Boolean apply(WebDriver d) {
                        return d.findElement(key).isDisplayed();
                    }
                });}
		catch(Exception e){	
			System.out.println(key+" Not Displayed");
		}
		if(!waitDisplayed){
			driver.close();
			driver.quit();
			AssertJUnit.fail("页面中不存在： "+Element);
		}
		return waitDisplayed;
	}
	
	/**
	 * 
	 * @param drvier
	 * @param key
	 * @return 返回页面元素
	 */
	public WebElement getElement (WebDriver drvier,By key,String Element){
		WebElement element = null;
		if(this.waitToDisplayed(driver, key,Element)){
			element = driver.findElement(key);
		}
		return element;
	}
	
	
	/**
	 * 
	 * @param drvier
	 * @param key
	 * @return 返回页面元素组
	 */
	public List<WebElement> getElements (WebDriver drvier,By key,String Element){
		List<WebElement> element = null;
		if(this.waitToDisplayed(driver, key,Element)){
			element = driver.findElements(key);
		}
		return element;
	}

}
