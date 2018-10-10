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
        WebDriver browser;
        browser = new ChromeDriver();
        browser.get("https://rozetka.com.ua/");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Igor\\Documents\\Java\\chromedriver\\chromedriver.exe");
        WebElement searchField = browser.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/input[1]"));
        WebElement searchButton = browser.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/button[1]"));
        searchField.sendKeys("компьютер");
        searchButton.sendKeys(Keys.RETURN);
//        assertTrue((searchField.isDisplayed()));
        browser.close();
    }
}
