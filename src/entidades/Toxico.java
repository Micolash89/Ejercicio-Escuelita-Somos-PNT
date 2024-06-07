package entidades;

public final class Toxico extends Producto {

    private Integer contenido;

    public Toxico(String nombre, Integer precio, Integer contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " +"Contenido: " + contenido +"ml /// "+ "Precio: $" + precio;
    }

}
