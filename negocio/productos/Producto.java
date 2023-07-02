package tpo.negocio.productos;

public class Producto {
  private int codigo;
  private String descripcion;
  private double precioUnitario;
  private Stock stock;
  
  public Producto(int codigo) {
    this.codigo = codigo;
    this.stock = new Stock();
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setPrecioUnitario(double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }
  
  public double getPrecioUnitario() {
    return precioUnitario;
  }

  public Stock getStock() {
    return stock;
  }
}
