#language:es

Característica: Compra de productos.
  Yo como usuario de Saucedemo, quiero agregar productos al carrito para realizar la compra de estos.

  Antecedentes: Ingresar a la pagina
    Dado que el usuario se encuentra en la pagina

  Esquema del escenario: Login exitoso
    Cuando el usuario ingrese sus credenciales
    Y seleccione el producto "nombre producto"
    Entonces el usuario deberia ver añadido su producto
    Ejemplos:
      | producto          |
      | <nombre producto> |