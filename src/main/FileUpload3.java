package main;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("browse")).click();

		Thread.sleep(2000);

		// AutoIT code gets compiled to .exe, then .getRuntime method will execute our
		// exe
		Runtime.getRuntime().exec("C:\\Users\\jaime.contreras\\Documents\\Programacion-QA\\AutoIT\\fileUpload.exe");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-6 text-start']/span")));

		driver.findElement(By.id("submit_btn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))); // element on download section

		driver.findElement(By.id("")).click(); // download btn

		File f = new File("C:\\Users\\jaime.contreras\\FILE.zip"); // insert filename

		if (f.exists())
			System.out.println("File found! ");
		else
			System.out.println("File not found :(");

		driver.quit();
	}

}
