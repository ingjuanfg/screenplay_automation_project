package com.ingjuanfg.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;


public class CompraExitosaPage {

    public static final Target IMG_COMPRA_EXITOSA =
            the("Confirmación compra exitosa").located(By.className("pony-express"));
}
