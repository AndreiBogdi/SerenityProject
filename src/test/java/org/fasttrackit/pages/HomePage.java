package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css ="[title='Search']")
    private WebElementFacade searchIcon;

    @FindBy(css ="li.level0:nth-child(6) > a:nth-child(1)")
    private WebElementFacade vipLink;

    @FindBy(css = "#product-collection-image-412")
    private WebElementFacade FirstProduct;

    @FindBy(css ="#swatch26 > span:nth-child(1) > img:nth-child(1)")
    private WebElementFacade color;

    @FindBy(css = "#swatch79 > span:nth-child(1)")
    private WebElementFacade size;

    @FindBy(css ="button.btn-cart:nth-child(1) > span:nth-child(1) > span:nth-child(1)")
    private WebElementFacade AddtocartBtn;

    @FindBy(css ="li.item:nth-child(4) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
    private WebElementFacade SecondProduct;

    @FindBy(css = "#links_20")
    private WebElementFacade checkmark;

    @FindBy(css = "button.btn-cart:nth-child(1)")
    private WebElementFacade AddtoCartBtn2;

    @FindBy(css = "tr.odd > td:nth-child(6) > a:nth-child(1)")
    private WebElementFacade deleteFirstProduct;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public void clicknavigatetoVIPpage(){ clickOn(vipLink);}

    public void clickColor() {clickOn(color);}
    public void clickSize() {clickOn(size);}

    public void clickFirstProduct() {clickOn(FirstProduct);}

    public void clickAddtoCart() {clickOn(AddtocartBtn);}

    public void clickSecondProduct() {clickOn(SecondProduct);}
    public void clickCheckMark() {clickOn(checkmark);}
    public void clickAddToCart2() {clickOn(AddtoCartBtn2);}

    public void clickDeleteFromCart() {clickOn(deleteFirstProduct);}


}
