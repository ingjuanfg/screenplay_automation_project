package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.interactions.Abrir;
import com.ingjuanfg.questions.AutenticacionEcommerce;
import com.ingjuanfg.tasks.Autenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.ingjuanfg.userinterface.LoginPage.MENSAJE_ERROR_LOGIN;
import static com.ingjuanfg.userinterface.ProductoPage.TITULO_IMAGEN_PROBLEMA;
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
        theActorInTheSpotlight().attemptsTo(Autenticacion.conUsuarioActivo());
    }

    @Cuando("el ingresa sus credenciales de usuario bloqueado")
    public void elUsuarioIngreseSusCredencialesBloqueado() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.conUsuarioBloqueado());
    }

    @Cuando("el ingresa sus credenciales con problemas")
    public void elUsuarioIngreseSusCredencialesProblemas() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.conUsuarioConProblemas());
    }

    @Entonces("el usuario deberia ingresar a la pagina de {word}")
    public void elUsuarioDeberiaIngresarAlEcommerce(String nombrePagina) {
        theActorInTheSpotlight()
                .should(seeThat(AutenticacionEcommerce.esExitosa(nombrePagina)));
    }

    @Entonces("el usuario deberia de ver productos incorrectos listados")
    public void elUsuarioDeberiaVerProductosIncorrectos() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TITULO_IMAGEN_PROBLEMA).isDisplayed()
        );
    }

    @Entonces("el usuario deberia de ver mensaje de error")
    public void elUsuarioDeberiaMensajeError() {
        withCurrentActor(Ensure.that(MENSAJE_ERROR_LOGIN).isDisplayed());
    }
}
