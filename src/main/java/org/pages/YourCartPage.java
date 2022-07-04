package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourCartPage extends BasePage {
    public YourCartPage(ChromeDriver driver) {
        super(driver);
    }
    By checkOutButtonBy = By.xpath("//button[@id='checkout']");

    public CheckOutInfo submitOrder() {
        driver.findElement(checkOutButtonBy).click();
        return new CheckOutInfo((ChromeDriver) driver);
    }
}
