package org.fasttrackit.features;

import org.junit.Test;

public class ChangeLanguage extends BaseTest {
    @Test
    public void changeLanguage(){
        changelanguagesteps.navigateToHomePage();
        changelanguagesteps.SelectChangeLanguageSlider();
    }
}
