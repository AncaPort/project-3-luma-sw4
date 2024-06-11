package sw4.luma.project3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sw4.luma.project3.utilities.Utility;

import java.util.List;

public class WomenMenu extends Utility {

    By mhoverWomen = By.xpath("//span[normalize-space()='Women']");
    By mhoverTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By selectJacket = By.xpath("(//select[@id='sorter'])[1]");
    By verifyProductName = By.xpath("//strong[@class='product name product-item-name']//a");
    By selectPrice = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By productNames = By.xpath("//strong[@class='product name product-item-name']//a");
    By selectFilter = By.id("sorter");
    By productPrice = By.xpath("//span[@class='price-wrapper ']//span[@class='price']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(mhoverWomen);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(mhoverTops);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }

    public void selectSortByFilterProductName() {
        selectByVisibleTextFromDropDown(selectJacket, "Product Name");
    }

    public List<WebElement> verifyTheProductNameDisplayInAlphabaticalOrder(){
        return getMultipleElements(verifyProductName);
    }

    public void selectSortByPrice(){
        clickOnElement(selectPrice);
        selectByVisibleTextFromDropDown(selectPrice,"Price");

    }
    public List<String> storeProductNamesInAscendingOrder() {
        return storeProductNamesIntoArrayList(productNames);
    }

    public void selectFilterSortByNames() {
        selectByValueFromDropDown(selectFilter, "name");
    }

    public List<String> storeProductNamesAfterFilterName() {
        return afterFilterProductNames(productNames);
    }

    public void selectFilterSortByPriceLowToHigh() {
        selectByValueFromDropDown(selectFilter, "price");
    }

    public List<Double> storeProductsNamesByPriceAfterFilterPriceLowToHigh() {
        return storeAndSortProductsByPriceInAscendingOrder(productPrice);
    }

    public List<Double> storeProductsNamesByPriceinAscendingOrder() {
        return storeAndSortProductsByPriceInAscendingOrder(productPrice);
    }

}


