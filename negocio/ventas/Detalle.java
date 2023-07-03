package tpo.negocio.ventas;

import tpo.negocio.productos.Producto;

public class Detalle {
  private Producto producto;
  private int cantidad;
  private float subtotal;

  public Detalle(Producto producto) {
    this.producto = producto;
    actualizarSubtotal();
  }

  private void actualizarSubtotal() {
    subtotal = producto.getPrecioUnitario() * cantidad;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
    actualizarSubtotal();
  }

  public int getCantidad() {
    return cantidad;
  }

  public float getSubtotal() {
    return subtotal;
  }
}
