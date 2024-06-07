package entidades;
import enums.UnidadVerduleria;

public final class Verduleria extends Producto{

   private UnidadVerduleria unidad;


   public Verduleria(String nombre, Integer precio, String unidad) {
      super(nombre, precio);
      this.unidad = UnidadVerduleria.get(unidad);
   }

   @Override
   public String toString() {
      return "Nombre: " + nombre + " /// " + "Precio: $" + precio +" /// "+ "Unidad de Venta: " + unidad.toString();
   }
}
