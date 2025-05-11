package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAcc {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.partialLinkText("Create")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Meena");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.id("numberEmployees")).sendKeys("fourty");
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTabs");
	    driver.findElement(By.partialLinkText("Create")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}
}