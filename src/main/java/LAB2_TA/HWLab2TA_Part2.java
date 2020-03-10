package LAB2_TA;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

// 2. Continuati cu scrierea de teste pe aplicatie (inca 10 teste)

public class HWLab2TA_Part2 {
    private WebDriver driver;

    @Before
    public void intdriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
//  Test 1
    public void languagefrench() {

        driver.get("http://testfasttrackit.info/selenium-test/");
        Select languagefrench = new Select(driver.findElement(By.cssSelector("#select-language")));
        languagefrench.selectByVisibleText("French");
        driver.quit();

    }

    //Test 2
    @Test

    public void languagegerman() {

        driver.get("http://testfasttrackit.info/selenium-test/");
        Select languagegerman = new Select(driver.findElement(By.cssSelector("#select-language")));
        languagegerman.selectByVisibleText("German");
        driver.quit();

    }

    //Test 3
    @Test

    public void subscription() {

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#newsletter")).sendKeys("cristinaioana.c@gmail.com");
        driver.findElement(By.cssSelector("#newsletter-validate-detail > div > div.actions > button > span > span")).click();
        driver.quit();

    }

    //Test 4
    @Test
    public void addtocart() {
        Actions actions = new Actions(driver);
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement menuHover = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > a"));
        actions.moveToElement(menuHover).perform();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > ul > li.level1.nav-1-1.first > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > h2 > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        // select colour
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        // select size
        driver.findElement(By.cssSelector("#swatch74 > span.swatch-label")).click();
        //  select no of items
        driver.findElement(By.cssSelector("#qty")).clear();
        driver.findElement(By.cssSelector("#qty")).sendKeys("2");
        // add to cart
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();

//  Test 5 - update quantity in cart
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-cart > div.minicart-wrapper > div.minicart-actions > a")).click();
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > input")).clear();
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > input")).sendKeys("3");
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > button > span > span")).click();
//      driver.quit();

// Test 6 - edit quantity to what the stock allows and add another product o the cart
//      correct qty
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > input")).clear();
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > input")).sendKeys("2");
//      continue shopping
        driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button:nth-child(3) > span > span")).click();
        driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6.last > a")).click();
        driver.findElement(By.cssSelector("#narrow-by-list > dd:nth-child(2) > ol > li:nth-child(1) > a > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#downloadable-links-list > li > span > label")).click();
        driver.findElement(By.cssSelector("#qty")).clear();
        driver.findElement(By.cssSelector("#qty")).sendKeys("2");
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();

// Test 7 - Empty cart

        driver.findElement(By.cssSelector("#empty_cart_button > span > span")).click();
        driver.quit();
    }

    //  Test 8 - view as grid/list
    @Test
    public void viewAs() {
        Actions actions2 = new Actions(driver);
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement menuHover2 = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-4.parent > a"));
        actions2.moveToElement(menuHover2).perform();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-4.parent > ul > li.level1.nav-4-4.last > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar-bottom > div > div.sorter > p > strong")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar-bottom > div > div.sorter > p > a")).click();
        driver.quit();
    }

    // Test 9 - Catalog advanced search
    @Test
    public void catalogsearch() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("body > div > div.page > div.footer-container > div > div:nth-child(3) > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys("alice in woderland");
        driver.findElement(By.cssSelector("#description")).sendKeys("book");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
    }

// Test 10 - results per page
        @Test
        public void resultsperpage(){
            Actions actions3 = new Actions(driver);
            driver.get("http://testfasttrackit.info/selenium-test/");
            WebElement menuHover3 = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-4.parent > a"));
            actions3.moveToElement(menuHover3).perform();
            driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-4.parent > ul > li.level1.nav-4-1.first > a")).click();
            Select results = new Select(driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-right-layout > div > div.col-main > div.category-products > div.toolbar > div.pager > div > div > select")));
            results.selectByVisibleText("24");


        }

 }







    




