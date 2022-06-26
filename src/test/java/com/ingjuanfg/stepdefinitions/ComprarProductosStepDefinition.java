package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.interactions.Abrir;
import com.ingjuanfg.questions.CompraSaucedemo;
import com.ingjuanfg.tasks.Adicionar;
import com.ingjuanfg.tasks.Realizar;
import com.ingjuanfg.tasks.RealizarAutenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ComprarProductosStepDefinition {

    @Dado("que {word} se autentica en la pagina de Saucelabs")
    public void queElUsuarioSeAutenticaEnLaPaginaDeSaucelabs(String nombreActor, Map<String, String> credenciales) {
        theActorCalled(nombreActor).wasAbleTo(
                Abrir.elNavegador(),
                RealizarAutenticacion.con(credenciales)
        );
    }

    @Cuando("el usuario agrega al carrito el producto {string}")
    public void elUsuarioAgregaAlCarritoElProductoSauceLabsBackpack(String nombreProducto) {
        withCurrentActor(Adicionar.unProductoAlCarrito(nombreProducto));
    }

    @Cuando("realiza el checkout")
    public void realizaElCheckout(List<Map<String, String>> datosRegistro) {
        withCurrentActor(Realizar.checkoutCompra(datosRegistro));
    }

    @Entonces("el usuario deberia de ver que su compra es exitosa")
    public void elUsuarioDeberiaDeVerQueSuCompraEsExitosa() {
        theActorInTheSpotlight().should(seeThat(CompraSaucedemo.esExitosa()));
    }
}
