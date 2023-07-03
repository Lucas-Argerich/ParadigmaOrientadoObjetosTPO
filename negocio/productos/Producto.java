package tpo.negocio.productos;

public class Producto {
  private int codigo;
  private String descripcion;
  private float precioUnitario;
  private Stock stock;
  
  public Producto(int codigo) {
    this.codigo = codigo;
    this.stock = new Stock(this);
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

  public void setPrecioUnitario(float precioUnitario) {
    this.precioUnitario = precioUnitario;
  }
  
  public float getPrecioUnitario() {
    return precioUnitario;
  }

  public Stock getStock() {
    return stock;
  }
}
