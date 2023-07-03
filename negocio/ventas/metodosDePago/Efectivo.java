package tpo.negocio.ventas.metodosDePago;

public class Efectivo implements IMetodoDePago {
  private String metodo;
  private double multiplicador;

  public Efectivo() {
    metodo = "Efectivo";
    multiplicador = 0.9;
  }

  @Override
  public String getMetodo() {
    return metodo;
  }

  @Override
  public double getMultiplicador() {
    return multiplicador;
  }
}
