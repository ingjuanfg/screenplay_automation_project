package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.List;
import java.util.Map;

import static com.ingjuanfg.userinterface.CheckoutPage.*;
import static com.ingjuanfg.userinterface.ProductoPage.BOTON_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Realizar implements Task {

    private List<Map<String, String>> datosRegistro;

    public Realizar(List<Map<String, String>> datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_CHECKOUT_INICIAL),
                Type.theValue(datosRegistro.get(0).get("nombre")).into(INPUT_USUARIO),
                Type.theValue(datosRegistro.get(0).get("apellido")).into(INPUT_APELLIDO),
                Type.theValue(datosRegistro.get(0).get("postal")).into(INPUT_CODIGO_POSTAL),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_FINALIZAR)
        );
    }

    public static Performable checkoutCompra(List<Map<String, String>> datosRegistro) {
        return instrumented(Realizar.class, datosRegistro);
    }
}
