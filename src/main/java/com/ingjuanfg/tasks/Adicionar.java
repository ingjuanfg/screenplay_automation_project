package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ingjuanfg.userinterface.ProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adicionar implements Task {

    private String nombreProducto;

    public Adicionar(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_PRODUCTO_COMPRAR.of(nombreProducto)));
    }

    public static Adicionar unProductoAlCarrito(String nombreProducto){
        return instrumented(Adicionar.class, nombreProducto);
    }
}
