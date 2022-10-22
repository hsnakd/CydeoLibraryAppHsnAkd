package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.cydeo.library.utilities.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("users on the login page")
    public void users_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
    }
    @When("users type librarian username")
    public void users_type_librarian_username() {
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
    //    loginPage.login();
    }
    @When("users type librarian password")
    public void users_type_librarian_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
    }
    @When("users click to the sign in button")
    public void users_click_to_the_sign_in_button() {
       loginPage.loginButton.click();
    }
    @Then("users should be on the dashboard")
    public void users_should_be_on_the_dashboard() {
        Assert.assertTrue(loginPage.library.isDisplayed());
        loginPage.userAvatar.click();
        loginPage.logout.click();
    }

    @When("users type student username")
    public void users_type_student_username() {
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("studentUsername"));

    }
    @When("users type student password")
    public void users_type_student_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("studentPassword"));

    }

    @When("users type librarian username {string}")
    public void usersTypeLibrarianUsername(String username) {
        loginPage.inputUsername.sendKeys(username);
    }

    @And("users type librarian password {string}")
    public void usersTypeLibrarianPassword(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    @When("users type student username {string}")
    public void usersTypeStudentUsername(String username) {
        loginPage.inputUsername.sendKeys(username);
    }

    @And("users type student password {string}")
    public void usersTypeStudentPassword(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    @When("users type student username {string} and {string} then click to the sign in button")
    public void usersTypeStudentUsernameAndThenClickToTheSignInButton(String username, String password) {
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("users should should have following columns")
    public void usersShouldShouldHaveFollowingColumns(List<String> expectedList) {
        List<WebElement> list = loginPage.columnHeaders;
        List<String> actualList = new ArrayList<>();
        for (WebElement each : list) {
            actualList.add(each.getText());
        }

        System.out.println("actualList = " + actualList);
        System.out.println("expectedList = " + expectedList);
        Assert.assertEquals(expectedList,actualList);
    }

    @And("users click to the users button")
    public void usersClickToTheUsersButton() {
        loginPage.users.click();
    }



    @When("users type username {string}")
    public void usersTypeUsername(String username) {
        loginPage.inputUsername.sendKeys(username);
    }

    @And("users type password {string}")
    public void usersTypePassword(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    @Then("users should be able to see username in the {string} section")
    public void usersShouldBeAbleToSeeUsernameInTheSection(String expectedResult) throws InterruptedException {
        Thread.sleep(5000);
        String actualResult = loginPage.accountName.getText();
        Assert.assertEquals("Title is not as expected!", expectedResult, actualResult);


        loginPage.userAvatar.click();
        loginPage.logout.click();
    }
}
