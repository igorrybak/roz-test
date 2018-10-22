//import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;


public class CheckRozetkaFindFieldTest {
    @Test
    public void search_field_is_work() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver browser;
        browser = new ChromeDriver();
        browser.get("https://rozetka.com.ua");
        WebElement searchField = browser.findElement(By.xpath("//input[@placeholder='Поиск']"));
        WebElement searchButton = browser.findElement(By.xpath("//button[@class='btn-link-i js-rz-search-button']"));
        searchField.sendKeys("компьютер");
        searchButton.sendKeys(Keys.RETURN);
//        assertTrue((searchField.isDisplayed()));
        browser.close();
    }
}
