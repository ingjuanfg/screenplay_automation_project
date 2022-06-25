package com.ingbrayanh.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.ingbrayanh.userinterface.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adicionar implements Interaction {

    private String producto;

    public Adicionar(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO.of(producto))
        );
    }

    public static Adicionar unProductoAlCarrito(String producto) {
        return instrumented(Adicionar.class, producto);
    }
}
