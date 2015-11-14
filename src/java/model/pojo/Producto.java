package model.pojo;
// Generated 5/11/2015 05:15:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private Categoria categoria;
     private String nombre;
     private Double precio;
     private Integer stock;
     private String descripcion;
     private String foto;
     private Set listadeseos = new HashSet(0);
     private Set detallepedidos = new HashSet(0);

    public Producto() {
    }

	
    public Producto(Categoria categoria) {
        this.categoria = categoria;
    }
    public Producto(Categoria categoria, String nombre, Double precio, Integer stock, String descripcion, String foto, Set listadeseos, Set detallepedidos) {
       this.categoria = categoria;
       this.nombre = nombre;
       this.precio = precio;
       this.stock = stock;
       this.descripcion = descripcion;
       this.foto = foto;
       this.listadeseos = listadeseos;
       this.detallepedidos = detallepedidos;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Set getListadeseos() {
        return this.listadeseos;
    }
    
    public void setListadeseos(Set listadeseos) {
        this.listadeseos = listadeseos;
    }
    public Set getDetallepedidos() {
        return this.detallepedidos;
    }
    
    public void setDetallepedidos(Set detallepedidos) {
        this.detallepedidos = detallepedidos;
    }




}


