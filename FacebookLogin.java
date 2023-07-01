package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nethra");
		driver.findElement(By.name("lastname")).sendKeys("V");
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abcdef");
		WebElement source = driver.findElement(By.id("day"));
		Select drop1=new Select(source);
		drop1.selectByValue("28");
		WebElement source1 = driver.findElement(By.id("month"));
		Select drop2=new Select(source1);
		drop2.selectByValue("1");
		WebElement source2 = driver.findElement(By.id("year"));
		Select drop3 = new Select(source2);
		drop3.selectByValue("2000");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.close();
		
}

}
