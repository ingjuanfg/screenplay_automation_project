package com.ingjuanfg.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CheckoutPage {

    public static final Target BOTON_CHECKOUT_INICIAL =
            the("Botón checkout inicial").located(By.id("checkout"));

    public static final Target INPUT_NOMBRE =
            the("Campo para nombre usuario").located(By.id("first-name"));

    public static final Target INPUT_APELLIDO =
            the("Campo para apellido usuario").located(By.id("last-name"));

    public static final Target INPUT_CODIGO_POSTAL =
            the("Campo para código postal").located(By.id("postal-code"));

    public static final Target BOTON_CONTINUAR =
            the("Botón continuar").located(By.id("continue"));

    public static final Target BOTON_FINALIZAR =
            the("Botón Finalizar").located(By.id("finish"));
}
