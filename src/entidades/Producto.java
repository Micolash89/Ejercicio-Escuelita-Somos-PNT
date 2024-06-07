package entidades;

public class Producto implements Comparable<Producto> {

    protected String  nombre;
    protected Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto o) {
        return  this.precio.compareTo(o.getPrecio());
    }

}
