package sw4.luma.project3.pages;

import org.openqa.selenium.By;
import sw4.luma.project3.utilities.Utility;

public class MenMenu extends Utility {

    By mhover = By.xpath("//span[normalize-space()='Men']");
    By mhoverBottom = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[2]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By mhoverProductName = By.xpath("(//div[@id='option-label-size-143-item-175'])[1]");
    By mhoverPNameAndColour = By.xpath("(//div[@class='swatch-option color'])[1]");
    By mhoverAddToCart = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    By verifyText = By.xpath("//body/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By shopping = By.xpath("//span[@class='base']");
    By productName=By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize = By.xpath("//dd[contains(text(),'32')]");
    By productColor = By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(mhover);
    }

    public void mouseHoverOnBottoms() {
        mouseHoverToElement(mhoverBottom);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(pants);
    }

    public void clickOnProductNameAndSize() {
        mouseHoverToElementAndClick(mhoverProductName);
    }

    public void mouseHoverProductNameAndColour() {
        mouseHoverToElementAndClick(mhoverPNameAndColour);
    }

    public void mouseHoverProductNameAndAddToCart() {
        mouseHoverToElementAndClick(mhoverAddToCart);
    }

    public String verifyAddShoppingCartMessage() {
        return getTextFromElement(verifyText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }


    public String textVerify() {
        return getTextFromElement(shopping);
    }

    public String  verifyProductName(){
        return getTextFromElement(productName);
    }

    public String  verifyProductSize(){
        return getTextFromElement(productSize);
    }

    public String  verifyProductColor(){
        return getTextFromElement(productColor);
    }
}
