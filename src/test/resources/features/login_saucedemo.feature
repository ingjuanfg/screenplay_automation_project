#language:es

  Característica: login en Saucedemo
    Yo como usuario de Saucedemo
    Quiero autenticarme
    Para ver los productos que puedo comprar

    Escenario: Login exitoso
      Dado que Juan se encuentra en la pagina
      Cuando el ingresa sus credenciales
      Entonces el usuario deberia ingresar a la pagina de Products

    Escenario: Login usuario bloqueado
      Dado que Juan se encuentra en la pagina
      Cuando el ingresa sus credenciales de usuario bloqueado
      Entonces el usuario deberia de ver mensaje de error

    Escenario: Login usuario con problemas
      Dado que Juan se encuentra en la pagina
      Cuando el ingresa sus credenciales con problemas
      Entonces el usuario deberia de ver productos incorrectos listados
