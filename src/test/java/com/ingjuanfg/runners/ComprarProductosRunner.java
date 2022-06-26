package com.ingjuanfg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/comprar_productos.feature",
        glue = "com.ingjuanfg.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ComprarProductosRunner {
}

