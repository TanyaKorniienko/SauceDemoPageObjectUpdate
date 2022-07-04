package org.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage {

    private final String user_name = "standard_user";
    private final String user_password = "secret_sauce";

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    By usernameBy = By.xpath("//input[@id='user-name']");
    By passwordBy = By.xpath("//input[@id='password']");
    By loginButtonBy = By.xpath("//input[@id='login-button']");

    public LoginPage inputName() {
        driver.findElement(usernameBy).sendKeys(user_name);
        return this;
    }

    public LoginPage inputPassword() {
        driver.findElement(passwordBy).sendKeys(user_password);
        return this;
    }

    public String getName() {
        return user_name;
    }

    public String getPassword() {
        return user_password;
    }

    public CatalogPage clickLoginButton() {
        driver.findElement(loginButtonBy).click();
        return new CatalogPage((ChromeDriver) driver);
    }
}
