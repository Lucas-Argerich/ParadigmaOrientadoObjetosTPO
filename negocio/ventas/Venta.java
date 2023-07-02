package tpo.negocio.ventas;

import java.util.ArrayList;

import negocio.Detalle;

public class Venta {
  ArrayList<Detalle> detalles = new ArrayList<>();
  MedioPago medioDePago;

  public Venta(MedioPago medioDePago) {
    this.medioDePago = medioDePago;
  }

  public void agregarDetalle(Detalle detalle) {
    detalles.add(detalle);
  }
  
  public void quitarDetalle(Detalle detalle) {
    detalles.remove(detalle);
  }
}
