/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.pojo.Categoria;
import model.pojo.Producto;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gino
 */
public class LogocareDAO {
    
   public static List<Categoria> getCategorias()
   {
       
       List<Categoria> lista=null;
       try {
           Session sesion=HibernateUtil.getSessionFactory().openSession();
           String hql="from Categoria";
           Query query=sesion.createQuery(hql);
           lista=query.list();
           sesion.close();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return lista;
   }
   public static List<Producto> getProductos(int categoria)
   {
       List<Producto> lista=null;
        try {
           Session sesion=HibernateUtil.getSessionFactory().openSession();
           String hql="from Producto p where p.categoria.idCategoria  = :pro_categoria  ";
           Query query=sesion.createQuery(hql);
           query.setParameter("pro_categoria", categoria);	
           lista=query.list();
           sesion.close();
       }
       catch(Exception e){
           e.printStackTrace();
       }

       return lista;
   }
   
   public static Producto getProductoDetalle(int idProducto) {
       
       Producto p = null;
       
       try {
           
           Session sesion=HibernateUtil.getSessionFactory().openSession();
           p = (Producto)sesion.get(Producto.class, idProducto);
      
           sesion.close();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
       
       return p;
   }
}
