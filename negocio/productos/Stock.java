package tpo.negocio.productos;

public class Stock {
  private int stockActual;
  private int stockMinimo;

  public Stock() {
    stockActual = 0;
    stockMinimo = 0;
  }

  private boolean hayStockSuficiente(int num) {
    if(stockActual < num) {
      return false;
    }
    if(stockActual - num < stockMinimo) {
      alertarStock();
    }
    return true;
  }

  private void alertarStock() {
    System.out.println("ALERTA!: El Stock retirado a caido bajo su minimo de " + stockMinimo);
  }

  public void agregarStock(int num) {
    stockActual += num;
  }

  public void bajarStock(int num) {
    if(!hayStockSuficiente(num)) {
      System.out.println("No hay Stock suficiente");
      return;
    }
    stockActual -= num;
  }

  public int getStockActual() {
    return stockActual;
  }

  public void setStockMinimo(int stockMinimo) {
    this.stockMinimo = stockMinimo;
  }

  public int getStockMinimo() {
    return stockMinimo;
  }
}
