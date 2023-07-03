package tpo.negocio.ventas.metodosDePago;

import java.util.HashMap;

public class Credito implements IMetodoDePago {
  private String metodo;
  private double multiplicador;
  private HashMap<Integer, Double> cuotasAdmitidas;
  private int cuotas;

  public Credito() {
    metodo = "Credito";
    cuotasAdmitidas = new HashMap<Integer, Double>();
    cuotasAdmitidas.put(2, 1.06);
    cuotasAdmitidas.put(3, 1.12);
    cuotasAdmitidas.put(6, 1.2);
  }

  public void setCuotas(int cuotas) {
    if(!cuotasAdmitidas.containsKey(cuotas)) {
      System.out.println("Numero de Cuotas no admitido.");
      return;
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
  public double getMultiplicador() {
    return multiplicador;    
  }
}
