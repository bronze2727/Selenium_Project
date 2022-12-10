package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.WebElementlerim;
public class MyWebAppAutomationProgram extends Methodlarim {


    public static void main(String[] args) throws InterruptedException {

        launchChromeBrowser();

        Thread.sleep(8000);

        sendKeysToSearchEngine();

        enter();
        Thread.sleep(3000);

        product();
        Thread.sleep(3000);

        addbasket();
        Thread.sleep(3000);

        login();

        help();

        goToURL();






    }




}
