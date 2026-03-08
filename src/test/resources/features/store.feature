#language: es

@testfeature
Característica: Product - Store

  @test
  Escenario: Realizar el login - Store
    Dado que estoy en la página de la tienda
    Cuando doy click en la opción iniciar sesión
    Y doy click en el link text cree una cuenta aquí
    Y lleno los campos del formulario para el registro
    Y doy click en el botón guardar
    Entonces debería visualizar mi usuario logeado en la pantalla