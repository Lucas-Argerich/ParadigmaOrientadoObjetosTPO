package tpo.negocio.ventas.metodosDePago;

public class Efectivo implements IMetodoDePago {
  private String metodo;
  private float multiplicador;

  public Efectivo() {
    metodo = "Efectivo";
    multiplicador = 0.9f;
  }

  @Override
  public String getMetodo() {
    return metodo;
  }

  @Override
  public float getMultiplicador() {
    return multiplicador;
  }
}
