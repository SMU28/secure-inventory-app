# Secure Inventory App (CLI)

## Descripción del Proyecto
Secure Inventory App es una aplicación de línea de comandos diseñada para la gestión segura y eficiente de inventarios.
El sistema está desarrollado en Java 17 utilizando Maven como gestor de dependencias y compilación.

El proyecto sigue una arquitectura modular basada en principios de desarrollo seguro y buenas prácticas de ingeniería de software, lo que facilita su mantenimiento, escalabilidad y futuras mejoras.
La aplicación está pensada como una herramienta sencilla de usar, pero con una estructura sólida para garantizar seguridad en el manejo de datos y evitar errores comunes como duplicados o pérdidas de información.

Las funcionalidades principales incluyen:
- Agregar productos al inventario registrando su ID, nombre, precio y stock.
- Listar todos los productos disponibles en el sistema para su visualización.
- Actualizar productos existentes (por ejemplo, modificar su precio, nombre o cantidad disponible).
- Eliminar productos por ID, permitiendo mantener actualizado el inventario y evitar registros obsoletos.

Este proyecto sirve como base para entender cómo aplicar conceptos de desarrollo seguro en software, ya que incorpora validaciones y separación clara de responsabilidades en capas (dominio, casos de uso, controladores, persistencia y CLI).

---

## Guía de Configuración

### Requisitos
- [Java JDK 17 o superior](https://adoptium.net/)  
- [Apache Maven](https://maven.apache.org/)  
- [Git](https://git-scm.com/)  

### Instalación
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/SMU28/secure-inventory-app.git
   cd secure-inventory-app
2. Compilar y empaquetar
   ```bash
   mvn clean package
- Esto genera el archivo
  ```bash
   target/secure-inventory-app-1.0-SNAPSHOT.jar
3. Ejecutar la aplicacion
     ```bash
     java -jar target/secure-inventory-app-1.0-SNAPSHOT.jar

---

## Instrucciones para la Demostración
1. Ejecutar el programa con:
   ```bash
   java -jar target/secure-inventory-app-1.0-SNAPSHOT.jar
3. Aparecerá un menú en consola:
    ```bash
   1) Agregar  2) Listar  3) Salir
5. Seleccionar 1 para Agregar un producto (ejemplo: ID P001, Nombre Lapiz, Precio 1200, Stock 30).
6. Seleccionar 2 para Listar productos y verificar que se agregó correctamente.
7. Intentar agregar otro producto con el mismo ID → debe mostrar un error de validación.
8. Seleccionar 3 para Salir.




