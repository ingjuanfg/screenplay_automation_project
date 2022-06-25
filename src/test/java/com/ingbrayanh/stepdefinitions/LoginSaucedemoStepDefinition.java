package com.ingbrayanh.stepdefinitions;

import com.ingbrayanh.interactions.Adicionar;
import com.ingbrayanh.tasks.Autenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;

import static com.ingbrayanh.utils.Endpoint.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSaucedemoStepDefinition {

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo());
    }

    @Y("seleccione el producto {producto}")
    public void seleccioneElProductoProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(Adicionar.unProductoAlCarrito(producto));
    }

    @Entonces("el usuario deberia ver añadido su producto")
    public void elUsuarioDeberiaVerAñadidoSuProducto() {
    }
}
