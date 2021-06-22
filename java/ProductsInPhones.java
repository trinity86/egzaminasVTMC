import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsInPhones {
    @org.junit.Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();
        //Atidarome visas prekes Phones and PDAs
        driver.findElement(By.linkText("Phones & PDAs")).click();
        driver.findElement(By.linkText("HTC Touch HD")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("iPhone")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Palm Treo Pro")).click();


        driver.close();
    }
}