package tpo.negocio.productos;

import java.util.ArrayList;

public class Catalogo {
  private ArrayList<Producto> productos;
  
  public Catalogo() {
    productos = new ArrayList<Producto>();
  }

  public void cargarProducto(Producto producto) {
    productos.add(producto);
  }

  public void bajarProducto(Producto producto) {
    productos.remove(producto);
  }

  public void listado() {
    for(Producto producto : productos) {
      System.out.println(
      "ID: " + producto.getCodigo() + 
      ", " + producto.getDescripcion() +
      ", $" + producto.getPrecioUnitario() + "/u" +
      ", Stock: " + producto.getStock().getStockActual());
    }
  }
}
