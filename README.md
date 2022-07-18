# Laboratorio Java 

Aplicación básica usando Java y gestionada mediante la herramienta Maven. Se utiliza una base de datos MySQL para la persistencia de los datos dentro de nuestro programa.
Esta aplicación consiste en un juego de preguntas y respuesta que tiene un número total de 5 rondas. Las reglas del juego son las siguientes:
A. Cada ronda tiene un puntaje asignado, el cual se ganará únicamente si el participante selecciona la pregunta correcta.
B. Si el participante quiere retirarse voluntariamente, puede hacerlo y llevarse el puntaje ganado hasta el momento y se guarda su información (nombre y puntaje) en la base de datos.
C. Si el participante supera las 5 rondas correctamente, se lleva el puntaje máximo y se guarda su información (nombre y puntaje) en la base de datos.
D. Si el participante selecciona una respuesta incorrecta, el programa finaliza y no se guarda la información del jugador.

## Requerimientos 
1. Preferiblemente, [IntelliJ IDEA Ultimate](https://www.jetbrains.com/es-es/idea/download/#section=windows) o cualquier otro IDE.
2. [MySQL](https://dev.mysql.com/downloads/workbench/)
 
## Ejecución
1. Descargar el código del repositorio
2. Abrir la carpeta BasedeDatos y ejecutar el script.sql
3. Ir hasta el archivo ConectionToSQL.java que se encuentra en la carpeta src/main/java/utilities.
4. Cambiar la configuración de la base de datos en la linea 15
```python
conection = DriverManager.getConnection("jdbc:mysql://localhost:3306( o la que usted tenga configurada)/laboratorio_java","root (o si tiene otro nombre de usuario cambielo)","(su contraseña)");
```
5. Correr la aplicación ingresando al archivo App.java que se encuentra dentro de src/main/java, darle al botón **RUN**
6. Se ejecutará el programa y podrá empezar a interactuar con el juego por consola.
