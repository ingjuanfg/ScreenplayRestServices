# language: es
Característica: Manejo de Información de un Usuario por Servicios

  Escenario: POST Creación de usuario exitoso
    Cuando Juan realiza la creacion de un usuario
      | cedula | nombre | trabajo       |
      | 1088   | Juan   | automatizador |
    Entonces el deberia de ver el usuario creado con exito


  Escenario: GET listar usuario con exito
    Cuando Juan realiza la consulta del usuario # 2
    Entonces el deberia de recibir una respuesta de exito
