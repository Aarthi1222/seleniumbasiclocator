package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {


	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.name("firstName")).sendKeys("Meena");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meena");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("km");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");
		driver.findElement(By.partialLinkText("Create")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
