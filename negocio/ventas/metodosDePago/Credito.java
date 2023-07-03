package tpo.negocio.ventas.metodosDePago;

import java.util.HashMap;

public class Credito implements IMetodoDePago {
  private String metodo;
  private float multiplicador;
  private HashMap<Integer, Float> cuotasAdmitidas;
  private int cuotas;

  public Credito() {
    metodo = "Credito";
    cuotasAdmitidas = new HashMap<Integer, Float>();
    cuotasAdmitidas.put(2, 1.06f);
    cuotasAdmitidas.put(3, 1.12f);
    cuotasAdmitidas.put(6, 1.2f);
  }

  public void setCuotas(int cuotas) {
    if(!cuotasAdmitidas.containsKey(cuotas)) {
      throw new Error("ERROR: Numero de Cuotas no admitido.");
    }
    this.cuotas = cuotas;
    multiplicador = cuotasAdmitidas.get(cuotas);
  }

  public int getCuotas() {
    return cuotas;
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
