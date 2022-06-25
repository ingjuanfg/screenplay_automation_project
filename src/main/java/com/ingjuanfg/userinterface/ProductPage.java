package com.ingjuanfg.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductPage extends PageObject {

    public static final Target PRODUCTO=
            the("Boton para adicionar el producto seleccionado al carrito")
                    .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));


}

