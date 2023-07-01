package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    public final String USERNAME = loadProp.getProperty("bsUsername");
    public final String ACCESS_KEY = loadProp.getProperty("bsAccessKey");
    public final String BrowseStackURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    boolean cloud = false;

    String browserName = "Chrome";
    DesiredCapabilities caps = new DesiredCapabilities();


    public void openBrowser() {
        //making decision cloud true or false
        // this will be run if cloud true(In cloud)
        if (cloud) {
            System.out.println("Running in cloud");
            //applying conditional loop for different browser options
            if (browserName.equalsIgnoreCase("Chrome"))





            {

                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("browserName", "Chrome");
                caps.setCapability("browserVersion", "latest");

                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");

                caps.setCapability("bstack:options", browserstackOptions);



            } else if (browserName.equalsIgnoreCase("firefox")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.0.0");
            } else {
                System.out.println("your browser stack is wrong or connection issue");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowseStackURL), caps);
            } catch (MalformedURLException e)
            {
                e.printStackTrace();
            }

        } else {
            System.out.println("Running Locally in the computer ........");

            if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
                ChromeOptions Options = new ChromeOptions();
                Options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(Options);
            } else if
            (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");
                //open firefox
                driver = new FirefoxDriver();
            } else if
            (browserName.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
                //open Edge
                driver = new EdgeDriver();
            } else {
                System.out.println("your browser name is wrong or not provided" + browserName);
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com");

    }

    public void closeBrowser() {
        driver.quit();
    }


}