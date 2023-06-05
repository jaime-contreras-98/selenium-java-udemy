package main;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		String path = System.getProperty("user.dir");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", path); // EDITA LA RUTA DE LA DESCARGA

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
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

		Thread.sleep(2000);

		File f = new File(path + "/FILE.zip"); // insert filename

		if (f.exists()) {
			// Assert.assertTrue(f.exists());

			System.out.println("File found! ");
			if (f.delete())
				System.out.println("File deleted");
		} else
			System.out.println("File not found :(");

		driver.quit();
	}
}
