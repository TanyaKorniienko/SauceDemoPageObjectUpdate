package org.saucedemo;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class BuyGoodsTest extends BaseTestClass {

    @Test
    public void buyGoodsTest() {
        LoginPage loginPage = new LoginPage((ChromeDriver) driver);
        new LoginPage((ChromeDriver) driver)
                .inputName()
                .inputPassword()
                .clickLoginButton();

        CatalogPage catalogPage = new CatalogPage((ChromeDriver) driver);
        new CatalogPage((ChromeDriver) driver)
                .addItemToCart()
                .openCart();

        YourCartPage yourCartPage = new YourCartPage((ChromeDriver) driver);
        new YourCartPage((ChromeDriver) driver).submitOrder();

        CheckOutInfo checkOutInfo = new CheckOutInfo((ChromeDriver) driver);
        new CheckOutInfo((ChromeDriver) driver)
                .input_UserInfo()
                .finishOrder();

        ThankYouPage thankYouPage = new ThankYouPage((ChromeDriver) driver);
        new ThankYouPage((ChromeDriver) driver).returnToCatalogPage();

        String URL = driver.getCurrentUrl();
        assertEquals(URL, "https://www.saucedemo.com/inventory.html");
        assertThat(loginPage.getName()).isEqualTo("standard_user").hasSize(13);
        assertThat(loginPage.getPassword()).isEqualTo("secret_sauce").hasSize(12);
        System.out.println("true");
    }
}
