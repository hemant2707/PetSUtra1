package NewTestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import okio.Options;

public class Launch_Chrome 
{
	private WebDriver driver;
		@Test
			public void launch_chrome() throws InterruptedException
				{
					driver.navigate().to("https://petsutra.bytesbrick.com/");
					driver.findElement(By.xpath("")).click();
					String title = driver.getTitle();				 
					Assert.assertTrue(title.contains("PetSutra: Pet Store Online | Pet Products Online | Pet Shop Online"));
					Thread.sleep(3000);
				}
		@Test
			public void mouse_hover()
				{
					Actions action= new Actions(driver);
					WebElement Menuoptions1 = driver.findElement(By.linkText("Shop by Pet "));
					action.moveToElement(Menuoptions1).perform();
				}
		@BeforeTest
			public void beforetest()
				{
					String key="webdriver.chrome.driver";
					String value="./exefiles/chromedriver.exe";
					System.setProperty(key, value);
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					ChromeOptions Options = new ChromeOptions();
					Options.addArguments("--disable-notifications");
	
				}
		@AfterTest
			public void aftertest()
				{
					driver.quit();
				}
}
