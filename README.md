# EjercicioPOO_Clases_Interfaces
Desarrollo ejercicio de programación orientada a objetos - clases - interfaces dentro del desarrollo del BootCamp de desarrollo web BackEnd de MAKAIA.
## Repositorio solución del siguiente ejercicio:

## Ejercicio
### Supongamos que queremos modelar una tienda de música que vende instrumentos. Cada instrumento tiene un nombre, una marca y un precio. Además, hay diferentes tipos de instrumentos, como guitarras, pianos y violines, cada uno con características específicas.
### Para la tienda de música, se requiere lo siguiente:
#### Definir una interfaz llamada "Afinable" con un método llamado "afinar()".
#### Definir una clase abstracta llamada "Instrumento" que tenga los siguientes atributos:
    - Nombre del instrumento (tipo String)
    - Marca del instrumento (tipo String)
    - Precio del instrumento (tipo double)

#### Además, la clase "Instrumento" debe tener los siguientes métodos:
    - Un constructor que inicialice los atributos del instrumento.
    - Un método abstracto llamado "tocar()" que será implementado en las clases hijas.
#### Definir las siguientes clases que heredan de la clase abstracta "Instrumento":
* Clase "Guitarra":
    - Atributo adicional: número de cuerdas (tipo int)
    - Método "tocar()" que imprime un mensaje indicando que se está tocando la guitarra.

* Clase "Piano":
    - Atributo adicional: número de teclas (tipo int)
    - Método "tocar()" que imprime un mensaje indicando que se está tocando el piano.

* Clase "Violin":
    - Atributo adicional: tipo de violín (tipo String)
    - Método "tocar()" que imprime un mensaje indicando que se está tocando el violín.

#### Cada una de estas clases también implementa la interfaz "Afinable". En el método "afinar()", se imprimirá un mensaje indicando que el instrumento se está afinando.
#### En la clase principal "Main", crear instancias de diferentes instrumentos (guitarras, pianos, violines) con valores específicos para cada atributo. Luego, llamar al método "tocar()" de cada instrumento creado y al método "afinar()" solo para aquellos instrumentos que implementen la interfaz "Afinable".
### Con este ejercicio, podrás practicar la creación de interfaces, clases abstractas, herencia y polimorfismo en el contexto de una tienda de música.
