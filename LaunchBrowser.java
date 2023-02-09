package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vicky");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vignesh");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4 LPA");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("865758");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is testleaf organisation");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("best organisation");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("aravind");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kg");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("kg");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("18-08-2001");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("developer");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("d");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("302");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kgvignesh827@gamil.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6369676877");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("vickyy");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("aravind");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("hari");
		driver.findElement(By.name("generalAddress1")).sendKeys("121,small street");
		driver.findElement(By.name("generalAddress2")).sendKeys("r.k.pet");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Thiruthani");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("631303");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("631302");
		//driver.findElement(By.name("submitButton")).click();
		
	
		
		
		
	}


				
	
}
