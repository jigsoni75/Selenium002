package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.example.BasePage.driver;
import static org.example.Utils.clickOnElement;

public class BuildYourownComputer extends Utils {

public void buildcomputer(){

    Select Processor = new Select(driver.findElement(By.id("product_attribute_1")));
    Processor.selectByValue("1");

    //select on RAM  2 GB
    Select Ram = new Select(driver.findElement(By.id("product_attribute_2")));
    Ram.selectByValue("3");

    //click on radio 320gb
    clickOnElement(By.xpath("//label[@for=\"product_attribute_3_6\"]"));

    //click on vista primium
    clickOnElement(By.xpath("//label[@for=\"product_attribute_4_9\"]"));

    //tick  on Microsoft Office [+$50.00]
    clickOnElement(By.xpath("//label[@for=\"product_attribute_5_11\"] "));

    //tick  on Acrobat Reader [+$10.00]
    clickOnElement(By.xpath("//input[@value=\"12\"]"));

    //tick on  Total Commander [+$5.00]
    clickOnElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]"));

    //click on Add to CART
    clickOnElement(By.xpath("//span[@class=\"cart-label\"]"));

    //clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

}

}
