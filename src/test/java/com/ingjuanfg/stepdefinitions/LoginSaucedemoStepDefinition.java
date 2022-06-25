package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.tasks.Adicionar;
import com.ingjuanfg.tasks.Autenticacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSaucedemoStepDefinition {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que {word} se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina(String nombre) {
        theActorCalled(nombre).wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo());
    }

    @Cuando("seleccione un producto")
    public void seleccioneUnProducto() {
        theActorInTheSpotlight().attemptsTo(Adicionar.unProductoAlCarrito());
    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
    }
}
