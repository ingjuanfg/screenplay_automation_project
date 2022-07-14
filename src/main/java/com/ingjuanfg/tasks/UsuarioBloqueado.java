package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static com.ingjuanfg.userinterface.LoginPage.*;

public class UsuarioBloqueado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("locked_out_user").into(INPUT_USUARIO),
                Type.theValue("secret_sauce").into(INPUT_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }
}
