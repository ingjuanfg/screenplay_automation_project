# Proyecto Base Screenplay Web - SerenityBDD

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Este repositorio contiene un escenario de compra de productos, ejemplo ya realizado con Page Object Model + Page Factory (el ejemplo puedes encontrarlo en el siguiente repositorio y rama ([Page Object Model - Rama Page Factory](https://github.com/ingjuanfg/page_object_model_automation_project/tree/page_factory "Page Object Model - Rama Page Factory")).


## Contenido

- Automatización Screenplay Web
- Ejecución por Terminal


## Automatización Screenplay Web

En la rama principal [main](https://github.com/ingjuanfg/screenplay_automation_project "main") encontrarás 2 escenarios, uno para Login y otro para compras. El objetivo de estos ejemplos fue migrar los ya realizados en POM (repositorio mencionado arriba) para contrastar y ver sus diferencias. Ademas de implementar diferentes estructuras y manejo de datos como lo es Datatables, Examples, String, etc. En la capa de **Test** están los features, Runners y Stepdefinitions, mientras que en **Main** estan Task, Interaction, Questions y UserInterface. Ademas se crean Questions desde 0 como el uso de [Serenity Ensure](https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay-ensure.html "Serenity Ensure") para ver sus diferencias.

## Ejecución por Terminal

Para ejecutar y generar la documentación viva, basta con que por medio de una terminal en la ruta donde esta el proyecto ejecutes la siguiente linea:

`gradle clean test aggregate`

Si no cuentas con gradle configurado en tu maquina, usa el wrapper.

`./gradlew clean test aggregate`

Con esta instrucción limpias el proyecto de archivos temporales, ejecuta los test y genera la documentación viva.

Una vez ejecutado, puedes verificar las evidencias en la ruta:

`.../target/site/serenity/index.html`


**Happy Coding!**

***Juan de Jesús Fernández Graciano***

