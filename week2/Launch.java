package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("email")).sendKeys("aarthialagammai@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dfhynce");
		}
}
