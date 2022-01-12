package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;

public class ChangeLanguageSteps extends ScenarioSteps {
    private HomePage homePage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void SelectChangeLanguageSlider(){
        homePage.clickChangeLanguageSlider();
        homePage.clickChangeLanguageFrench();
        homePage.clickChangeLanguageGerman();

    }
}
