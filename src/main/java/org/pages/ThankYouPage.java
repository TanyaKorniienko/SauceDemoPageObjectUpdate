package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThankYouPage extends BasePage {
    public ThankYouPage(ChromeDriver driver) {
        super(driver);
    }

    By backHomeButtonBy = By.xpath("//button[@id='back-to-products']");

    public CatalogPage returnToCatalogPage() {
        driver.findElement(backHomeButtonBy).click();
        return new CatalogPage((ChromeDriver) driver);
    }
}
