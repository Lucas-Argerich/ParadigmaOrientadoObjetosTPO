package tpo.negocio.ventas;

import java.util.ArrayList;

public class Venta {
  ArrayList<Detalle> detalles;
  Pago pago;
  float subtotal;
  float precioFinal;

  public Venta() {
    detalles = new ArrayList<Detalle>();
    pago = new Pago();
  }

  private void actualizarPrecios() {
    int suma = 0;
    for (Detalle detalle : detalles) {
      suma += detalle.getSubtotal();
    }
    subtotal = suma;
    precioFinal = pago.calcularPrecioFinal(subtotal);
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
    actualizarPrecios();

  }

  public void bajarDetalle(Detalle detalle) {
    int cantidad = detalle.getCantidad();
    detalle.getProducto().getStock().agregarStock(cantidad);
    detalles.remove(detalle);
    actualizarPrecios();
  }

  public float getSubtotal() {
    return subtotal;
  }

  public float getPrecioFinal() {
    return precioFinal;
  }

  public Pago getPago() {
    return pago;
  }
}