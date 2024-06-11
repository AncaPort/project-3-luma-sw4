package sw4.luma.project3.pages;

import org.openqa.selenium.By;
import sw4.luma.project3.utilities.Utility;

public class GearMenu extends Utility {

    By mouseHover = By.xpath("//span[normalize-space()='Gear']");
    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");
    By clickOnProduct = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyBag = By.xpath("//span[@class='base']");
    By quantity = By.xpath("//input[@id='qty']");
    By clear = By.xpath("//input[@id='qty']");
    By clickcart = By.xpath("//button[@id='product-addtocart-button']");
    By verifyaddcart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickShoppinglink = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyQuantity = By.xpath("//input[@title='Qty']");
    By verifyPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By clear1 = By.xpath("//input[@class='input-text qty']");
    By quantity1 = By.xpath("//input[@class='input-text qty']");
    By updateShoppingCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    By verifyPrice1 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public void mouseHoverOnGear() {
        mouseHoverToElement(mouseHover);
    }

    public void clickOnBagsTab() {
        mouseHoverToElementAndClick(clickOnBags);
    }

    public void clickOnProductName() {
        mouseHoverToElementAndClick(clickOnProduct);
    }

    public String verifyBagText() {
        return getTextFromElement(verifyBag);
    }

    public void changeQuantity() {
        sendTextToElement(quantity, "3");
    }

    public void clearText() {
        clearText(clear);
    }

    public void clickOnCart() {
        mouseHoverToElementAndClick(clickcart);
    }

    public String verifyAddCartText() {
        return getTextFromElement(verifyaddcart);
    }

    public void clickOnShoppingCartLink() {
        mouseHoverToElementAndClick(clickShoppinglink);
    }

    public String verifyQuantity3() {
        return getAttributeValue(verifyQuantity, "value");
    }

    public String VerifyPriceOfBag() {
        return getTextFromElement(verifyPrice);
    }

    public void changeQuantity1() {
        sendTextToElement(quantity1, "5");
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String verifyPriceOf5Bag() {
        return getTextFromElement(verifyPrice1);
    }

    public void clearText1() {
        clearText(clear1);
    }
}
