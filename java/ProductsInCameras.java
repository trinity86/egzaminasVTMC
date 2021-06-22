import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsInCameras {
    @org.junit.Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        //Atidarome visas prekes Cameras
        driver.findElement(By.linkText("Cameras")).click();
        driver.findElement(By.linkText("Canon EOS 5D")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Nikon D300")).click();

        driver.close();
    }
}