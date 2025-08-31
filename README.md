# HotelManager
HotelManager es un sistema de gestión de reservas de hotel desarrollado en Java, aplicando conceptos de POO, y una interfaz gráfica construida con JavaFX/Swing. El sistema permite a los usuarios registrarse, iniciar sesi´ón, consultar disponibilidad de habitaciones, realizar reservas, y cancelarlas. 

## Funcionalidades principales

- Registro e inicio de sesión de usuarios.
- Gestión  de habitaciones del hotel (tipo, número, precio).
- Creación de reservas con validación de disponibilidad.
- Consulta y cancelación de reservas existentes.
- Reglas de negocio que evitan solapamientos en las fechas de las reservas.

 ## Arquitectura del proyecto.

 El sistema está estructurado en capas siguindo buenas practicas de desarrollo. 

 1.- Modelo (POO) -> Clases como Usuario, Habitación, Reserva
 
 2.- DAO (Data Access Object) -> Conexión y operaciones con la base de datos. 
 
 3.- Servicios -> Lógica de negocio (validaciones de disponibilidad, creación y cancelación de reservas).
 
 4.- UI (Interfaz gráfica) -> Pantallas para la interacción gráfica con el usuario (login, registro, gestión de reservas).

