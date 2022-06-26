package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.Map;

import static com.ingjuanfg.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarAutenticacion implements Task {

    private Map<String, String> credenciales;

    public RealizarAutenticacion(Map<String, String> credenciales){
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credenciales.get("usuario")).into(INPUT_USUARIO),
                Type.theValue(credenciales.get("clave")).into(INPUT_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }

    public static RealizarAutenticacion con (Map<String, String> credenciales){
        return instrumented(RealizarAutenticacion.class, credenciales);
    }
}
