package tpo.negocio.ventas.metodosDePago;

public class Debito implements IMetodoDePago {
  private String metodo;
  private float multiplicador;

  public Debito() {
    metodo = "Debito";
    multiplicador = 1.0f;
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
