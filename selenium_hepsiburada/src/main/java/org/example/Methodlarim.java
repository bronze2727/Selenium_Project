package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Methodlarim extends Driverim {

    static Constants object = new Constants();

    public static void launchChromeBrowser() {



        driver= WebDriverManager.firefoxdriver().avoidShutdownHook().create();

        driver.get(object.URL);

    }

    public static void sendKeysToSearchEngine() {


        driver.findElement(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b")).sendKeys("kazak");



    }

    public static void enter(){

        WebElement enter = driver.findElement(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b"));
        enter.sendKeys(Keys.ENTER);
    }


    public static void product(){

        WebElement product= driver.findElement(By.tagName("a"));
        product.click();



    }

    public static void addbasket(){
        WebElement addbasket = driver.findElement(By.id("addToCart"));
        addbasket.click();




    }

    public static void login(){

        WebElement login = driver.findElement(By.cssSelector("input.hb-AxiLy"));
        login.sendKeys(object.EMAIL);

    }


    public static void help(){
        Actions actions = new Actions(driver);
        WebElement help = driver.findElement(By.cssSelector("span._17OD2T5uhxYRT6atZy_yA7"));
        actions.doubleClick(help);


    }


    public static void goToURL(){
        driver.get("https://hepsiburada.com");
    }

}
