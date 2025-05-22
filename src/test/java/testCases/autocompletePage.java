package testCases;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

public class autocompletePage {

	WebDriver driver;

	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void autocompleteSuggestions() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get("https://www.amazon.com.br/");

		HomePage home = new HomePage(driver);
		home.getSearchBox().sendKeys("livro");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-suggestion")));

		List<WebElement> suggestions = driver.findElements(By.cssSelector(".s-suggestion"));
		assertTrue(suggestions.size() > 0, "Deveria haver sugestões de autocomplete");
	}

	@AfterEach
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
