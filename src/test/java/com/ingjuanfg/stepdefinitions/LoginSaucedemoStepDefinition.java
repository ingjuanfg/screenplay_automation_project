package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.interactions.Abrir;
import com.ingjuanfg.questions.AutenticacionEcommerce;
import com.ingjuanfg.tasks.Adicionar;
import com.ingjuanfg.tasks.Autenticacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSaucedemoStepDefinition {

    @Dado("que {word} se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina(String nombre) {
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @Cuando("el ingresa sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo());
    }

    @Entonces("el usuario deberia ingresar a la pagina de {word}")
    public void elUsuarioDeberiaIngresarAlEcommerce(String nombrePagina) {
        theActorInTheSpotlight()
                .should(seeThat(AutenticacionEcommerce.esExitosa(nombrePagina)));
    }
}
