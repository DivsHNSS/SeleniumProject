

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActions {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup() {
        driver.get("https://google.com");

    }
    @Test
    public void Test1() throws InterruptedException {
        System.out.println("Hello World");
        Thread.sleep(10000);
    }
        @AfterClass
        public void close() {
        driver.close();
        }
    }


//public class TestActions {
//    public static void start(String args[]) {
//         WebDriver driver = new ChromeDriver();
//
//        @BeforeClass
//        public static void start() {
//            driver.get("https://www.letskodeit.com/login");
//            driver.manage().window().maximize();
//
//        }
//    }
//}





