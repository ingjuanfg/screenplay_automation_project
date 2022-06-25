package com.ingjuanfg.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductsPage {


    public static final Target BTN_MENU =
            the("Boton Menu izquierdo")
                    .locatedBy("//div[@class=\"bm-burger-button\"]//child::button");

    public static final Target TITULO_PRODUCTS =
            the("Titulo productos")
                    .locatedBy("//div[@class='header_secondary_container']//child::span");

    public static final Target BOTON_CARRITO =
            the("Boton Carrito")
                    .located(By.className("shopping_cart_link"));
}

