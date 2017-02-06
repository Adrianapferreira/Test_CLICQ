package clicq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://clicq.paripassu.com.br/");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath(".//*[@id='usuario']")).sendKeys("adriana.ferreira0816@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("lancelot#0109$fafuka");
		
		driver.findElement(By.xpath(".//*[@id='submit-login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='navigation']/ul/li[2]/a")));
		element.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='navigation']/ul/li[2]/ul/li[3]/a")));
		element1.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='webBody']/div[1]/div[1]/div[3]/div/div/div/div/div[1]/div/div[3]/ul/li/a")));
		element2.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		WebElement element3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Analista de Qualidade")));	
		element3.click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement element4 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='webBody']/div[1]/div[1]/div[3]/div/div/div/div[2]/form/div[3]/div/div[1]/div[2]/div/div[1]/field-directive/textarea")));
		element4.sendKeys("Adriana");
		
		WebDriverWait wait5 = new WebDriverWait(driver, 30);
		WebElement element5 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='webBody']/div[1]/div[1]/div[3]/div/div/div/div[2]/form/div[3]/div/div[1]/div[2]/div/div[2]/field-directive/textarea")));
		element5.sendKeys("adriana@gmail.com");

	}

}
