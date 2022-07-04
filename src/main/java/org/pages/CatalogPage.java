package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatalogPage extends BasePage {
    public CatalogPage(ChromeDriver driver) {
        super(driver);
    }

    By addToCartButtonBy = By.xpath("//div[@class= 'inventory_list']/div[2]//div[2]/button");
    By goodsCartBy = By.xpath("//div//a[@class='shopping_cart_link']");

    public CatalogPage addItemToCart() {
        driver.findElement(addToCartButtonBy).click();
        return this;
    }

    public YourCartPage openCart() {
        driver.findElement(goodsCartBy).click();
        return new YourCartPage((ChromeDriver) driver);
    }
}
