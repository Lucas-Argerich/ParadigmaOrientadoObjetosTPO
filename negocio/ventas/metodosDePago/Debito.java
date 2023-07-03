package tpo.negocio.ventas.metodosDePago;

public class Debito implements IMetodoDePago {
  private String metodo;
  private double multiplicador;

  public Debito() {
    metodo = "Debito";
    multiplicador = 1.0;
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
