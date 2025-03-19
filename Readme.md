Autor: Daniel Rodríguez Tato

## Examen de Test Unitarios








Ejercicio : Crear los tests
- Crear test para ambas funciones donde especialmente comprobamos las situciones limites como por ejemplo que pasaria si el dni es demasiado largo
- o demasiado corto, o si introduces valores que no son letras como los 8 primeros caracteres o un numero como caracter final entre otros


- Ejercicio 2: encuentra el error y plantea una solucion:
- Si como la funcion comprobarDNI() no valida la longitud del String despues cuando calcularLetraDNI() hace el calculo con tal de que el resto de dividir el dni entre 23 le coincida con la letra
- ya lo da todo por valido, como en este ejemplo: "0001, R",
-  
- 
-  Ejercicio 3: Si no hubiera una comprobación previamente encuanto a la longitud de la `string` del DNI, ¿Qué hay que cambiar en los tests para que comprueben estos casos?
- Para comprobarlo añadiria test para comprobar esos casos en la funcion conprobarDNI() como por ejemplo:
-   "123, Z, false", 
    "12345678912, A, false"
- Un dni tiene 8 numeros y una letra, sabiendo eso es sencillo comprobar los casos en la que el String introducido es demasiado largo o demasiado corto

Entrega tu repositorio con el código y los test. Además un `Readme` explicando y justificando cada apartado





---