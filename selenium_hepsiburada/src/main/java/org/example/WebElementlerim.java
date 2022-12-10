package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.MyWebAppAutomationProgram.driver;


public class WebElementlerim {




    static WebElement enter = driver.findElement(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b"));

    static WebElement product= driver.findElement(By.tagName("a"));

    static WebElement addbasket = driver.findElement(By.id("addToCart"));

    static WebElement login = driver.findElement(By.cssSelector("input.hb-AxiLy"));

    static WebElement help = driver.findElement(By.cssSelector("span._17OD2T5uhxYRT6atZy_yA7"));





}
