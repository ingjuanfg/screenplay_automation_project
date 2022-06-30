package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;

import static com.ingjuanfg.userinterface.ProductsPage.BOTON_PRODUCTO_COMPRAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adicionar implements Task {


    private String nombreProducto;

    public Adicionar(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PRODUCTO_COMPRAR.of(nombreProducto))
        );

    }

    public static Performable unProductoAlCarrito(String nombreProducto) {
        return instrumented(Adicionar.class, nombreProducto);
    }


}
