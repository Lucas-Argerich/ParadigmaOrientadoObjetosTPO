package TPO.negocio.ventas;

import TPO.negocio.productos.Producto;

public class Detalle {
  private int codigo;
  private Producto producto;
  private int cantidad;
  private double subtotal;

  public Detalle(int codigo, Producto producto, int cantidad, int subtotal) {
    this.codigo = codigo;
    this.producto = producto;
    this.cantidad = cantidad;
    this.subtotal = producto.getPrecioUnitario() * cantidad;
  }

  public int getCodigo() {
    return codigo;
  }

  public Producto getProducto() {
    return producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public double getSubtotal() {
    return subtotal;
  }
}
