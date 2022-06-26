package com.ingjuanfg.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CheckoutPage {
    public static final Target BOTON_CHECKOUT_INICIAL =
            the("Boton checkout inicial")
                    .located(By.id("checkout"));
    public static final Target INPUT_USUARIO =
            the("Campo para usuario")
                    .located(By.id("first-name"));
    public static final Target INPUT_APELLIDO =
            the("Campo para clave")
                    .located(By.id("last-name"));
    public static final Target INPUT_CODIGO_POSTAL =
            the("Campo para codigo postal")
                    .located(By.id("postal-code"));

    public static final Target BOTON_CONTINUAR =
            the("Boton continuar")
                    .located(By.id("continue"));
    public static final Target BOTON_FINALIZAR =
            the("Boton Finalizar")
                    .located(By.id("finish"));
}
