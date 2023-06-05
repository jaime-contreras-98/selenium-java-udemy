package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		driver.findElement(By.partialLinkText("Basic Auth")).click();
	}

}
