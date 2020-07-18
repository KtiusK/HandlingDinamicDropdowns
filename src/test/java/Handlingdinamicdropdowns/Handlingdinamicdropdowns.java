package Handlingdinamicdropdowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdinamicdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Menu Dinámico
	
	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\MiscelaneosSelenium\\Handlingdinamicdropdowns\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://spicejet.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//Seleccione el elemento
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	
	Thread.sleep(3000);
	//Selección por indice 
	//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
	//Selección por padre e hijo 
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
}
}