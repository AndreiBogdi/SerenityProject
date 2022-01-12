package org.fasttrackit.features;

import org.fasttrackit.steps.SortBySteps;
import org.junit.Test;

public class SortBy extends BaseTest{

    @Test
    public void SortBy(){
        sortbysteps.navigateToHomePage();
        sortbysteps.navigatetoVIPpage();
        sortbysteps.SortBy();
    }

}
