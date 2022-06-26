package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.interactions.Abrir;
import com.ingjuanfg.tasks.Adicionar;
import com.ingjuanfg.tasks.Autenticacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSaucedemoStepDefinition {

    @Dado("que {word} se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina(String nombre) {
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo());
    }

    @Cuando("seleccione un producto")
    public void seleccioneUnProducto() {
       // withCurrentActor(Adicionar.unProductoAlCarrito());
    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
    }
}
