package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.example.BasePage.driver;

public class ArrangeInOrderZtoA extends Utils {

    //order dent sort z to A in the panel because of developer mistakes

    public void descendingOrderZtoA(){

        Select select = new Select(driver.findElement(By.id("products-Order by")));
        select.selectByVisibleText("Name: Z to A");
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='products-container']/descendant::a"));

        for (WebElement element : productList) {

            System.out.println(element.getText());

        }

    }

}
