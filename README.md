# Convertidor de Monedas

_Este es un programa en Java que convierte entre distintas monedas, utilizando archivos .jar de Gson y Json.org para manejar la serialización y deserialización de datos en formato JSON. También maneja conversiones de moneda basadas en tasas de cambio obtenidas desde una API._

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Mira **Despliegue** para conocer cómo desplegar el proyecto.

### Pre-requisitos 📋

_Para ejecutar este proyecto, necesitarás tener instalado lo siguiente:_

- [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html) 21 o superior
- [Maven](https://maven.apache.org/) (para gestionar las dependencias)

#### Instalación en Windows

1. **Instalar Java**
    - Descarga e instala el JDK desde el sitio oficial de Oracle:  
      [Descargar JDK](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
    - Sigue las instrucciones del instalador para instalar el JDK.
    - Verifica la instalación abriendo la consola `cmd` y ejecutando:
      ```
      java -version
      ```

2. **Instalar Maven**
    - Descarga Maven desde el sitio oficial:  
      [Descargar Maven](https://maven.apache.org/download.cgi)
    - Descomprime el archivo descargado y agrega la ruta de Maven a las variables de entorno de tu sistema.
    - Verifica la instalación abriendo la consola `cmd` y ejecutando:
      ```
      mvn -version
      ```

#### Instalación en Linux

1. **Instalar Java**  
   Si no tienes instalado el JDK, puedes hacerlo mediante los siguientes comandos en la terminal:
   ```
   sudo apt update
   sudo apt install openjdk-21-jdk
   ```
   Para verificar la instalación:
   ```
   java -version
   ```

2. **Instalar Maven**  
   Para instalar Maven, ejecuta los siguientes comandos en la terminal:
   ```
   sudo apt install maven
   ```
   Verifica la instalación con:
   ```
   mvn -version
   ```

### Instalación 🔧

_Una serie de pasos para tener el entorno de desarrollo configurado:_

1. **Clonar el repositorio**  
   Clona este repositorio en tu máquina local usando Git:
   ```
   git clone https://github.com/tu-usuario/convertidor-de-monedas.git
   cd convertidor-de-monedas
   ```

2. **Agregar dependencias**  
   Este proyecto utiliza Gson y Json.org como dependencias. Si estás usando Maven, puedes agregar las dependencias al archivo `pom.xml` de la siguiente manera:

   ```xml
   <dependencies>
       <dependency>
           <groupId>com.google.code.gson</groupId>
           <artifactId>gson</artifactId>
           <version>2.8.8</version>
       </dependency>
       <dependency>
           <groupId>org.json</groupId>
           <artifactId>json</artifactId>
           <version>20210307</version>
       </dependency>
   </dependencies>
   ```

3. **Compilar el proyecto**  
   Compila el proyecto con Maven:
   ```
   mvn clean install
   ```

_Finaliza estos pasos con la creación del archivo JAR ejecutable:_

4. **Crear el archivo JAR**  
   Ejecuta el siguiente comando para empaquetar el proyecto en un archivo JAR:
   ```
   mvn package
   ```

5. **Ejecutar el programa**  
   Para ejecutar el archivo JAR generado, utiliza:
   ```
   java -jar target/convertidor-de-monedas.jar
   ```

## Ejecutando las pruebas ⚙️

_Para ejecutar las pruebas automatizadas del sistema:_

1. **Ejecutar pruebas unitarias**  
   Usa Maven para ejecutar las pruebas unitarias:
   ```
   mvn test
   ```

### Analice las pruebas end-to-end 🔩

_Estas pruebas verifican que el flujo completo de conversión de monedas funcione correctamente, desde la consulta de la API hasta la conversión de la moneda y la presentación de resultados._

```
Ejemplo de prueba: verificar conversión de USD a EUR utilizando una tasa de cambio fija.
```

### Y las pruebas de estilo de codificación ⌨️

_Se pueden usar herramientas como Checkstyle para verificar el estilo de código:_

```
mvn checkstyle:check
```

## Despliegue 📦

_Para desplegar el proyecto en un servidor de producción, puedes crear un archivo JAR ejecutable y alojarlo en cualquier servidor que soporte Java._

## Construido con 🛠️

_Herramientas utilizadas en el desarrollo del proyecto:_

* [Java](https://www.oracle.com/java/) - El lenguaje de programación principal
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Gson](https://github.com/google/gson) - Para trabajar con JSON
* [Json.org](https://www.json.org/json-en.html) - Otra biblioteca para trabajar con JSON

## Versionado 📌

Se utiliza [Git](https://git-scm.com/) para el versionado.

## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Miguel Angel Ulmi** - *Creador* - [MigueBlack93](https://github.com/MigueBlack93)

## Licencia 📄

Este proyecto no está licenciado.

## Expresiones de Gratitud 🎁

* Gracias ONE y Alura por la oportunidad 📢
* Gracias a todos los que usen el convertidor 🤓.



---
⌨️ con ❤️ por [MigueBlack93](https://github.com/MigueBlack93) 😊