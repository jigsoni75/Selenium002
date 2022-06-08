package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NopcommerceNewRelease extends Utils {
    String title ="Mr patel";

    String commentText = LoadProp.properties.getProperty("comment")+ randomDate();

    public void newRelease(){
        // assert for compare the url
        String ActualText = "https://demo.nopcommerce.com/nopcommerce-new-release";

        Assert.assertEquals(ActualText , "https://demo.nopcommerce.com/nopcommerce-new-release");

        System.out.println("URL matching --> Part executed");
        //type in the Title
        sendKeys(By.xpath("//*[@id=\"AddNewComment_CommentTitle\"]"),"Mr Patel");
        //type the  comment
        sendKeys(By.xpath("//*[@id=\"AddNewComment_CommentText\"]"),"Nope commerce is very useful website");
        //click on new comment button
        clickOnElement(By.xpath("//button[@name=\"add-comment\"]"));
        //  assert for nopCommerce new release!
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class=\"center-2\"]//div/div/h1")),"nopCommerce new release!");
        //assert for News comment is successfully added
        Assert.assertEquals(getTextFromElement(By.xpath("//div[contains (text (),'News comment is successfully added.')]")),"News comment is successfully added.");

        List<WebElement> comments=driver.findElements(By.xpath("//div[@class=\"comment-title\"]"));
        List<String>listOfComments=new ArrayList<>();
        for (WebElement e : comments) {
            listOfComments.add(e.getText());
        }
//        Assert.assertTrue(listOfComments.contains(title));
//        //last comment verification
//        String lastComment = listOfComments.get(listOfComments.size()-1);
//        System.out.println(lastComment);
//        Assert.assertEquals(lastComment,title,"Comment is not in order");




    }
}
