package org.fasttrackit.features;

import org.fasttrackit.steps.DeleteProductSteps;
import org.junit.Test;

public class DeleteProduct extends BaseTest {
    @Test
    public void DeleteProduct(){
        deleteproductsteps.navigateToHomePage();
        deleteproductsteps.navigatetoVIPpage();
        deleteproductsteps.SelectFirstProduct();
        deleteproductsteps.navigatetoVIPpage2();
        deleteproductsteps.SelectSecondProduct();
        deleteproductsteps.DeleteProductFromCart();
    }

}
