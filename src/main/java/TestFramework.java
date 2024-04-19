import org.openqa.selenium.Alert;
import org. openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestFramework{
        ChromeDriver driver= new ChromeDriver();


        @BeforeTest
        public void setup() throws InterruptedException {
            driver.get("https://www.letskodeit.com/practice");
            driver.manage().window().maximize();
            Thread.sleep(10000);

        }

        @AfterTest
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void testCheckBoxes() throws InterruptedException {
            driver.findElement(By.xpath("//input[@type= 'checkbox' and @value= 'benz']")).click();
            Thread.sleep(10000);

        }



}
