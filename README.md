# Ejercicio Escuelita Somos PNT

Este proyecto en Java simula un supermercado de barrio, mostrando una lista de productos con sus detalles, y destacando el producto más caro y el más barato. La implementación sigue principios de diseño orientado a objetos y utiliza las clases estándar de Java.

---

<p ALIGN="center">
<img src="https://scontent.faep4-3.fna.fbcdn.net/v/t39.30808-6/301106509_509800874480493_6999074123776221808_n.png?_nc_cat=106&ccb=1-7&_nc_sid=5f2048&_nc_ohc=6XRClBJofZkQ7kNvgG4OYx6&_nc_ht=scontent.faep4-3.fna&oh=00_AYBQwScqYSKbw8wVL8gHJPYPdhwInm7kpMwh4BnBuPNXww&oe=66682614" WIDTH="100%" height="50%" alt="logo PNT">
</p>

---

## Requisitos

```plaintext
Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
=============================
Producto más caro: Frutillas
Producto más barato: Coca-Cola
```

***La solución cumple con los siguientes requisitos:***
1. **Diseño Orientado a Objetos**: El proyecto está estructurado en varias clases que representan diferentes tipos de productos y servicios.
2. **Salida por Consola**: La salida es exactamente como se requiere.
3. **Java 8**: Aunque se usó Java 17 para este proyecto, la solución es compatible con Java 8.
4. **Carga de Productos**: La lista de productos se carga en un único método sin ingreso por pantalla.
5. **Independencia del Algoritmo de Impresión**: El algoritmo para la impresión no depende de la cantidad o tipo de productos.
6. **Uso de Comparable**: La interfaz `Comparable` se utiliza para determinar el producto más caro y el más barato.
7. **Sobrescritura de toString()**: El método `toString()` se sobrescribe para la impresión personalizada de los productos.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

```plaintext
Ejercicio-Escuelita-Somos-PNT/
├── src/
│   ├── entidades/
│   │   ├── Bebida.java
│   │   ├── Producto.java
│   │   ├── Toxico.java
│   │   └── Verduleria.java
│   ├── enums/
│   │   └── UnidadVerduleria.java
│   ├── service/
│   │   └── ServiceProducto.java
│   └── Main.java 
└── README.md
```

## Recurso de ayuda

Te dejamos un post interesante que puede ayudarte a resolver el ejercicio: [Programación orientada a Objetos con JAVA](http://migranitodejava.blogspot.com.ar/2011/06/programacion-orientada-objetos-con-java.html)

## Captura

<p align="center">
    <img src="https://i.imgur.com/9ZZk2L3.png" alt="Consola Intellij">
</p>