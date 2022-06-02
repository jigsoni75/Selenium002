package org.example;

import org.openqa.selenium.By;

public class Desktop extends Utils{

    public void clickOnBuildOwnComputer() {

        clickOnElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]"));
    }
}

