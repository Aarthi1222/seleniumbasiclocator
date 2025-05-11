package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        driver.findElement(By.name("firstname")).sendKeys("vignesh");
        driver.findElement(By.name("lastname")).sendKeys("mr");
        
        WebElement dayDD = driver.findElement(By.id("day"));
        Select  birthd=new Select(dayDD);
        birthd.selectByValue("10");  
        
        WebElement elementDD = driver.findElement(By.id("month"));
        Select month=new Select(elementDD);
        month.selectByVisibleText("Jan");
        
        WebElement yearDD = driver.findElement(By.id("year"));
        Select year=new Select(yearDD);
        year.selectByVisibleText("2020");
        
        driver.findElement(By.name("reg_email__")).sendKeys("5684643514");
        driver.findElement(By.id("password_step_input")).sendKeys("tgfjyc");
        driver.findElement(By.name("websubmit")).click();
}
}