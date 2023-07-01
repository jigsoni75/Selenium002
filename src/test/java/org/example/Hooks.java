package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import static org.example.BasePage.driver;

public class Hooks extends Utils {

    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp(){
        driverManager.openBrowser();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                String screenshotName = scenario.getName().replaceAll(" ", "_");
                scenario.attach(screenshot, "image/png", screenshotName);
            } catch (WebDriverException e) {
                System.err.println("Failed to take screenshot: " + e.getMessage());
            }
        }
        driverManager.closeBrowser();
    }


}
