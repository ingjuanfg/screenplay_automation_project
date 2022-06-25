package com.ingjuanfg.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {

    public static final Target INPUT_MENU=
            the("Menu pagina inicio")
                    .located(By.xpath("//div[@class= 'bm-burger-button']/child::button"));

    public static final Target CARRITO_COMPRA =
            the("Icono carrito de compras")
                    .located(By.className("shopping_cart_link"));

    public static final Target TITULO_PAGINA_PRINCIPAL =
            the("Texto Productos")
                    .locatedBy("//div[@class= 'header_secondary_container']/child::span");

}
