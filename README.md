# API REST Productos - Spring Boot

API para gestionar productos con Spring Boot.

## Ejecutar

mvn pacakge

mvn spring-boot:run


## Endpoints

### POST /productos
Crear producto:

{

    "nombre": "Laptop",

    "precio": 1500.0
}

![img_1.png](img_1.png)
### GET /productos
Obtener todos los productos.
![img_2.png](img_2.png)
### GET /productos/{id}
Obtener producto por ID.
![img_3.png](img_3.png)

