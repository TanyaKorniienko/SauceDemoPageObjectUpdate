package org.saucedemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.LoginPage;



public class SignInUserTest extends BaseTestClass{

    @Test
    public void signInUserTest() {
        LoginPage loginPage = new LoginPage((ChromeDriver) driver);
        new LoginPage((ChromeDriver) driver)
                .inputName()
                .inputPassword()
                .clickLoginButton();

        assertThat(loginPage.getName()).startsWith("stan").endsWith("r").isEqualTo("standard_user");
        assertThat(loginPage.getPassword()).isEqualTo("secret_sauce").hasSize(12);
        System.out.println("true");
    }
}
