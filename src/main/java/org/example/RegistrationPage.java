package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.className;


public class RegistrationPage extends Utils {
//locators are  stored in variable
      private  By _genderMale = By.id("gender-male");

      private  By _firstName  = By.xpath("//input[@name='FirstName']");

      private  By _lastName   = By.id("LastName");

      private  By _dateOfBirth = By.name("DateOfBirthDay");

      private  By _dateOfMonth = By.name("DateOfBirthMonth");

      private  By _dateOfBirthYear = By.name("DateOfBirthYear");

      private  By _emailAddress = By.id("Email");

      private  By _enterYourPassword = By.id("Password");

      private By _confirmPassword = By.id("ConfirmPassword");

      private By _registerButton  = By.id("register-button");

    public void UserShouldBeAbleTORegisterSuccessfully(){

        //click on gender
        clickOnElement(_genderMale);

        // enter your  firstname
        sendKeys(_firstName, "Jigar");

        //enter your lastname
        // driver.findElement(By.id("LastName")).sendKeys("LastNameTest");
        sendKeys(_lastName, "Soni");
        //>>>>>>>>>>>>>>>>>>>>>>select birthday >>>>>>>>>>>>>>>>>>>>
        Select birthDay = new Select(driver.findElement(_dateOfBirth));//select on the day
        birthDay.selectByIndex(28);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>select Month >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Select birtMonth = new Select(driver.findElement(_dateOfMonth ));//select on month
        birtMonth.selectByIndex(3);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>select year  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Select birthYear = new Select(driver.findElement(_dateOfBirthYear));//select on year
        birthYear.selectByVisibleText("1984");

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Enter your Email addresss  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // driver.findElement(By.id("Email")).sendKeys("Jigar75@gmail.com");
        sendKeys(_emailAddress, "jigar75" + randomDate() + "@gmail.com");

        //Enter your password
        //driver.findElement(By.id("Password")).sendKeys("Jb1984sn");
        sendKeys(_enterYourPassword, "Jb1984sn");

        // Enter Confirm Password

        //driver.findElement(By.id("ConfirmPassword")).sendKeys("Jb1984sn");
        sendKeys(_confirmPassword, "Jb1984sn");
        //  Enter register Button
        clickOnElement(_registerButton);

       // clickOnElement By(className("button-1 register-continue-button"));
       // clickOnElement(By.className("button-1 register-continue-button"));

    }

}
