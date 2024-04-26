import org.openqa.selenium.Alert;
import org. openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Set;

public class TestFramework {
    ChromeDriver driver = new ChromeDriver();


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

    @Test
    public void testRadioButtons() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type= 'radio' and @value= 'benz']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type= 'radio' and @value= 'bmw']")).click();
        Thread.sleep(5000);
    }


    @Test
    public void testDropdown() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.id("carselect")));
        //select value
        dropdown.selectByValue("bmw");
        Thread.sleep(5000);
        //select VisibleText
        dropdown.selectByVisibleText("Benz");
        Thread.sleep(5000);
        //select By Index
        dropdown.selectByIndex(2);
        Thread.sleep(5000);

    }

    @Test
    public void testAlert() {
        WebElement alertButton = driver.findElement(By.id("alertbtn"));
        alertButton.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }

    @Test
    public void testConfirmAlert() throws InterruptedException {
        WebElement alertButton = driver.findElement(By.id("confirmbtn"));
        Thread.sleep(5000);
        alertButton.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }

    @Test
    public void testTabs() throws InterruptedException {
        String currentHandle = driver.getWindowHandle();
        driver.findElement(By.id("opentab")).click();
        Thread.sleep(5000);
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
                System.out.println(driver.getCurrentUrl());
                driver.close();
                Thread.sleep(4000);

            }
        }
    }
}






















