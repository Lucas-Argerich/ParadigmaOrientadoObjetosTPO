package tpo.run;
import java.util.Random;

import tpo.negocio.productos.Catalogo;
import tpo.negocio.productos.Producto;

public class Run {
  static Random rand = new Random();
  public static void main(String[] args) {

    Catalogo catalogo = new Catalogo();
    
    Producto p1 = new Producto(generateCodigo());
    p1.setDescripcion("Producto 1");
    p1.setPrecioUnitario(11);
    p1.getStock().agregarStock(100);
    p1.getStock().setStockMinimo(20);
    
    catalogo.cargarProducto(p1);

    Producto p2 = new Producto(generateCodigo());
    p2.setDescripcion("Producto 2");
    p2.setPrecioUnitario(15);
    p2.getStock().agregarStock(50);
    p2.getStock().setStockMinimo(10);

    catalogo.cargarProducto(p2);

    Producto p3 = new Producto(generateCodigo());
    p3.setDescripcion("Producto 3");
    p3.setPrecioUnitario(20);
    p3.getStock().agregarStock(200);
    p3.getStock().setStockMinimo(30);

    catalogo.cargarProducto(p3);

    catalogo.listado();


  }
  private static int generateCodigo() {
    return rand.nextInt(90000) + 10000;
    //devuelve codigo entre 10000 y 99999
  }
}
