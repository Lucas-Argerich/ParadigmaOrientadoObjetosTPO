package tpo.run;

import tpo.negocio.productos.Producto;

public class Run {
  public static void main(String[] args) {
    Producto lapisRojos = new Producto(0, "Lapis Rojo", 45, 10000, 200);
    Producto lapisAzul = new Producto(1, "Lapis Azul", 45, 10000, 200);
    Producto lapicera = new Producto(2, "Lapicera", 80, 6000, 100);    

    imprimirProducto(lapicera);
  }

  private static void imprimirProducto(Producto prod) {
    System.out.println("________________");
    System.out.println("Codigo: " + prod.getCodigo());
    System.out.println("Producto: " + prod.getDescripcion());
    System.out.println("Precio Unitario: " + prod.getPrecioUnitario());
    System.out.println("Stock: " + prod.getStockActual());
  }
}
