package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.*;

public class Homepage extends Utils {


    public void clickOnRegisterButton() {
        // click on register button
        clickOnElement(className("ico-register"));
    }  //click on computer

    public void clickOnComputers() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
    } //click on desk top

    public void clickOnDeskTop() {

        clickOnElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]"));

    }

//    public void usershoudabletoaddtocart() {
//
//        // click on desktop  for email friends
//        clickOnElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]"));
//        //clickOnElement(By.xpath("//img[@alt=\\\"Picture for category Desktops\\\"]"));
//    }

    public void clickOnCurrency() {


        Select USDollar = new Select(driver.findElement(By.xpath("//select[@name=\"customerCurrency\"]")));
        USDollar.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F");


        String expectedMessage7 = driver.findElement(By.xpath("//span[contains(text(),'$1,200.00')]")).getText();
        assertTrue(expectedMessage7.contains("$"));

        //select Euro

        Select Euro = new Select(driver.findElement(By.id("customerCurrency")));
        Euro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");


        String expectedMessage3 = driver.findElement(By.xpath("//span [contains (text (),'€1032.00')]")).getText();
        assertTrue(expectedMessage3.contains("€"));
    }


    public void verifyIfNonRegisteredUserIsAbleToVote() {
        //click on radio button good
        clickOnElement(By.id("pollanswers-2"));

        //click on vote
        clickOnElement(By.xpath("//button[@id=\"vote-poll-1\"]"));
        //verify user is not able to vote without being registered
//        driverWaitUntilVisibilityOfAllElementsLocatedBy(5, By.xpath("//div[@id=\"block-poll-vote-error-1\"]"));
//        String actualMessage = driver.findElement(By.xpath("//*[@id=\"block-poll-vote-error-1\"]")).getText();
//        Assert.assertTrue(actualMessage.contains("Only registered users can vote."), "Non registered user is able to vote");
    }

    public void verifyRegisteredUserIsAbleToVote() {

        clickOnElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
        //click on radio button good
        clickOnElement(By.xpath("//input[@id=\"pollanswers-2\"]"));

        //click on vote
        clickOnElement(By.xpath("//*[@id=\"vote-poll-1\"]"));
        //verify registered user should be able to vote
//        String actualMessage = driver.findElement(By.xpath("//span[@class=\"poll-total-votes\"]")).getText();
//        Assert.assertTrue(actualMessage.contains("vote(s)..."), "Registered user is not able to vote");
    }


}








