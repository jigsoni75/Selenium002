package org.example;

import org.openqa.selenium.By;



public class EmailFriend extends Utils{

    public void EmailFriendPage(){

        clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

        sendKeys(By.xpath("//*[@id=\"FriendEmail\"]"), "jigarsoni75@yaoo.com");

        //enter your email address
        sendKeys(By.xpath("//*[@id=\"YourEmailAddress\"]"), " ");

        // enter personal message
        sendKeys(By.xpath("//*[@id=\"PersonalMessage\"]"), "This computer is a very nice and good price.");
        //clik on send email Button
        clickOnElement(By.name("send-email"));
    }
}
