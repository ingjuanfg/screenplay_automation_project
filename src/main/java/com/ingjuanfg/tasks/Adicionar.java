package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ingjuanfg.userinterface.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adicionar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCTO));

    }

    public static Adicionar unProductoAlCarrito(){
        return instrumented(Adicionar.class);
    }
}
