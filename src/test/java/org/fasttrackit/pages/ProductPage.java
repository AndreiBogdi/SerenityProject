package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2)")
    private WebElementFacade SortByButton;

    @FindBy(css = ".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2) > option:nth-child(2)")
    private WebElementFacade SortByName;

    @FindBy(css =".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2) > option:nth-child(3)")
    private WebElementFacade SortByPrice;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void clickSortByButton() { clickOn(SortByButton);}
    public void clickSortByName() {clickOn(SortByName);}
    public void clickSortByPrice() {clickOn(SortByPrice);}
}
