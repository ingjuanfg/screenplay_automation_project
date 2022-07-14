package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion {

    public static Performable conUsuarioActivo(){
        return instrumented(UsuarioActivo.class);
    }

    public static Performable conUsuarioBloqueado(){
        return instrumented(UsuarioBloqueado.class);
    }

    public static Performable conUsuarioConProblemas(){
        return instrumented(UsuarioProblemas.class);
    }
}
