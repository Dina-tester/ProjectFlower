package org.flo;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassA {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Ellipse - Gtech\\program\\FlowerProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fleurop.nl/inloggen/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("dlgcdina@gmail.com");
		driver.findElement(By.id("password")).sendKeys("D@12345678");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File copy = tk.getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\Ellipse - Gtech\\LOGIN.png");
	    FileUtils.copyFile(copy,dest);
		
		//Type caste driver to javaScript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement logc = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/section[1]/form/div[4]/button"));
		js.executeScript("arguments[0].click()",logc);
		
		File copy1 = tk.getScreenshotAs(OutputType.FILE);
		File dest1= new File("E:\\Ellipse - Gtech\\PAGE1.png");
	    FileUtils.copyFile(copy1,dest1);
		
		//clicking rose models
		driver.findElement(By.xpath("(//a[@href=\"/bloemen-bestellen/rozen/\"])[2]")).click();
		
		File copy2= tk.getScreenshotAs(OutputType.FILE);
		File dest2= new File("E:\\Ellipse - Gtech\\PAGE2.png");
	    FileUtils.copyFile(copy2,dest2);
		
		//selecting using javaScript 	
		WebElement floclick=driver.findElement(By.xpath("//img[@alt='Lieflijk rode roos']"));
		js.executeScript("arguments[0].scrollIntoView(true)",floclick);
		
		File copy3= tk.getScreenshotAs(OutputType.FILE);
		File dest3= new File("E:\\Ellipse - Gtech\\PAGE3.png");
	    FileUtils.copyFile(copy3,dest3);
		js.executeScript("arguments[0].click()",floclick);
		
		
		WebElement size= driver.findElement(By.xpath("//select[@name='price']"));
		// Typecast 
		Select s= new Select(size);
		s.selectByVisibleText("Klein");
		
		WebElement quantity = driver.findElement(By.id("order_item_number"));
		Select s1= new Select(quantity);
		s1.selectByVisibleText("2");
		
		driver.findElement(By.id("card_text")).sendKeys("HAPPY NEW YEAR 20-20");
		
		File copy4= tk.getScreenshotAs(OutputType.FILE);
		File dest4= new File("E:\\Ellipse - Gtech\\PAGE4.png");
	    FileUtils.copyFile(copy4,dest4);
		
		
		WebElement d=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",d); // To scroll down
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		WebElement d1=driver.findElement(By.id("nextStep"));
		js.executeScript("arguments[0].scrollIntoView(true)",d1);
		
		File copy5= tk.getScreenshotAs(OutputType.FILE);
		File dest5= new File("E:\\Ellipse - Gtech\\PAGE5.png");
	    FileUtils.copyFile(copy5,dest5);
		
		driver.findElement(By.id("nextStep")).click();
		
		WebElement addty= driver.findElement(By.id("delivery_b2c_b2b"));
		Select s2= new Select(addty);
		s2.selectByIndex(1);
		
		WebElement comname = driver.findElement(By.id("delivery_company_name"));
		comname.sendKeys("TELE2");
		
		WebElement dept = driver.findElement(By.id("delivery_department"));
		dept.sendKeys("Telecom");
		
		WebElement gender= driver.findElement(By.id("delivery_gender"));
		Select s3= new Select(gender);
		s3.selectByIndex(3);
		
		WebElement fname = driver.findElement(By.id("delivery_firstname"));
		fname.sendKeys("Sham");
		
		
		WebElement lname = driver.findElement(By.id("delivery_lastname"));
		lname.sendKeys("Family");
		
		driver.findElement(By.id("delivery_telephone")).sendKeys("0612123123");
		
		driver.findElement(By.id("delivery_zipcode")).sendKeys("3511BT");
		driver.findElement(By.id("delivery_address_number")).sendKeys("400");
		//driver.findElement(By.id("delivery_address_suffix")).sendKeys("A");
		driver.findElement(By.id("delivery_customer_telephone")).sendKeys("0734561245");
		
		File copy6= tk.getScreenshotAs(OutputType.FILE);
		File dest6= new File("E:\\Ellipse - Gtech\\PAGE6.png");
	    FileUtils.copyFile(copy6,dest6);
		
		WebElement telno=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",telno);
		telno.click();
		
		File copy7= tk.getScreenshotAs(OutputType.FILE);
		File dest7= new File("E:\\Ellipse - Gtech\\PAGE7.png");
	    FileUtils.copyFile(copy7,dest7);
		
		Thread.sleep(8000);
		driver.close();
			
					
		}

}
