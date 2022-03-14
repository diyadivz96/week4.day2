package Week4day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement item1 = driver.findElement(By.xpath("//ul[@id='sortable']//li[1]"));
		Actions builder = new Actions(driver);
		builder.click().perform();
		WebElement item4 = driver.findElement(By.xpath("//ul[@id='sortable']//li[4]"));
		builder.clickAndHold(item4).dragAndDrop(item1, item4).build().perform();

	}

}
