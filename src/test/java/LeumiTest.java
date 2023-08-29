import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeumiTest {
        WebDriver driver;
    ChromeOptions options;

        @BeforeMethod
    public void init() {
            options = new ChromeOptions();
            options.addArguments("--lang=he");
            options.addArguments("--charset=UTF-8");
             driver = new ChromeDriver(options);

            driver.navigate().to("https://www.leumi.co.il/");

        }

        @Test
    public void testPrint(){
        //    driver.switchTo().frame("frameId");
            WebElement locator = driver.findElement(By.xpath("//span[.='פרטי']"));
            String locatorText = locator.getText();
            System.out.println(locatorText);
        }

        @AfterMethod
    public void tearDown() {
            driver.quit();
        }

//    WebDriver wd;
//
//    @Test
//    public void testLeumi() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--charset=UTF-8");
//       WebDriver driver = new ChromeDriver(options);
//
//       wd = new ChromeDriver();
//        wd.navigate().to("https://www.leumi.co.il/");
//        WebElement locator = wd.findElement(By.xpath("//span[contains(text(),'פרטי')]"));
//        String locatorText = locator.getText();
//        System.out.println(locatorText);
//    }
}
