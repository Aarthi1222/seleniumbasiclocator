package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class createselectclss {

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
	     
	     WebElement sourceDD = driver.findElement(By.name("industryEnumId"));
	     Select select=new Select(sourceDD);
	     select.selectByValue("IND_SOFTWARE");
	     
	     
	     WebElement partnerDD=driver.findElement(By.name("ownershipEnumId"));
	     Select select1=new Select(partnerDD);
	     select1.selectByValue("OWN_SCORP");
	     
	     WebElement jobDD = driver.findElement(By.id("dataSourceId"));
	     Select select2=new Select(jobDD);
	     select2.selectByValue("LEAD_EMPLOYEE");
	     
	     WebElement marketDD = driver.findElement(By.id("marketingCampaignId"));
	     Select choose=new Select(marketDD);
	     choose.selectByIndex(6);
	     
	     WebElement provinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	     Select state=new Select(provinceDD);
	     state.selectByValue("TX");
	     
	     driver.findElement(By.partialLinkText("Create")).click();
	     
	     
	     System.out.println(accountname);
	     
	     }
}


