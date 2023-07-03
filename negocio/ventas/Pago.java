package tpo.negocio.ventas;

import tpo.negocio.ventas.metodosDePago.IMetodoDePago;

public class Pago {
  private IMetodoDePago metodoDePago;

  public void setMetodoDePago(IMetodoDePago metodoDePago) {
    this.metodoDePago = metodoDePago;
  }

  public IMetodoDePago getMetodoDePago() {
    return metodoDePago;
  }

  public float calcularPrecioFinal(float subtotal) {
    return subtotal * metodoDePago.getMultiplicador();
  }
}
