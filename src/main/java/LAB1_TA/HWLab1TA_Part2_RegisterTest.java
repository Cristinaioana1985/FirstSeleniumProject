package LAB1_TA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWLab1TA_Part2_RegisterTest {
    public static void main(String[] args) {
        RegisterNewUser();

    }

// EX. 6.
//    Adăugați în clasa RegisterTest un test în care să automatizați pașii necesari
//    pentru înregistrarea cu succes a unui utilizator nou
//    (deschideți homepage-ul, apăsați pe Account,
//    apăsați pe Register, completați toate câmpurile de pe pagina Register - atenție ca email-ul să fie unic,
//    bifați opțiunea pentru primirea newsleterr-ului).
//    Folosiți identificatori diferiți pentru câmpurile de pe pagina Register (id, name, className).


    public static void RegisterNewUser() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
//          First name
//        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li:nth-child(1) > div > div.field.name-firstname > label")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Shaun");
//          Middle name
        driver.findElement(By.cssSelector("#middlename")).sendKeys("The");
//          Last name
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Sheep");
//          Email address
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ShaunTheSheep@gmail.com");
//          Pass
        driver.findElement(By.cssSelector("#password")).sendKeys("ShaunTheSheep");
//          Confirm Pass
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("ShaunTheSheep");
//          Click register
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.quit();

//        yay!! it works!!

    }
}
