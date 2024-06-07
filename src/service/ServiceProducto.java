package service;

import entidades.Bebida;
import entidades.Producto;
import entidades.Toxico;
import entidades.Verduleria;

import java.util.Collections;
import java.util.List;

public class ServiceProducto {

    public void cargarLista(List<Producto> listaProductos){

        listaProductos.add(new Bebida("Coca-Cola Zero", 20, 1.5f));
        listaProductos.add(new Bebida("Coca-Cola", 18, 1.5f));
        listaProductos.add(new Toxico("Shampoo Sedal", 19, 500));
        listaProductos.add(new Verduleria("Frutillas", 64, "kilo"));

    }

    public Producto MasCaro(List<Producto> listaProductos){

        Collections.sort(listaProductos);
        return  listaProductos.get(listaProductos.size()-1);

    }

    public Producto masBarato(List<Producto> listaProductos){

        Collections.sort(listaProductos);
        return listaProductos.get(0);

    }

    public  void mostrarLista(List<Producto> listaProductos){

        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }

    }

}
