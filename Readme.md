# Examen de Test Unitarios

**Autor:** Daniel Rodríguez Tato

-------

## Ejercicio 1: Crear los tests

Crear test para ambas funciones donde especialmente comprobamos las situaciones límites como por ejemplo:
- Qué pasaría si el DNI es demasiado largo o demasiado corto.
- Qué pasaría si introduces valores que no son letras como los 8 primeros caracteres o un número como carácter final, entre otros.
- Que la validación de la letra del Dni funciona correctamente con cada una de las 23 letras.

## Ejercicio 2: Encuentra el error y plantea una solución

El error está en la función `comprobarDNI()` que no valida la longitud del String. 
Después, cuando `calcularLetraDNI()` hace el cálculo, si el resto de dividir el DNI entre 23 coincide con la letra, lo da todo por válido. Por ejemplo: `"0001, R"`.
Una posible solución sería añadir una validacíon a la función `comprobarDni()` que comprueba que la longitud del String sea exactamente 8 y que no contiene caracteres que no sean letras.

## Ejercicio 3: Comprobación de la longitud del DNI

Si no hubiera una comprobación previa en cuanto a la longitud del String del DNI, ¿qué hay que cambiar en los tests para que comprueben estos casos?

Para comprobarlo, añadiría tests para comprobar esos casos en la función `comprobarDNI()`, como por ejemplo:
- `"123, Z, false"`
- `"12345678912, A, false"`

Un DNI tiene 8 números y una letra. Sabiendo eso, es sencillo comprobar los casos en los que el String introducido es demasiado largo o demasiado corto.

