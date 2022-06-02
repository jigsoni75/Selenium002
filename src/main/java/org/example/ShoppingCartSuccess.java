package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;
import static org.openqa.selenium.By.xpath;

public class ShoppingCartSuccess extends Utils{

    public void ShoppingMessage(){

        // assert for ShoppingCart
        String expectedMessage = "Shopping cart";

        String actualMessage = driver.findElement(xpath("//h1 [contains (text (),'Shopping cart')]")).getText();

        Assert.assertEquals(expectedMessage, actualMessage, "The product will not added to the cart ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        String actualMessage1 = driver.findElement(By.className("product-name")).getText();

        String expectedMessage1 = "Build your own computer";

        Assert.assertEquals(actualMessage1, expectedMessage1, "build your computer not added to the cart");
    }
}
