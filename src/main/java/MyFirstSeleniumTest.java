import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Hello world");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(10000);

    }
}
