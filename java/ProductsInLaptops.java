import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductsInLaptops {
    @org.junit.Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();

        // Atidarome visas prekes Laptops and Notebooks
        driver.findElement(By.linkText("Laptops & Notebooks")).click();
        driver.findElement(By.linkText("Show All Laptops & Notebooks")).click();

        //paspaudziame ant kiekvienos prekes ir patikriname ar available
        driver.findElement(By.linkText("HP LP3065")).click();
        driver.findElement(By.xpath("//li[text()='Availability: In Stock']"));
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//li[text()='Availability: In Stock']"))
        );
        if (element.isDisplayed()) {
            System.out.println("Element found using text");
        } else {
            System.out.println("Element not found");
        }
        driver.navigate().back();
        driver.findElement(By.linkText("MacBook")).click();
        Assert.assertTrue(element.getText().contains("Availability: In Stock"));
        if (element.isDisplayed()) {
            System.out.println("Element found using text");
        } else {
            System.out.println("Element not found");
        }
        driver.navigate().back();
        driver.findElement(By.linkText("MacBook Air")).click();
        Assert.assertTrue(element.getText().contains("Availability: In Stock"));
        driver.navigate().back();
        driver.findElement(By.linkText("MacBook Pro")).click();
        Assert.assertTrue(element.getText().contains("Availability: In Stock"));
        driver.navigate().back();
        driver.findElement(By.linkText("Sony VAIO")).click();
        Assert.assertTrue(element.getText().contains("Availability: In Stock"));
driver.close();


    }
}