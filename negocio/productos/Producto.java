package TPO.negocio.productos;

public class Producto {
  private int codigo;
  private String descripcion;
  private double precioUnitario;
  private int stockActual;
  private int stockMinimo;
  
  public Producto(int codigo, String descripcion, double precioUnitario, int stockActual, int stockMinimo) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioUnitario = precioUnitario;
    this.stockActual = stockActual;
    this.stockMinimo = stockMinimo;
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  
  public double getPrecioUnitario() {
    return precioUnitario;
  }

  public int getStockActual() {
    return stockActual;
  }

  public int getStockMinimo() {
    return stockMinimo;
  }
}
