package com.ingjuanfg.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;


public class ProductsPage {

    public static final Target BOTON_MENU = the("Botón menú productos")
            .located(By.xpath("//button[@id='react-burger-menu-btn']"));

    public static final Target BOTON_CARRITO = the("Botón Carrito de compras")
            .located(By.className("shopping_cart_link"));

    public static final Target TEXTO_PRODUCTO = the("titulo Productos")
            .locatedBy("//span[contains(.,'Products')]");


    public static final Target BOTON_PRODUCTO_COMPRAR = the("botón para adicionar el producto al carrito")
            .locatedBy("//a[contains(.,'{0}')]/../following-sibling::div//button");

}
