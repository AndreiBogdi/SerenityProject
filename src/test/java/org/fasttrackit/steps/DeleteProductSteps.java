package org.fasttrackit.steps;

import io.cucumber.java.nl.Stel;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;

public class DeleteProductSteps extends ScenarioSteps {
    private HomePage homePage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }
    @Step
    public void navigatetoVIPpage(){
        homePage.clicknavigatetoVIPpage();

    }
    @Step
    public void SelectFirstProduct(){
        homePage.clickFirstProduct();
        homePage.clickColor();
        homePage.clickSize();
        homePage.clickAddtoCart();

    }
    @Step
    public void navigatetoVIPpage2(){
        homePage.clicknavigatetoVIPpage();

    }
    @Step
    public void SelectSecondProduct(){
        homePage.clickSecondProduct();
        homePage.clickCheckMark();
        homePage.clickAddToCart2();
    }
    @Step
    public void DeleteProductFromCart(){
        homePage.clickDeleteFromCart();
    }
}
