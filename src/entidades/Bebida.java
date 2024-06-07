package entidades;

public final class Bebida extends Producto{

    public Float litros;

    public Bebida(String nombre, Integer precio, Float litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " + "Litros: " + litros +" /// "+ "Precio: $" + precio;
    }
}
