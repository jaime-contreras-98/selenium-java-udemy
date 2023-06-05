package main;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("browse")).click();

		Thread.sleep(2000);

		// AutoIT code gets compiled to .exe, then .getRuntime method will execute our
		// exe
		Runtime.getRuntime().exec("C:\\Users\\jaime.contreras\\Documents\\Programacion-QA\\AutoIT\\fileUpload.exe");
	}

}
