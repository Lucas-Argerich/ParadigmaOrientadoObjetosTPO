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
    for (Producto producto : productos) {

      System.out.println(
          String.format("ID:%d  %12s  $%6s/u  Stock:%d", 
            producto.getCodigo(),
            producto.getDescripcion(),
            producto.getPrecioUnitario(),
            producto.getStock().getStockActual()
          )
        );
    }
  }
}
