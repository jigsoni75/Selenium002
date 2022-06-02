package org.example;

import org.testng.annotations.Test;

public class TestSuit1 extends BaseTest {

    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessive registrationSuccessive = new RegistrationSuccessive();
    Desktop desktop = new Desktop();
    BuildYourownComputer buildYourownComputer = new BuildYourownComputer();
    ShoppingCartSuccess shoppingCartSuccess = new ShoppingCartSuccess();
    EmailFriend emailFriend = new EmailFriend();
    EmailFriendsAssert emailFriendsAssert = new EmailFriendsAssert();

    @Test(priority = 1)

    public void ToBEVerifyUserShouldBeAbleTORegisterSuccessfully() {

        homepage.clickOnRegisterButton();
        registrationPage.UserShouldBeAbleTORegisterSuccessfully();
        registrationSuccessive.verifyUserRegisteredSuccessfully();

    }

    @Test(priority = 2)

    public void ToBEVerifyUserShouldBeAbleToBuildOwnComputer() {
        homepage.clickOnComputers();
        homepage.clickOnDeskTop();
        desktop.clickOnBuildOwnComputer();
        buildYourownComputer.buildcomputer();
        shoppingCartSuccess.ShoppingMessage();
    }

    @Test(priority = 3)

    public void ToBEVerifyRegisterUeserAbletReferToTheirFriends() {


        homepage.clickOnRegisterButton();
        registrationPage.UserShouldBeAbleTORegisterSuccessfully();
        homepage.clickOnComputers();
        homepage.clickOnDeskTop();
        desktop.clickOnBuildOwnComputer();
        emailFriend.EmailFriendPage();
        emailFriendsAssert.emailSuccessfullySent();

    }

    @Test(priority = 4)

    public void ToBeVerifyuserShouldBeatableToSuccessfullyCryptocurrency() {

        homepage.clickOnCurrency();

    }

    @Test

    public void ToBeVerifyregisteruserShouldBeAbleToVotForCommunityPoll() {

     homepage.verifyIfNonRegisteredUserIsAbleToVote();
     ToBEVerifyUserShouldBeAbleTORegisterSuccessfully();
     homepage.verifyRegisteredUserIsAbleToVote();

    }


}
