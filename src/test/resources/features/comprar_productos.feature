#language:es

Característica: Compra de productos
  Yo como usuario de Saucedemo
  Quiero agregar productos al carrito
  Para realizar la compra de estos

  Esquema del escenario: Comprar un producto de manera exitosa
    Dado que <nombre> se autentica en la pagina de Saucelabs
      | usuario | standard_user |
      | clave   | secret_sauce  |
    Cuando el usuario agrega al carrito el producto "Sauce Labs Backpack"
    Y realiza el checkout
      | nombre   | apellido   | postal         |
      | <nombre> | <apellido> | <codigoPostal> |
    Entonces el usuario deberia de ver que su compra es exitosa
    Ejemplos:
      | nombre  | apellido  | codigoPostal |
      | Juan    | Fernandez | 050034       |
      | Julian  | Villa     | 050035       |
      | Natalia | Perez     | 050036       |