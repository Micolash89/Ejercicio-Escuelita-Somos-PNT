import entidades.Producto;
import service.ServiceProducto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ServiceProducto serviceProducto = new ServiceProducto();
        List<Producto> productos = new ArrayList<>();

        serviceProducto.cargarLista(productos);

        serviceProducto.mostrarLista(productos);

        System.out.println("=============================================================");

        System.out.println("Producto más caro: " + serviceProducto.MasCaro(productos).getNombre());
        System.out.println("Producto más barato: " + serviceProducto.masBarato(productos).getNombre());


    }
}