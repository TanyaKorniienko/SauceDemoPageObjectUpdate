package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOutInfo extends BasePage {
    private final String firstName = "Elena";
    private final String lastName = "Robertson";
    private final String zipCode = "121233";

    public CheckOutInfo(ChromeDriver driver) {
        super(driver);
    }

    By firstNameBy = By.xpath("//form//div[@class='checkout_info']//input[@id='first-name']");
    By lastNameBy = By.xpath("//form//div[@class='checkout_info']//input[@id='last-name']");
    By zipCodeBy = By.xpath("//form//div[@class='checkout_info']//input[@id='postal-code']");
    By continueButtonBy = By.xpath("//div[@class='checkout_buttons']/input[@id='continue']");
    By finishButtonBy = By.xpath("//button[@id='finish']");

    public CheckOutInfo input_UserInfo() {
        driver.findElement(firstNameBy).sendKeys(firstName);
        driver.findElement(lastNameBy).sendKeys(lastName);
        driver.findElement(zipCodeBy).sendKeys(zipCode);
        driver.findElement(continueButtonBy).click();
        return this;
    }

    public ThankYouPage finishOrder() {
        driver.findElement(finishButtonBy).click();
        return new ThankYouPage((ChromeDriver) driver);
    }
}
