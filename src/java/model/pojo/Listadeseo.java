package model.pojo;
// Generated 5/11/2015 05:15:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Listadeseo generated by hbm2java
 */
public class Listadeseo  implements java.io.Serializable {


     private int idListaDeseo;
     private Cliente cliente;
     private Producto producto;
     private Date fecha;

    public Listadeseo() {
    }

	
    public Listadeseo(int idListaDeseo, Cliente cliente, Producto producto) {
        this.idListaDeseo = idListaDeseo;
        this.cliente = cliente;
        this.producto = producto;
    }
    public Listadeseo(int idListaDeseo, Cliente cliente, Producto producto, Date fecha) {
       this.idListaDeseo = idListaDeseo;
       this.cliente = cliente;
       this.producto = producto;
       this.fecha = fecha;
    }
   
    public int getIdListaDeseo() {
        return this.idListaDeseo;
    }
    
    public void setIdListaDeseo(int idListaDeseo) {
        this.idListaDeseo = idListaDeseo;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


