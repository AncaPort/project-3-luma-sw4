package sw4.luma.project3.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import sw4.luma.project3.pages.WomenMenu;
import sw4.luma.project3.testbase.TestBase;

import java.util.List;

/**
 * 1. Write down the following test into WomenTestclass
 * 1. verifyTheSortByProductNameFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Product Name”
 * * Verify the products name display in
 * alphabetical order
 * 2. verifyTheSortByPriceFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Price”
 * * Verify the products price display in
 * Low to High
 */
public class WomenTest extends TestBase {

    WomenMenu womenMenu = new WomenMenu();


    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        womenMenu.mouseHoverOnWomenMenu();
        womenMenu.mouseHoverOnTops();
        womenMenu.clickOnJackets();
//        womenMenu.selectSortByFilterProductName();
//        womenMenu.verifyTheProductNameDisplayInAlphabaticalOrder();
        List<String> actualText = womenMenu.storeProductNamesInAscendingOrder();
        womenMenu.selectFilterSortByNames();
        Thread.sleep(2000);
        List<String> expextedText = womenMenu.storeProductNamesAfterFilterName();
        Assert.assertEquals(actualText, expextedText);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        womenMenu.mouseHoverOnWomenMenu();
        womenMenu.mouseHoverOnTops();
        womenMenu.clickOnJackets();
     //   womenMenu.selectSortByPrice();
        List<Double> actualText = womenMenu.storeProductsNamesByPriceinAscendingOrder();
        womenMenu.selectFilterSortByPriceLowToHigh();
        Thread.sleep(2000);
        List<Double> expextedText = womenMenu.storeProductsNamesByPriceAfterFilterPriceLowToHigh();
        Assert.assertEquals(actualText, expextedText);
    }

}
