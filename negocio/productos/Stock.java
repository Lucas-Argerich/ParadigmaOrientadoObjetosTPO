package tpo.negocio.productos;

public class Stock {
  private int stockActual;
  private int stockMinimo;
  private Producto producto;

  public Stock(Producto producto) {
    stockActual = 0;
    stockMinimo = 0;
    this.producto = producto;
  }
  
  private void alertarStock() {
    System.out.println("ALERTA!: El Stock retirado de '" + producto.getDescripcion() + "' a caido bajo su minimo de " + stockMinimo + "!");
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

  public void agregarStock(int num) {
    stockActual += num;
  }

  public boolean bajarStock(int num) {
    if(!hayStockSuficiente(num)) {
      return false;
    }
    stockActual -= num;
    return true;
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
