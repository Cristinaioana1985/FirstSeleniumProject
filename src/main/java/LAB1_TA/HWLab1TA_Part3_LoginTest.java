package LAB1_TA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HWLab1TA_Part3_LoginTest {
    public static void main(String[] args) {
        LoginUser();
    }

    // EX 8-9
    public static void LoginUser() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("cristinaioana.c@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("cristina");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }

}
