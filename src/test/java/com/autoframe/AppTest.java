package com.autoframe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static WebDriver driver;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @BeforeAll
    public static void beforeSeleniumTests()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.google.ca/");
    }

    @AfterAll
    public static void afterSeleniumTests()
    {
        driver.close();
    }
}
