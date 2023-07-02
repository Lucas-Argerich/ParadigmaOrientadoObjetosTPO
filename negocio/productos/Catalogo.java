package tpo.negocio.productos;

import java.util.ArrayList;

public class Catalogo {
  private int codigo;
  private String nombre;
  private ArrayList<Producto> productos = new ArrayList<>();

  public Catalogo(int codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void agregarProducto(Producto producto) {
    productos.add(producto);
  }

  public void quitarProducto(Producto producto) {
    productos.remove(producto);
  }

  public ArrayList<Producto> listado() {
    return productos;
  }
}
