package com.ingjuanfg.interactions;

import com.ingjuanfg.tasks.Realizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.ingjuanfg.userinterface.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adicionar implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCTO));

    }

    public static Adicionar unProductoAlCarrito(){
        return instrumented(Adicionar.class);
    }
}
