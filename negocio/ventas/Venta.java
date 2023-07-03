package tpo.negocio.ventas;

import java.util.ArrayList;

public class Venta {
  ArrayList<Detalle> detalles;
  Pago pago;
  double subtotal;
  double precioFinal;

  public Venta() {
    detalles = new ArrayList<Detalle>();
    pago = new Pago();
  }

  private void actualizarSubtotal() {
    int suma = 0;
    for (Detalle detalle : detalles) {
      suma += detalle.getSubtotal();
    }
    subtotal = suma;
  }

  public void cargarDetalle(Detalle detalle) {
    int cantidad = detalle.getCantidad();
    boolean res = detalle.getProducto().getStock().bajarStock(cantidad);
    if (!res) {
      System.out.println(
          "No hay stock suficiente. No se agrega '" +
              detalle.getCantidad() + " " +
              detalle.getProducto().getDescripcion() +
              "' a la Venta.");
      return;
    }
    detalles.add(detalle);
    actualizarSubtotal();
  }

  public void bajarDetalle(Detalle detalle) {
    int cantidad = detalle.getCantidad();
    detalle.getProducto().getStock().agregarStock(cantidad);
    detalles.remove(detalle);
    actualizarSubtotal();
  }

  public double getSubtotal() {
    return subtotal;
  }

  public double getPrecioFinal() {
    return precioFinal;
  }

  public Pago getPago() {
    return pago;
  }
}