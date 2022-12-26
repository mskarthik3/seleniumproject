package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopCommercelogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		username.clear();
		username.sendKeys("admin@yourstore.com");
		password.clear();
		password.sendKeys("admin");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		String actual_title=driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		String expected_title="Dashboard";
		if(actual_title.equals(expected_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.quit();
				
		
	}

}
