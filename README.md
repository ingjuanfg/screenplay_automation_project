# Proyecto Base Screenplay Web - SerenityBDD

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Este repositorio contiene un escenario de compra de productos, ejemplo ya realizado con Page Object Model + Page Factory (el ejemplo puedes encontrarlo en el siguiente repositorio y rama ([Page Object Model - Rama Page Factory](https://github.com/ingjuanfg/page_object_model_automation_project/tree/page_factory "Page Object Model - Rama Page Factory")).


## Contenido

- Automatización Screenplay Web
- Automatización Screenplay Web -  Paralelización
- Ejecución por Terminal


## Automatización Screenplay Web

En la rama principal [main](https://github.com/ingjuanfg/screenplay_automation_project "main") encontrarás 2 escenarios, uno para Login y otro para compras. El objetivo de estos ejemplos fue migrar los ya realizados en POM (repositorio mencionado arriba) para contrastar y ver sus diferencias. Ademas de implementar diferentes estructuras y manejo de datos como lo es Datatables, Examples, String, etc. En la capa de **Test** están los features, Runners y Stepdefinitions, mientras que en **Main** estan Task, Interaction, Questions y UserInterface. Ademas se crean Questions desde 0 como el uso de [Serenity Ensure](https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay-ensure.html "Serenity Ensure") para ver sus diferencias.

## - Automatización Screenplay Web -  Paralelización

En la rama [parallel](https://github.com/ingjuanfg/screenplay_automation_project/tree/parallel "parallel") se encuentra el ejemplo implementado para paralelización. Esto se realiza con la adición de esta linea dentro de una de las tareas en gradle.

`maxParallelForks = Runtime.runtime.availableProcessors()`

Quedando asi

    tasks.withType(Test) {
        systemProperties = System.properties
        maxParallelForks = Runtime.runtime.availableProcessors()
    }

Con esta tarea al ejecutar las pruebas con los comandos que se indican abajo se ejecutará en paralelo según la cantidad de procesadores disponibles que se tenga en la maquina, esta ejecución se hace en relación a la cantidad de features en el proyecto. Es decir que se paraleliza por features y no por escenarios. Para el ejemplo en particular se cuenta con 2 features y cada 1 con 3 escenarios. Es decir que se lanzan 2 instancias del driver 3 veces cada una para ejecutar todos los escenarios.

Adicional se implementa [Patrón Factory](https://refactoring.guru/es/design-patterns/factory-method "Patrón Factory") en la task de Autenticación. Esto con el objetivo de reutilizar y mostrar un breve ejemplo del reuso que se puede tener en este tipo de automatizaciones con Screenplay.

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

