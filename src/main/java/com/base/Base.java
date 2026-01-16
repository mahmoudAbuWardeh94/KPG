package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

    protected static WebDriver driver;
    private static final String BROWSER = System.getProperty("browser", "chrome");

    @Before
    public void setup() {

        if (driver == null) {

            boolean isCI = System.getenv("CI") != null;

            if (BROWSER.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();

                options.addArguments("--remote-allow-origins=*");

                // ✅ Headless ONLY in CI/CD
                if (isCI) {
                    options.addArguments("--headless=new");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                }

                driver = new ChromeDriver(options);
                System.out.println("🚀 Running tests on Chrome | CI=" + isCI);

            } else if (BROWSER.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions options = new FirefoxOptions();

                driver = new FirefoxDriver(options);
                System.out.println("🔥 Running tests on Firefox");

            } else {
                throw new IllegalArgumentException("Invalid browser name: " + BROWSER);
            }

            driver.manage().window().maximize();
        }
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
