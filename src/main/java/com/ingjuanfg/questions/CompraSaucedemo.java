package com.ingjuanfg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ingjuanfg.userinterface.CompraExitosaPage.IMG_COMPRA_EXITOSA;

public class CompraSaucedemo implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return IMG_COMPRA_EXITOSA.resolveFor(actor).isVisible();
    }

    public static CompraSaucedemo esExitosa(){
        return new CompraSaucedemo();
    }
}
