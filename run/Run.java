package tpo.run;

import java.util.Random;

import tpo.negocio.ventas.Detalle;
import tpo.negocio.productos.Catalogo;
import tpo.negocio.productos.Producto;
import tpo.negocio.ventas.Venta;

public class Run {
  static Random rand = new Random();

  public static void main(String[] args) {

    Catalogo catalogo = new Catalogo();

    Producto p1 = new Producto(generateCodigo());
    p1.setDescripcion("Camiseta");
    p1.setPrecioUnitario(25);
    p1.getStock().agregarStock(50);
    p1.getStock().setStockMinimo(10);
    catalogo.cargarProducto(p1);

    Producto p2 = new Producto(generateCodigo());
    p2.setDescripcion("Pantalón");
    p2.setPrecioUnitario(40);
    p2.getStock().agregarStock(30);
    p2.getStock().setStockMinimo(5);
    catalogo.cargarProducto(p2);

    Producto p3 = new Producto(generateCodigo());
    p3.setDescripcion("Zapatos");
    p3.setPrecioUnitario(60);
    p3.getStock().agregarStock(20);
    p3.getStock().setStockMinimo(3);
    catalogo.cargarProducto(p3);

    Producto p4 = new Producto(generateCodigo());
    p4.setDescripcion("Bolso");
    p4.setPrecioUnitario(35);
    p4.getStock().agregarStock(15);
    p4.getStock().setStockMinimo(2);
    catalogo.cargarProducto(p4);

    Producto p5 = new Producto(generateCodigo());
    p5.setDescripcion("Reloj");
    p5.setPrecioUnitario(100);
    p5.getStock().agregarStock(10);
    p5.getStock().setStockMinimo(1);
    catalogo.cargarProducto(p5);

    Producto p6 = new Producto(generateCodigo());
    p6.setDescripcion("Gafas de sol");
    p6.setPrecioUnitario(50);
    p6.getStock().agregarStock(25);
    p6.getStock().setStockMinimo(5);
    catalogo.cargarProducto(p6);

    Producto p7 = new Producto(generateCodigo());
    p7.setDescripcion("Sombrero");
    p7.setPrecioUnitario(20);
    p7.getStock().agregarStock(40);
    p7.getStock().setStockMinimo(8);
    catalogo.cargarProducto(p7);

    Producto p8 = new Producto(generateCodigo());
    p8.setDescripcion("Bufanda");
    p8.setPrecioUnitario(15);
    p8.getStock().agregarStock(60);
    p8.getStock().setStockMinimo(12);
    catalogo.cargarProducto(p8);

    Producto p9 = new Producto(generateCodigo());
    p9.setDescripcion("Billetera");
    p9.setPrecioUnitario(30);
    p9.getStock().agregarStock(18);
    p9.getStock().setStockMinimo(4);
    catalogo.cargarProducto(p9);

    Producto p10 = new Producto(generateCodigo());
    p10.setDescripcion("Cinturón");
    p10.setPrecioUnitario(18);
    p10.getStock().agregarStock(22);
    p10.getStock().setStockMinimo(6);
    catalogo.cargarProducto(p10);


    Venta venta = new Venta();
    
    Detalle d1 = new Detalle(p2);
    d1.setCantidad(30);
    venta.cargarDetalle(d1);
    venta.bajarDetalle(d1);
    
    catalogo.listado();
  }

  private static int generateCodigo() {
    return rand.nextInt(90000) + 10000;
    // devuelve codigo entre 10000 y 99999
  }
}
