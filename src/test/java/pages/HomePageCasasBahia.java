package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageCasasBahia {
    WebDriver driver;

    public HomePageCasasBahia(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchBox() {
        return driver.findElement(By.id("search-input"));
    }

    public WebElement getSuggestionList() {
        return driver.findElement(By.cssSelector("#combobox-list-Sugestões-1"));
    }
}
