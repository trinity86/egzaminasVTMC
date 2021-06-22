import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsInTablets {
    @org.junit.Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();

        //Atidarome visas prekes Tablets
        driver.findElement(By.linkText("Tablets")).click();
        //paspaudziame ant kiekvienos prekes ir patikriname ar available
        driver.findElement(By.xpath("//div[@class='caption']//a[1]")).click();
        driver.findElement(By.xpath("//li[text()='Availability: In Stock']"));
        driver.close();
    }
}