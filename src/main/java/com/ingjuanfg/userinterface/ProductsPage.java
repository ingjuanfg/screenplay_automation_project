package com.ingjuanfg.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;


public class ProductsPage {

    public static final Target BTN_MENU = the("Botón menú productos")
            .locatedBy("//button[@id='react-burger-menu-btn']");

    public static final Target BTN_CARRITO = the("Botón Carrito de compras")
            .located(By.className("shopping_cart_link"));

    public static final Target LBL_PRODUCT = the("titulo Productos")
            .locatedBy("//span[contains(.,'Products')]"));
}
