package sw4.luma.project3.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import sw4.luma.project3.pages.GearMenu;
import sw4.luma.project3.testbase.TestBase;

/**
 * 6.Write down the following test into ‘GearTest’ class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Gear Menu
 * * Click on Bags
 * * Click on Product Name ‘Overnight Duffle’
 * * Verify the text ‘Overnight Duffle’
 * * Change Qty 3
 * * Click on ‘Add to Cart’ Button.
 * * Verify the text
 * ‘You added Overnight Duffle to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the Qty is ‘3’
 * * Verify the product price ‘$135.00’
 * * Change Qty to ‘5’
 * * Click on ‘Update Shopping Cart’ button
 * * Verify the product price ‘$225.00
 */
public class GearTest extends TestBase {

    GearMenu gearMenu = new GearMenu();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        gearMenu.mouseHoverOnGear();
        gearMenu.clickOnBagsTab();
        gearMenu.clickOnProductName();
        String expectedText = "Overnight Duffle";
        String  actualText = gearMenu.verifyBagText();
        Assert.assertEquals(actualText,expectedText,"Product not verify");
        gearMenu.clearText();
        gearMenu.changeQuantity();
        gearMenu.clickOnCart();
        String expectedCartMessage = "You added Overnight Duffle to your shopping cart.";
        String  actualCartMessage = gearMenu.verifyAddCartText();
        Assert.assertEquals(actualText,expectedText,"Product not added into cart");
        gearMenu.clickOnShoppingCartLink();
        String expectedQuantity = "3";
        String actualQuantity = gearMenu.verifyQuantity3();
        Assert.assertEquals(actualQuantity,expectedQuantity,"Quantity not Match");
        String expectedPrice = "$135.00";
        String actualPrice= gearMenu.VerifyPriceOfBag();
        Assert.assertEquals(actualPrice,expectedPrice,"Price not match");
        gearMenu.clearText1();
        gearMenu.changeQuantity1();
        Thread.sleep(2000);
        gearMenu.clickOnUpdateShoppingCart();
        String expectedPriceFor5Bag = "$225.00";
        String actualPriceFor5Bag = gearMenu.verifyPriceOf5Bag();
        Assert.assertEquals(actualPriceFor5Bag,expectedPriceFor5Bag,"Price not Match");
    }
}
