package Week4day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions builder = new Actions(driver);
		builder.click().perform();
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions builder1 = new Actions(driver);
		builder1.dragAndDrop(drag, drop).perform();
	}

}
