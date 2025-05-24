package testCases;

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

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import java.util.List;

public class AutoCompleteTest {

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void autocompleteSuggestions() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://www.casasbahia.com.br/");

        HomePage home = new HomePage(driver);
        home.getSearchBox().sendKeys("livro");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#combobox-list-Sugestões-1")));

        List<WebElement> suggestions = driver.findElements(By.cssSelector("#combobox-list-Sugestões-1"));
        assertTrue(suggestions.size() > 0, "Deveria haver sugestões de autocomplete");
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}