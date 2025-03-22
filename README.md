# Estructura del Proyecto

-Se organizó el código en clases bien definidas.

-Libro: Representa un libro con su título, autor, ISBN, año de publicación y estado de disponibilidad.

-Usuario: Representa un usuario de la biblioteca, con su ID, nombre y correo electrónico.

-Prestamo: Administra los préstamos, registrando fechas y calculando retrasos.

-Biblioteca: Centraliza la gestión de libros, usuarios y préstamos.

-Main: Punto de entrada del programa para demostrar su funcionalidad.

-Uso de ArrayList para almacenamiento.

-Uso de LocalDate para asignar fechas para hacer el calculo.

-Usamos ArrayList en lugar de arrays fijos para permitir la expansión dinámica de libros, usuarios y préstamos sin restricciones de tamaño.


## Manejo de préstamos y devoluciones:

-En el codigo se verifica si un libro está disponible antes de prestarlo.

-Al devolver un libro, se actualiza su estado de disponibilidad.

-Se calcula automáticamente el retraso en la devolución, si aplica.

## Mensajes informativos en consola

-Se imprime un mensaje en la consola para que el usuario pueda visualizar el estado del sistema en todo momento.

## Integrantes : Alex Cardenas , Jesus Osuna