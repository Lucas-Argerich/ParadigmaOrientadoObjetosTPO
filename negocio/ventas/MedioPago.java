package tpo.negocio.ventas;

public class MedioPago {
  private String metodoDePago;
  private int cuotas;
  private double recargo;

  public MedioPago(String metodoDePago, int cuotas, double recargo) {
    this.metodoDePago = metodoDePago;
    this.cuotas = cuotas;
    this.recargo = recargo;
  }

  public String getMetodoDePago() {
    return metodoDePago;
  }

  public int getCuotas() {
    return cuotas;
  }

  public double recargo() {
    return recargo;
  }
}
